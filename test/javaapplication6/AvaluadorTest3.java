/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sophia Patrice
 */
public class AvaluadorTest3 {
    
    public AvaluadorTest3() {
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
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
    @Test
    public void testMitjanaSiSupera() throws Exception {
        System.out.println("mitjanaSiSupera");
        Estudiant estudiant = null;
        Avaluador instance = new Avaluador();
        double expResult = 0.0;
        double result = instance.mitjanaSiSupera(estudiant);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
    public void testMitjana() throws Exception {
        System.out.println("mitjana");
        Estudiant estudiant = null;
        Avaluador instance = new Avaluador();
        double expResult = 0.0;
        double result = instance.mitjana(estudiant);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
        System.out.println("millorEstudiantPerNotaMitjana");
        Estudiant[] estudiants = null;
        Avaluador instance = new Avaluador();
        Estudiant expResult = null;
        Estudiant result = instance.millorEstudiantPerNotaMitjana(estudiants);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
