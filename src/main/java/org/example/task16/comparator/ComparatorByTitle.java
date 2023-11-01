package org.example.task16.comparator;

import org.example.task12.Book;

import java.util.Comparator;

public class ComparatorByTitle implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
