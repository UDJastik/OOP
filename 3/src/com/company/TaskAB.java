package com.company;

public class TaskAB {
    private int[] digit;
    private String[] Words;
    public TaskAB(String string, String choice) {
        String[] str = string.split(" ");
        Words = new String[str.length];
        Words = str;
        switch(choice){
            case "B":
                Sort(choice);
                Output(choice);
                break;
            case "A":
            try {
                this.digit = Parse(string);
                Sort(choice);
                Output(choice);
            } catch (NumberFormatException e) {
                System.err.println("Ошибка ввода - ожидалось число");
            }
            break;
        }
    }
    public TaskAB(){
    }

    private static int[] Parse(String string) {
        String[] str = string.split(" ");
        int size = str.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    public void Sort(String Task) {
        switch (Task) {
            case "A":
            int tmp;
            for (int i = 0; i < digit.length; i++) {
                for (int j = 0; j < digit.length - 1; j++) {
                    if (digit[j] < digit[j + 1]) {
                        tmp = digit[j];
                        digit[j] = digit[j + 1];
                        digit[j + 1] = tmp;
                    }
                }
            }
            break;
            case "B":
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
                break;
        }
    }

    public TaskAB(TaskAB other){  //конструктор копирования
        System.out.println("Скопированный массив:");
        this.digit = other.digit;
        }

    public void Output(String Task) {
        switch(Task) {
            case "A":
                System.out.println("Отсортированные числа:");
                for (int i = 0; i < digit.length; i++) System.out.print(digit[i] + " ");
                break;
            case "B":
                System.out.println("Отсортированные слова:");
                 System.out.print(Words[i] + " ");
                break;
        }
    }
}