package com.company;

import com.company.Data.Book;
import com.company.Data.Journal;
import com.company.Data.PrintEdition;
import com.company.Data.TextBook;

import java.util.ArrayList;

public class Archive {
    ArrayList<PrintEdition> ArcList = new ArrayList<>();

    public void addPe(PrintEdition pe){
        ArcList.add(pe);
    }

    public void delPe(PrintEdition pe){
        ArcList.remove(pe);
    }

    public ArrayList<PrintEdition> getPeList(){
        return ArcList;
    }

    public String[] getPeName(){
        String[] names = new String[ArcList.size()];
        for (int i = 0; i < ArcList.size(); i++){
            names[i] = ArcList.get(i).getName();
        }
        return names;
    }

    public ArrayList<PrintEdition> search(String genre){
        ArrayList<PrintEdition> answer = new ArrayList<>();
        for (PrintEdition a:ArcList) {
            if (a.getGenre().contains(genre)) {
                answer.add(a);
            }
        }
        return answer;
    }

    public ArrayList<Book> getAllBooks(){
        ArrayList<Book> answer = new ArrayList<>();
        for (PrintEdition a:ArcList) {
            if (a instanceof Book) {
                answer.add((Book) a);
            }
        }
        return answer;
    }

    public ArrayList<Journal> getAllJournal(){
        ArrayList<Journal> answer = new ArrayList<>();
        for (PrintEdition a:ArcList) {
            if (a instanceof Journal) {
                answer.add((Journal) a);
            }
        }
        return answer;
    }

    public ArrayList<TextBook> getAllTextBook(){
        ArrayList<TextBook> answer = new ArrayList<>();
        for (PrintEdition a:ArcList) {
            if (a instanceof TextBook) {
                answer.add((TextBook) a);
            }
        }
        return answer;
    }

    public ArrayList<PrintEdition> searchNameBook(String nameBook) {
        ArrayList<PrintEdition> answer = new ArrayList<>();
        for (PrintEdition a : ArcList) {
            if (a.getNameBook().contains(nameBook)) {
                answer.add(a);
            }
        }
        return answer;
    }

    public void lookAll(){
        for (PrintEdition a:ArcList) {
            a.look();
        }
    }
}
