package com.company;

public class TaskC {
    private static String[] words;
    public TaskC(String Words){
        Split(Words);
        Output();
    }
    public static void Split(String C) {

        words = C.split(" "); //Разделение строки в массив слов через пробел
    }
    public static void Output() {
        for (int i = 1; i < words.length; i += 2) System.out.print(words[i] + " ");
    }
}
