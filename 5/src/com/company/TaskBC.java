package com.company;

import java.lang.String;

public class TaskBC {
    private String text;
    String Z;
    String WordsB;
    String WordsC;
    String[] str;
    String out;

    public TaskBC() {
        this.text = "one two";
    }

    public TaskBC(String text) {
        this.text = text;
    }

    private String Split(String C) {
        WordsC = "";
        String[] words = C.split(" "); //Разделяем строку на слова
        for (int i = 1; i < words.length; i += 2){
            WordsC += words[i] + " ";
        }
        return WordsC;
        }


    public String getTaskC() {
        out = Split(text);
        return out;
    }

    private String Sort(String TaskB) {
         str = TaskB.split(" ");
        System.out.println(str.length);
         for (int i = 0; i < str.length; i++){
            System.out.println(i + ")" + str[i]);
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - 1; j++) {
                if (str[j].charAt(0) > str[j + 1].charAt(0)) {
                    Z = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = Z;
                }
            }
        }
        WordsB = "";
        for (int i = 0; i < str.length; i++){
            WordsB += str[i] + " ";
        }
        return WordsB;
    }

    public String getTaskB(){
        out = Sort(text);
        return out;
    }
}