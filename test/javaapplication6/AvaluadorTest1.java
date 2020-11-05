/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runners.Parameterized;

/**
 *
 * @author Sophia Patrice
 */
public class AvaluadorTest1 {
    
    private Estudiant instanceEstudiant;
    private Avaluador instanceAvaluador;
    
    
    public AvaluadorTest1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        instanceAvaluador = new Avaluador(10,0,5);
        instanceEstudiant = new Estudiant("Gina",6,7,8); 
        
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void testMitjanaSiSupera() throws Exception {
        assertEquals(7,instanceAvaluador.mitjanaSiSupera(instanceEstudiant),1.0E-2);
    }
    
    @Test
    public void testMitjana() throws Exception {
        assertEquals(7,instanceAvaluador.mitjana(instanceEstudiant),1.0E-2);
    }
    
    @Test
    public void testMillorEstudiantPerNotaMitjana() throws Exception {
        assertEquals(7,instanceAvaluador.millorEstudiantPerNotaMitjana(),1.0E-2);
    }
    
}
