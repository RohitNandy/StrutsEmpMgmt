/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.exavalu.utils;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rohit Nandy
 */
public class JDBCUtilityTest {
    
    public JDBCUtilityTest() {
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
     * Test of getPropertyValue method, of class JDBCUtility.
     */
    @Test
    public void testGetPropertyValue() {
        System.out.println("getPropertyValue");
        String param = "";
        JDBCUtility instance = null;
        String expResult = "";
        String result = instance.getPropertyValue(param);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInstanceOfJDBCUtility method, of class JDBCUtility.
     */
    @Test
    public void testGetInstanceOfJDBCUtility() {
        System.out.println("getInstanceOfJDBCUtility");
        JDBCUtility expResult = null;
        JDBCUtility result = JDBCUtility.getInstanceOfJDBCUtility();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
