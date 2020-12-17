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
                System.out.println("Задание А. Дан массив чисел. Необходимо упорядочить его по убыванию.\n" + "Введите кол-во чисел в массиве: ");
                int tmp = 0;
                n = in.nextInt();
                int[] A = new int[n];
                System.out.println("Введите значения массива:");
                for (int i = 0; i < n; i++) {
                    A[i] = in.nextInt();
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - 1; j++) {
                        if (A[j] < A[j + 1]) {
                            tmp = A[j];
                            A[j] = A[j + 1];
                            A[j + 1] = tmp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(A[i] + " ");
                }
                break;
            }

            //b
            case "B": {
                String Z;
                System.out.println("Задание B. Отсортируйте слова в массиве по алфавиту.\n" + "Введите кол-во слов в массиве: ");
                n = in.nextInt();
                String[] B = new String[n];
                for (int i = 0; i < n; i++) {
                    B[i] = in.next();
                }
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - 1; j++) {
                        if (B[j].charAt(0) > B[j + 1].charAt(0)) {
                            Z = B[j];
                            B[j] = B[j + 1];
                            B[j + 1] = Z;
                        }
                    }
                }
                System.out.println("Отсортированные слова:");
                for (int i = 0; i < n; i++) System.out.print(B[i] + " ");
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
