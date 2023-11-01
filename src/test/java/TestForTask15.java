import org.example.task15.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestForTask15 {
    @Test
    public void testSortingByIsbn() {
        Book book1 = new Book("Book A", "Author 1", 20, "ISBN1");
        Book book2 = new Book("Book B", "Author 2", 15, "ISBN3");
        Book book3 = new Book("Book C", "Author 3", 25, "ISBN2");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Collections.sort(books);

        assertEquals(book1, books.get(0));
        assertEquals(book3, books.get(1));
        assertEquals(book2, books.get(2));
    }
}
