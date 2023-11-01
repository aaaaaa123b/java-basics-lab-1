import org.example.task14.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class TestForTask14 {
    @Test
    public void testClone()  {
        Book originalBook = new Book("Book", "Author", 30);

        Book clonedBook = originalBook.clone();

        assertNotSame(originalBook, clonedBook);

        assertEquals(originalBook.getTitle(), clonedBook.getTitle());
        assertEquals(originalBook.getAuthor(), clonedBook.getAuthor());
        assertEquals(originalBook.getPrice(), clonedBook.getPrice());
    }
}
