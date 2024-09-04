package edu.eci.cvds.tdd.library.loan;

import java.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoanTest {
    private Loan loan = new Loan();
    
    @Before
    public void setUp() {
        loan = new Loan();
    }
    
    @Test
    public void testGetLoanDate() {
        loan.setLoanDate(LocalDate.now());
        assertEquals(LocalDate.now(), loan.getLoanDate());
    }
    
    @Test
    public void testGetReturnDate() {
        loan.setReturnDate(LocalDate.now());
        assertEquals(LocalDate.now(), loan.getReturnDate());
    }
    
}