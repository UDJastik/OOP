package com.company.Menu;

import com.company.Archive;
import com.company.Data.Book;
import com.company.Data.Journal;
import com.company.Data.TextBook;
import com.company.Data.PrintEdition;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Archive arc = new Archive();
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
	mainMenu();
    }
    public static void mainMenu(){
        int a = 0;
        do{
            System.out.println("               Главное меню               ");
            System.out.println("------------------------------------------");
            System.out.println("|1 - Добавить печатное издание в архив   |");
            System.out.println("|2 - Просмотреть архив                   |");
            System.out.println("|3 - Удалить                             |");
            System.out.println("|4 - Поиск                               |");
            System.out.println("|5 - Выход                               |");
            System.out.println("------------------------------------------");

            try {
                a = Integer.parseInt(in.nextLine());
                if (a < 1 || a > 5) throw new IllegalArgumentException();
            } catch (IllegalArgumentException e){
                System.err.println("Ошибка ввода, вы можете ввести только 1, 2, 3, 4 или 5");
                System.err.println("Попробуйте снова");
            }

            switch (a){
                case 1:
                    mainAdd();
                    break;
                case 2:
                    lookData();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    search();
                    break;
            }

        }while(a != 5);
        System.out.println("Конец программы");
    }
    public static void lookData(){
        arc.lookAll();
    }

    public static void mainAdd(){
        int s=0;
            do {
                System.out.println("       Добавить в архив    ");
                System.out.println("---------------------------");
                System.out.println("|1 - Книга                |");
                System.out.println("|2 - Учебник              |");
                System.out.println("|3 - Журнал               |");
                System.out.println("|4 - Выход в главное меню |");
                System.out.println("---------------------------");

                try {
                    s = Integer.parseInt(in.nextLine());
                    if (s < 1 || s > 4) throw new IllegalArgumentException();
                } catch (IllegalArgumentException e) {
                    System.err.println("Ошибка ввода, вы можете ввести только 1, 2, 3 или 4");
                }
            String genre, name, nameBook;
            int edition;

            switch (s){
                case 1:
                    System.out.print("Название книги: ");
                    nameBook = in.nextLine();

                    System.out.print("Имя автора: ");
                    name = in.nextLine();

                    System.out.print("Жанр: ");
                    genre = in.nextLine();

                    Book book = new Book(genre, name, nameBook);
                    arc.addPe(book);
                    break;
                case 2:
                    System.out.print("Название учебника: ");
                    nameBook = in.nextLine();

                    System.out.print("Имя автора: ");
                    name = in.nextLine();

                    System.out.print("Жанр: ");
                    genre = in.nextLine();

                    TextBook textbook = new TextBook(genre, name, nameBook);
                    arc.addPe(textbook);
                    break;
                case 3:
                    System.out.print("Название журнала: ");
                    nameBook = in.nextLine();

                    System.out.print("Имя автора: ");
                    name = in.nextLine();

                    System.out.print("Жанр: ");
                    genre = in.nextLine();


                    System.out.print("Номер издания: ");
                    try {
                        edition = in.nextInt();
                    } catch (InputMismatchException e){
                        System.err.println("Номер издания не может быть словом");
                        edition = 0;
                    }
                    in.nextLine();
                    Journal journal = new Journal(edition, genre, name, nameBook);
                    arc.addPe(journal);
                    break;
            }
            }while (s!=4);
    }

    public static void search(){

        int b = 0;
        do {
            System.out.println("                Поиск               ");
            System.out.println("-------------------------------------");
            System.out.println("|1 - По жанрам                      |");
            System.out.println("|2 - Вывод имеющихся книг           |");
            System.out.println("|3 - Вывод имеющихся учебников      |");
            System.out.println("|4 - Вывод имеющихся журналов       |");
            System.out.println("|5 - Поиск по названию              |");
            System.out.println("|6 - Вернуться в главное меню       |");
            System.out.println("-------------------------------------");

            try {
                b = Integer.parseInt(in.nextLine());
                if (b < 1 || b > 6) throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.err.println("Ошибка ввода, вы можете ввести только 1, 2, 3, 4, 5 или 6");
            }

            switch (b) {
                case 1:
                    System.out.print("Введите жанр:");
                    String h = in.nextLine();
                    ArrayList<PrintEdition> found = arc.search(h);
                    if (found.isEmpty()) {
                        System.err.println("Печатных изданий с данным жанром не найдено");
                    }
                    else {
                        for (PrintEdition a: found) {
                            a.look();
                        }
                    }
                    break;

                case 2:
                    System.out.println("Все имеющиеся  книги:");
                    ArrayList<Book> find = arc.getAllBooks();
                    if (find.isEmpty()){
                        System.err.println("Ни одной книги не найдено");
                    } else {
                        for (PrintEdition r : find) {
                            r.look();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Все имеющиеся учебники:");
                    ArrayList<TextBook> finde = arc.getAllTextBook();
                    if (finde.isEmpty()){
                        System.err.println("Ни одного учебника не найдено");
                    } else {
                        for (PrintEdition r : finde) {
                            r.look();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Все имеющиеся журналы:");
                    ArrayList<Journal> fin = arc.getAllJournal();
                    if (fin.isEmpty()){
                        System.err.println("Ни одного учебника не найдено");
                    } else {
                        for (PrintEdition r : fin) {
                            r.look();
                        }
                    }
                    break;
                case 5:
                    System.out.print("Введите название:");
                    String q = in.nextLine();
                    ArrayList<PrintEdition> f = arc.searchNameBook(q);
                    if (f.isEmpty()){
                        System.err.println("Печатных изданий с данным названием не найдено");
                    } else {
                        for (PrintEdition a : f) {
                            a.look();
                        }
                    }
                    break;
            }
        }while (b != 6);
    }

    public static void delete(){

        int n;
        String[] PeNames = arc.getPeName();
        do {
            System.out.println("Удаление");
            System.out.println("Выберите какое печатное издание удалить");

            for (int i = 0; i < PeNames.length; i++) {
                System.out.println(i + " )" + PeNames[i]);
            }
            n = Integer.parseInt(in.nextLine());

        }while(n < 0 || n > PeNames.length);

        arc.delPe(arc.getPeList().get(n));
    }
}
