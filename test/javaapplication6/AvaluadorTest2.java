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
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Sophia Patrice
 */
@RunWith (Parameterized.class)
public class AvaluadorTest2 {
    
    private Estudiant instanceEstudiant;
    private Avaluador instanceAvaluador;
    
    @Parameterized.Parameter(0)
    public String name;
    @Parameterized.Parameter(1)
    public double firstSem;
    @Parameterized.Parameter(2)
    public double secondSem;
    @Parameterized.Parameter(3)
    public double thirdSem;
    @Parameterized.Parameter(4)
    public double median;


    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
            {"Anna", 6.0, 7.0, 8.0, 7.0} , 
            {"John", 1.0, 0.0, 0.0, 0.3  }
        };
        
        return Arrays.asList(data);
    }
    
    public AvaluadorTest2() {
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
        instanceEstudiant = new Estudiant(name, firstSem, secondSem, thirdSem); 
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     * @throws java.lang.Exception
     */
    @Test
    public void testMitjanaSiSupera() throws Exception {
        assertEquals(median,instanceAvaluador.mitjanaSiSupera(instanceEstudiant),1.0E-2);
    }

    /**
     * Test of mitjana method, of class Avaluador.
     * @throws java.lang.Exception
     */
    @Test
    public void testMitjana() throws Exception {
        assertEquals(median,instanceAvaluador.mitjana(instanceEstudiant),1.0E-2);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() {

    }
    
}
