package com.company;


import javax.swing.*;

public class TaskA {
    private String text;
    String Words;
    String out;

    public TaskA(){
        this.text = "1 0 -1 2 3 55";
    }

    public TaskA(String text){
        this.text = text;
    }

    private int[] Parse(String a) {
            String[] str = a.split(" ");
            System.out.println(str.length);
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            System.out.println(i);
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    private String Sort(int[] digit){
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
        Words = "";
        for (int i = 0; i < digit.length; i++){
            Words += digit[i] + " ";
        }
        return Words;
    }
    public String getTaskA(){
        try {
            int[] digit = Parse(text);
            out = Sort(digit);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Встречена строка, а ожидалось число");
            out = "";
        } return out;
    }
}