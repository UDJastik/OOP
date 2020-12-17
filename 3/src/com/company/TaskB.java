package com.company;

import java.util.Scanner;

public class TaskB {
    private String[] Words;
    public TaskB(int Size) {
        Words = new String[Size];
    }
    public void Input() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < Words.length; i++) {
            Words[i] = in.next();
        }
    }

    public void Sort() {
        String Z;
        for (int i = 0; i < Words.length; i++) {
            for (int j = 0; j < Words.length - 1; j++) {
                if (Words[j].charAt(0) > Words[j + 1].charAt(0)) {
                    Z = Words[j];
                    Words[j] = Words[j + 1];
                    Words[j + 1] = Z;
                }
            }
        }
    }

    public void Output() {
        System.out.println("Отсортированные слова:");
        for (int i = 0; i < Words.length; i++) System.out.print(Words[i] + " ");
    }
}
