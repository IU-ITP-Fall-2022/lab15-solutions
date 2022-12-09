package ru.makhmutov.lab.task1;

import java.io.*;
import java.util.List;

public class ReaderLibrary {

    public void addMyReadBooks(List<Book> books, String serializedFilePath) {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(serializedFilePath))) {
            out.writeObject(books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Book> getMySerializedBooks(String serializedFilePath) {
        List<Book> books = null;
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(serializedFilePath))) {
            books = (List<Book>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return books;
    }


    public void displayMyBooks(List<Book> books) {
        books.forEach(System.out::println);
    }
}
