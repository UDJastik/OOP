package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите букву выполняемого задания (A,B,C): ");
        String trigger = in.next();
        int n;
        switch (trigger) {
            //a
            case "A": {
                System.out.println("Задание А. Дан массив чисел. Необходимо упорядочить его по убыванию.\n" + "Введите кол-во значений массива ");
                n = in.nextInt();
                TaskA A = new TaskA();
                A.Input(n);
                A.Sort(n);
                A.Output(n);
                break;
            }

            //b
            case "B": {
                System.out.println("Задание B. Отсортируйте слова в массиве по алфавиту.\n" + "Введите кол-во слов в массиве: ");
                n = in.nextInt();
                TaskB B = new TaskB();
                B.Input(n);
                B.Sort(n);
                B.Output(n);
                break;
            }

            //c
            case "C": {
                System.out.println("Задание C. Выберите из предложения все слова, которые имеют четный порядковый номер. \nВведите предложение: ");
                String C;
                C = in.nextLine(); //для работы следующего nextLine
                C = in.nextLine();
                String[] words;
                words = C.split(" "); //Разделение строки в массив слов через пробел
                for (int i = 1; i < words.length; i += 2) System.out.print(words[i] + " ");
                break;
            }
        }
    }
}
