package org.example.task16.comparator;

import org.example.task12.Book;

import java.util.Comparator;

public class ComparatorByAuthorThenTitle implements Comparator<Book> {

    public static Comparator<Book> comparingByAuthorThenTitle = Comparator
            .comparing(Book::getAuthor)
            .thenComparing(Book::getTitle);


    @Override
    public int compare(Book o1, Book o2) {
        return comparingByAuthorThenTitle.compare(o1, o2);
    }

}
