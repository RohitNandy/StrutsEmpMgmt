/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.exavalu.services;

import com.exavalu.models.Employee;
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
public class EditEmployeeTest {
    
    public EditEmployeeTest() {
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
     * Test of getInstance method, of class EditEmployee.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        EditEmployee expResult = null;
        EditEmployee result = EditEmployee.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editEmployee method, of class EditEmployee.
     */
    @Test
    public void testEditEmployee() {
        System.out.println("editEmployee");
        Employee emp = null;
        String employeeId = "";
        boolean expResult = false;
        boolean result = EditEmployee.editEmployee(emp, employeeId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
