package com.company;

import java.util.Scanner;

public class TaskB {
    private String[] B;

    public void Input(int n) {
        B = new String[n];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            B[i] = in.next();
        }
    }

    public void Sort(int n) {
        String Z;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (B[j].charAt(0) > B[j + 1].charAt(0)) {
                    Z = B[j];
                    B[j] = B[j + 1];
                    B[j + 1] = Z;
                }
            }
        }
    }

    public void Output(int n) {
        System.out.println("Отсортированные слова:");
        for (int i = 0; i < n; i++) System.out.print(B[i] + " ");
    }
}
