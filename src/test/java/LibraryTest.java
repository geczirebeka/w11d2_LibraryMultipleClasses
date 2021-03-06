import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(3);
        book = new Book("A Wild Sheep Chase", "Haruki Murakami", "Fiction");
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook() {
       library.addBook(book);
       assertEquals(1, library.bookCount());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.bookCount());
    }


}
