/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.ta.prg2.u2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marco Büeler <marco.bueeler@stud.hslu.ch>
 */
public class StackTest {
    
    private Stack stack;
    private String s1;
    private String s2;
    private String s3;
    private String s4;
    
    
    public StackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        stack = new Stack();
        s1 = "A.A.";
        s2 = "YLA";
        s3 = "S.F.";
        s4 = "M.B.";
        stack.push(s1);
        stack.push(s2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        stack.push(s1);
        stack.push(s2);
        assertEquals(4, stack.getSize());
    }

    /**
     * Test of pop method, of class Stack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        stack.pop();
        assertEquals(1, stack.getSize());
    }

    /**
     * Test of isEmpty method, of class Stack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        assertEquals(false, stack.isEmpty());
    }

    
    /**
     * Test of getSize method, of class Stack.
     */
    @Test
    public void testGetSize() {
        System.out.println("isEmpty");
        assertEquals(2, stack.getSize());
    }
    
    
}
