/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

/**
 *
 * @author Sophia Patrice
 */
public class AvaluadorTest3 {
    private Estudiant instanceEstudiant;
    private Avaluador instanceAvaluador;
    
    @Rule
   public final ExpectedException exception = ExpectedException.none();
   
   @Rule 
   public Timeout timeout = Timeout.millis(250);
    public AvaluadorTest3() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        instanceAvaluador = new Avaluador();
        instanceEstudiant = null; 
    }
    
    @After
    public void tearDown() {
        instanceAvaluador = null;
        instanceEstudiant = null; 
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     * @throws java.lang.Exception
     */
    @Test
    public void testMitjanaSiSupera() throws Exception {
        exception.expect(Exception.class);
        exception.expectCause(CoreMatchers.isA(IllegalAccessException.class));
        exception.expectMessage("Estudiant no pot ser null");
        instanceAvaluador.mitjanaSiSupera(null);
    }

    /**
     * Test of mitjana method, of class Avaluador.
     * @throws java.lang.Exception
     */
    @Test
    public void testMitjana() throws Exception {
        exception.expect(Exception.class);
        exception.expectCause(CoreMatchers.isA(IllegalAccessException.class));
        exception.expectMessage("Estudiant no pot ser null");
        instanceAvaluador.mitjana(null);
    }

    
}
