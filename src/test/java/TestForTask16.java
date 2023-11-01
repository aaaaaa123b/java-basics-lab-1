import org.example.task12.Book;
import org.example.task16.comparator.ComparatorByAuthorThenTitle;
import org.example.task16.comparator.ComparatorByAuthorThenTitleThenPrice;
import org.example.task16.comparator.ComparatorByTitle;
import org.example.task16.comparator.CompartorByTitleThenAuthor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask16 {

    @Test
    public void testSortingByTitle() {
        Book book1 = new Book("B", "Author 1", 20);
        Book book2 = new Book("A", "Author 2", 15);
        Book book3 = new Book("C", "Author 3", 25);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        books.sort(new ComparatorByTitle());

        assertEquals(book2, books.get(0));
        assertEquals(book1, books.get(1));
        assertEquals(book3, books.get(2));
    }

    @Test
    public void testSortingByTitleThenAuthor() {
        Book book1 = new Book("B", "Author 1", 20);
        Book book2 = new Book("A", "Author 2", 15);
        Book book3 = new Book("A", "Author 3", 25);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        books.sort(new CompartorByTitleThenAuthor());

        assertEquals(book2, books.get(0));
        assertEquals(book3, books.get(1));
        assertEquals(book1, books.get(2));
    }

    @Test
    public void testSortingByAuthorThenTitle() {
        Book book1 = new Book("B", "Author A", 20);
        Book book2 = new Book("C", "Author B", 15);
        Book book3 = new Book("A", "Author B", 25);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        books.sort(new ComparatorByAuthorThenTitle());

        assertEquals(book1, books.get(0));
        assertEquals(book3, books.get(1));
        assertEquals(book2, books.get(2));
    }

    @Test
    public void testSortingByAuthorTitlePrice() {
        Book book1 = new Book("B", "Author A", 20);
        Book book2 = new Book("A", "Author B", 15);
        Book book3 = new Book("A", "Author B", 25);

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        books.sort(new ComparatorByAuthorThenTitleThenPrice());

        assertEquals(book1, books.get(0));
        assertEquals(book2, books.get(1));
        assertEquals(book3, books.get(2));
    }

}
