package com.company;

import java.util.Scanner;

public class Tasks {
    private static Scanner in = new Scanner(System.in);
    public static void tasksFile(){
        int option = 0;
        do {
            System.out.println();
            System.out.println("                               Задания                                   ");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("|1 - Упорядочить массив чисел по убыванию.                              |");
            System.out.println("|2 - Сортировка слов в массиве по алфавиту.                             |");
            System.out.println("|3 - Выбор из предложения слов, которые имеют четный порядковый номер.  |");
            System.out.println("|4 - Вернуться в главное меню                                           |");
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("Введите: ");

            try{
                option = Integer.parseInt(in.nextLine());
                if(option < 1 || option > 4) throw new IllegalArgumentException();
            }catch (IllegalArgumentException e){
                System.out.println("Ошибка ввода, введите 1,2,3 или 4");
            }

            switch (option) {
                case 1: TaskPick.choiceFile(option);
                case 2: TaskPick.choiceFile(option);
                case 3: TaskPick.choiceFile(option);
            }
        } while (option != 4);
    }
}
