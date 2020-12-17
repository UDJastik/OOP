package com.company;

import java.util.Scanner;

public class TaskA {
    private int[] digit;

    public TaskA(TaskA p) {
    }

    public TaskA() {  //пустой конструктор

    }

    public void Input(int n) {
        digit = new int[n];
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значения массива:");
        for (int i = 0; i < n; i++) {
            digit[i] = in.nextInt();
        }
    }

    public void Sort(int n) {
        int tmp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (digit[j] < digit[j + 1]) {
                    tmp = digit[j];
                    digit[j] = digit[j + 1];
                    digit[j + 1] = tmp;
                }
            }
        }
    }

    public void Copy(TaskA other){ //конструктор копирования
        TaskA p = new TaskA();
        TaskA c = new TaskA(p);
    }
    public void Output(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(digit[i] + " ");
        }
    }
}
