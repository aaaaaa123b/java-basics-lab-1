package org.example.task16.comparator;

import org.example.task12.Book;

import java.util.Comparator;

public class ComparatorByAuthorThenTitleThenPrice implements Comparator<Book> {

    public static Comparator<Book> comparingByAuthorThenTitleThenPrice = Comparator
            .comparing(Book::getAuthor)
            .thenComparing(Book::getTitle)
            .thenComparingInt(Book::getPrice);

    @Override
    public int compare(Book o1, Book o2) {
        return comparingByAuthorThenTitleThenPrice.compare(o1, o2);
    }
}
