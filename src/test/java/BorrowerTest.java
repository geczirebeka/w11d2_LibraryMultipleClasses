import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book("A Wild Sheep Chase", "Haruki Murakami", "Fiction");
        library = new Library(5);
    }

    @Test
    public void borrowerStartsEmpty() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canAddBook() {
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canPickUpBookFromLibrary() {
        library.addBook(book);
        borrower.pickUpFromLibrary(library);
        assertEquals(1, borrower.bookCount());
    }

}
