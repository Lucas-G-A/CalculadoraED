/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

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
public class PruebasValidasTest {
    
    public PruebasValidasTest() {
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
     * Test of verificarInicioYFin method, of class PruebasValidas.
     */
    @Test
    public void testVerificarInicioYFin() {
        System.out.println("verificarInicioYFin");
        String cadena = "(*11+4-7";
        boolean expResult = false;
        boolean result = PruebasValidas.verificarInicioYFin(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of operadoresJuntos method, of class PruebasValidas.
     */
    @Test
    public void testOperadoresJuntos() {
        System.out.println("operadoresJuntos");
        String cadena = "1**2+88-1";
        boolean expResult = false;
        boolean result = PruebasValidas.operadoresJuntos(cadena);
        assertEquals(expResult, result);
        // Test passed

    }
    @Test
    public void testParentesisBalanceados() {
        System.out.println("Parentesis Balanceados");
        String cadena = "((11+5)-3*2(41+1))";
        boolean expResult = true;
        boolean result = PruebasValidas.parentesisBalanceados(cadena);
        assertEquals(expResult, result);
        // Test passed
    }
    @Test
    public void testParentesisNoConsecutivos() {
        System.out.println("parentesisNoConsecutivos");
        String cadena = "(()-3*2(41+1))";
        boolean expResult = false;
        boolean result = PruebasValidas.parentesisNoConsecutivos(cadena);
        assertEquals(expResult, result);
        // Test passed
    }
    
}
