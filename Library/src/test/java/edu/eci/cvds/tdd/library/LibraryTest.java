package edu.eci.cvds.tdd.library;
import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.loan.LoanStatus;
import edu.eci.cvds.tdd.library.user.User;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void shouldTrue(){
        assertTrue(true);
    }

    private Library library;

    @Before
    public void setUp() {
        Library library = new Library();
    }

    @Test
    public void testAddBook() {
        Book book = new Book("the 100", "maria", "1234567");
        assertTrue(library.addBook(book));

    }

    @Test
    public void testAddExistingBook() {
        Book book = new Book("the 100", "maria", "1234567");
        library.addBook(book);
        assertFalse(library.addBook(book));
    }
    



/* 
    @Test
    public void testLoanABookSuccessfully() {
        Loan loan = library.loanABook("user1", "isbn1");
        assertNotNull(loan);
        assertEquals("Pepito", loan.getUser());
        assertEquals("isbn1", loan.getIsbn());
        assertEquals(LoanStatus.ACTIVE, loan.getStatus());
        assertEquals(new Date(), loan.getLoanDate());
    } */



}