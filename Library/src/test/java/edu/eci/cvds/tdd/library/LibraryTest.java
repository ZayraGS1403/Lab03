package edu.eci.cvds.tdd.library;
import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.loan.LoanStatus;
import edu.eci.cvds.tdd.library.user.User;
import java.time.LocalDate;



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



    @Test
    public void testLoanABook() {
        // Create a new user
        User user = new User("John Doe", "1234");
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
    } 
   
    // Test para cuando se crea un prestamo y se disminuye la cantidad de libros
    @Test
    public void shouldCreateLoanAndDecreaseBookCount() {
        User user = new User("John Doe", "9563");
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488");
        library.addUser(user);
        library.addBook(book);
        library.loanABook(user.getId(), book.getIsbn());
        int remainingBooks = library.getBookAmount().get(book);
        assertEquals(0, remainingBooks);
    }

    // Test para cuando se retorna un libro y se aumenta la cantidad de libros
    @Test
    public void shouldReturnLoanAndIncreaseBookCount() {
        User user = new User("John Doe", "9563");
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488");
        library.addUser(user);
        library.addBook(book);
        Loan loan = library.loanABook(user.getId(), book.getIsbn());
        library.returnLoan(loan);
        int remainingBooks = library.getBookAmount().get(book);
        assertEquals(1, remainingBooks);
    }

    //Test para cuando retornan un libro la fecha sea la actual
    @Test   
    public void shouldReturnLoanAndSetReturnDate() {
        User user = new User("John Doe", "9563");
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488");
        library.addUser(user);
        library.addBook(book);
        Loan loan = library.loanABook(user.getId(), book.getIsbn());
        library.returnLoan(loan);
        assertEquals(LocalDate.now(), loan.getReturnDate());
    }
 
    //Test para cuando se retorna un libro y se cambia el estado a RETURNED
    @Test
    public void shouldReturnLoanAndSetReturnedStatus() {
        User user = new User("John Doe", "9563");
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488");
        library.addUser(user);
        library.addBook(book);
        Loan loan = library.loanABook(user.getId(), book.getIsbn());
        library.returnLoan(loan);
        assertEquals(LoanStatus.RETURNED, loan.getStatus());
    }

    //Test para validar que existe un prestamo
    @Test
    public void shouldReturnLoan() {
        User user = new User("John Doe", "9563");
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769488");
        library.addUser(user);
        library.addBook(book);
        Loan loan = library.loanABook(user.getId(), book.getIsbn());
        Loan returnedLoan = library.returnLoan(loan);
        assertEquals(loan, returnedLoan);
    }
}


