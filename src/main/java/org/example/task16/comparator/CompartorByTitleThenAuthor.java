package org.example.task16.comparator;

import org.example.task12.Book;

import java.util.Comparator;

public class CompartorByTitleThenAuthor implements Comparator<Book> {

    public static Comparator<Book> comparingByTitleThenAuthor = Comparator
            .comparing(Book::getTitle)
            .thenComparing(Book::getAuthor);

    @Override
    public int compare(Book o1, Book o2) {
        return comparingByTitleThenAuthor.compare(o1, o2);
    }
}
