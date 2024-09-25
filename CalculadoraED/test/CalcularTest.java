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
        ArrayList<String> exp=new ArrayList<String>();
        
        exp.add("8");
        exp.add("5.9"); 
        exp.add("+");
        exp.add("9");
        exp.add("*");
        exp.add("2");
        exp.add("/");
        System.out.println("pasarALista");
        String cad = "(8+5.9)*9/2";
        ArrayList<String> expResult = exp;
        ArrayList<String> result = Calcular.pasarALista(cad);
        assertEquals(expResult, result);
        // Test passed
    }

    /**
     * Test of calcular method, of class Calcular.
     */
    @Test
    public void testCalcular() {
        ArrayList<String> operacion=new ArrayList<String>();
        
        operacion.add("-8");
        operacion.add("77"); 
        operacion.add("-");
        operacion.add("3");
        operacion.add("*");
        operacion.add("5");
        operacion.add("/");
        operacion.add("3");
        operacion.add("^");
        System.out.println("calcular");
        ArrayList<String> lista = operacion;
        double expResult = -132651;
        double result = Calcular.calcular(lista);
        assertEquals(expResult, result, 0);
        // Test passed
    }
    
}
