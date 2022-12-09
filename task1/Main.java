package ru.makhmutov.lab.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String PATH = "week15/src/ru/makhmutov/files/serialized.dat";

    /**
     * This program creates list of books, serializes it
     * and then deserializes it
     *
     * @param args Array with parameters of the program
     */
    public static void main(String[] args) {
        List<Book> books = getBookList();
//        serializeBooks(books);
        deserializeBooks(books);
    }

    private static void serializeBooks(List<Book> books) {
        ReaderLibrary readerLibrary = new ReaderLibrary();
        readerLibrary.addMyReadBooks(books, PATH);
        System.out.println("\nSerialized books:");
        readerLibrary.displayMyBooks(books);
    }

    private static void deserializeBooks(List<Book> books) {
        ReaderLibrary readerLibrary = new ReaderLibrary();
        System.out.println("\nDeserialized books:");
        List<Book> deserializedBooks = readerLibrary.getMySerializedBooks(PATH);
        readerLibrary.displayMyBooks(deserializedBooks);
    }

    private static List<Book> getBookList() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Pushkin", "Ruslan and Ludmila", 1820, 100, 25));
        books.add(new Book("Tolstoy", "Peace and War", 1867, 1000, 488));
        books.add(new Book("Gogol", "Dead Souls", 1842, 300, 150));
        return books;
    }
}
