package com.pratiksha.author;

public class Publish {
    private Book book;
    private Author author;
    private int yearOfPublishing;

    public Publish(Book book, Author author, int yearOfPublishing) {
        this.book = book;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}
