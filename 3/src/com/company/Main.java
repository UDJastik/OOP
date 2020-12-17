package com.company;
import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        MainMenu();
    }
    public static void MainMenu(){
        int menu = 0;
        do {
            System.out.println("            Меню            ");
            System.out.println("----------------------------");
            System.out.println("| 1 - Работа с файлами     |");
            System.out.println("| 2 - Задания              |");
            System.out.println("| 3 - Выход                |");
            System.out.println("----------------------------");
            System.out.print("Введите: ");

            try{
                menu = Integer.parseInt(in.nextLine());
                if (menu < 1 || menu > 3) throw new IllegalArgumentException();
            }catch (IllegalArgumentException e){
                System.out.println("Ошибка ввода, введите 1,2 или 3");
            }

            switch (menu) {
                case 1: File.work();
                case 2: Tasks.tasksFile();
            }
        } while(menu != 3);
        System.out.println("Конец программы");
    }
}