/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alvar
 */
public class CalcularTest {
    
    public CalcularTest() {
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
     * Test of pasarALista method, of class Calcular.
     */
    @Test
    public void testPasarALista() {
        System.out.println("pasarALista");
        String cad = "";
        ArrayList<String> expResult = null;
        ArrayList<String> result = Calcular.pasarALista(cad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcular method, of class Calcular.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        ArrayList<String> lista = null;
        double expResult = 0.0;
        double result = Calcular.calcular(lista);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
