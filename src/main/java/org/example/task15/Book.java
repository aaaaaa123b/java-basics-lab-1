package org.example.task15;

import java.util.Objects;

public class Book implements Cloneable, Comparable<Book> {

    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Book other) {
        return this.isbn.compareTo(other.isbn);
    }

    @Override
    public Book clone() {
        try {
            Book result = (Book) super.clone();
            result.title = title;
            result.author = author;
            result.price = price;
            result.isbn = isbn;
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(isbn, book.isbn);
    }


    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{title ='%s',author = '%s',price = %d,isbn='%s'}".formatted(title, author, price, isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
