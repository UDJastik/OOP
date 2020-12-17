package com.company.Data;

public class TextBook extends PrintEdition {
    public TextBook(String genre, String name, String nameBook) {
        super(genre, name, nameBook);
    }
    public void look(){
        System.out.println();
        System.out.println("Название: " + getNameBook());
        System.out.println("Имя автора: " + getName());
        System.out.println("Жанр: " + getGenre());
        System.out.println();
    }
}
