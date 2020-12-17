package com.company;


import java.io.*;
import java.util.Scanner;

public class WorkFile {
    static String traceback = "";
    public static String getTrace() {
        return traceback;
    }

    public static void setTrace(String traceback) {
        WorkFile.traceback = traceback;
    }
    public WorkFile() {
    }

    public static String loadSFile (String name) throws IOException {
        try {
            File file = new File(name);
            Scanner scanner = new Scanner(file);
            String output = scanner.nextLine();
            scanner.close();
            return output;
        }
        catch(FileNotFoundException e){
            setTrace("Файл с данным именем не найден. Возможно, вы указали имя файла без разрешения. Попробуйте снова");
        }
        return "";
    }

    public static void writeFile(String name, String filename) {
        try {
            String fn = filename + ".txt";
            File file = new File(fn);
            PrintWriter pw = new PrintWriter(file);
            pw.println(name);
            pw.close();
        }catch (FileNotFoundException e) {
            setTrace("Возникла ошибка. Попробуйте снова");
        }
    }

}