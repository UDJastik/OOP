package com.company.Data;

public class Journal extends PrintEdition {

    private int Edition;
    public Journal(int edition, String genre, String name, String nameBook) {
        super(genre, name, nameBook);
        this.Edition = edition;
    }

    public int getEdition() { return Edition; }
    public void setEdition (int Edition) { this.Edition = Edition; }

    public void look(){
        System.out.println();
        System.out.println("Название: " + getNameBook());
        System.out.println("Номер издания: " + getEdition());
        System.out.println("Имя автора: " + getName());
        System.out.println("Жанр: " + getGenre());
        System.out.println();
    }
}
