package edu.eci.cvds.tdd.library.user;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    private User user = new User("John Doe", "1234");
    
    @Before
    public void setUp() {
        user = new User("John Doe", "1234");
    }
    
    @Test
    public void testGetId() {
        assertEquals("1234", user.getId());
    }
    
    @Test
    public void testGetName() {
        assertEquals("John Doe", user.getName());
    }
    
    @Test
    public void testSetName() {
        user.setName("Jane Doe");
        assertEquals("Jane Doe", user.getName());
    }
    
    @Test
    public void testSetId() {
        user.setId("5678");
        assertEquals("5678", user.getId());
    }
    
}