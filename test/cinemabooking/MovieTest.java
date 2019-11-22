/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemabooking;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sewa
 */
public class MovieTest {
    
    public MovieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of printtitle method, of class Movie.
     */
    @Test
    public void testPrinttitle() {
        System.out.println("printtitle");
        Movie instance = new Movie();
        instance.printtitle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newtrailer method, of class Movie.
     */
    @Test
    public void testNewtrailer() {
        System.out.println("newtrailer");
        Movie instance = new Movie();
        instance.newtrailer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gettitle method, of class Movie.
     */
    @Test
    public void testGettitle() {
        System.out.println("gettitle");
        Movie instance = new Movie();
        String expResult = "";
        String result = instance.gettitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of settitle method, of class Movie.
     */
    @Test
    public void testSettitle() {
        System.out.println("settitle");
        String newtitle = "";
        Movie instance = new Movie();
        instance.settitle(newtitle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
