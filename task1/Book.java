package ru.makhmutov.lab.task1;

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String author;
    private final String title;
    private final int issueYear;
    private final int pageNumber;
    private int bookmark;

    public Book(String author, String title, int issueYear, int pageNumber, int bookmark) {
        this.author = author;
        this.title = title;
        this.issueYear = issueYear;
        this.pageNumber = pageNumber;
        this.bookmark = bookmark;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", issueYear=" + issueYear +
                ", pageNumber=" + pageNumber +
                ", bookmark=" + bookmark +
                '}';
    }

    public void setBookmark(int bookmark) {
        this.bookmark = bookmark;
    }
}
