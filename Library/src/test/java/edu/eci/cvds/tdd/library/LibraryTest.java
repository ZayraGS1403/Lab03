package edu.eci.cvds.tdd.library;
import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.loan.LoanStatus;
import edu.eci.cvds.tdd.library.user.User;
<<<<<<< HEAD
import java.util.Date;
=======
import java.time.LocalDate;
>>>>>>> fd1f29658f336d179508c01969730297ed993238


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

    private Library library = new Library();
    
    @Before
    public void setUp() {
        library = new Library();
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
        assertTrue(library.addBook(book));
    }


<<<<<<< HEAD
    /* @Test
    public void testLoanABook() {
        // Create a new user
        User user = new User();
        library.addUser(user);

        // Create a new book
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", "1234567890");
        library.addBook(book);

        // Loan the book to the user
        Loan loan = library.loanABook(user.getId(), book.getIsbn());

        // Verify that the loan was created successfully
        assertNotNull(loan);
        assertEquals(book, loan.getBook());
        assertEquals(user, loan.getUser());
        assertEquals(LoanStatus.ACTIVE, loan.getStatus());
    } */
    
 
=======
    //revisa que el loan tenga la fecha actual  
    @Test
    public void shouldCreateLoanWithCurrentDate() {
        User user = new User("John Doe", "9563");
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488");
        library.addUser(user);
        library.addBook(book);
        Loan loan = library.loanABook(user.getId(), book.getIsbn());
        assertEquals(loan.getLoanDate(), LocalDate.now());
    }

    //revisa que el loan tenga el estado ACTIVE
    @Test
    public void shouldCreateLoanWithActiveStatus() {
        User user = new User("John Doe", "9563");
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488");
        library.addUser(user);
        library.addBook(book);
        Loan loan = library.loanABook(user.getId(), book.getIsbn());
        assertEquals(loan.getStatus(), LoanStatus.ACTIVE);
    }

    //revisa que el loan tenga el estado RETURNED
    @Test
    public void shouldReturnLoanWithReturnedStatus() {
        User user = new User("John Doe", "9563");
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488");
        library.addUser(user);
        library.addBook(book);
        Loan loan = library.loanABook(user.getId(), book.getIsbn());
        Loan returnedLoan = library.returnLoan(loan);
        assertEquals(returnedLoan.getStatus(), LoanStatus.RETURNED);
    }
>>>>>>> fd1f29658f336d179508c01969730297ed993238




}


