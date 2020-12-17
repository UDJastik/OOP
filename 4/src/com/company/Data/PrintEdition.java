package com.company.Data;

public abstract class PrintEdition {
    private String genre;
    private String name;
    private String nameBook;


    public PrintEdition(String genre, String name, String nameBook){
        this.genre = genre;
        this.name = name;
        this.nameBook = nameBook;
    }

    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getName(){ return name; }
    public void setName(String name){
        this.name = name;
    }

    public String getNameBook(){
        return nameBook;
    }
    public void setNameBook(String nameBook){
        this.nameBook = nameBook;
    }
    public abstract void look();
}
