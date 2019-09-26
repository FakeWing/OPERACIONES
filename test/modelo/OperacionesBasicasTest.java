/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fake Wings
 */
public class OperacionesBasicasTest {
    
    public OperacionesBasicasTest() {
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
     * Test of sumar method, of class OperacionesBasicas.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        OperacionesBasicas instance = null;
        int expResult = 0;
        int result = instance.sumar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class OperacionesBasicas.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        OperacionesBasicas instance = null;
        int expResult = 0;
        int result = instance.restar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class OperacionesBasicas.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        OperacionesBasicas instance = null;
        int expResult = 0;
        int result = instance.multiplicar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class OperacionesBasicas.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        OperacionesBasicas instance = null;
        int expResult = 0;
        int result = instance.dividir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
