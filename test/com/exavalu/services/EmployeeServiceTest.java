/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.exavalu.services;

import com.exavalu.models.Employee;
import java.util.ArrayList;
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
public class EmployeeServiceTest {
    
    public EmployeeServiceTest() {
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
     * Test of getInstance method, of class EmployeeService.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        EmployeeService expResult = null;
        EmployeeService result = EmployeeService.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEmployees method, of class EmployeeService.
     */
    @Test
    public void testGetAllEmployees() {
        System.out.println("getAllEmployees");
        ArrayList expResult = null;
        ArrayList result = EmployeeService.getAllEmployees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployee method, of class EmployeeService.
     */
    @Test
    public void testGetEmployee() {
        System.out.println("getEmployee");
        Employee emp1 = null;
        Employee expResult = null;
        Employee result = EmployeeService.getEmployee(emp1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEmployee method, of class EmployeeService.
     */
    @Test
    public void testUpdateEmployee() {
        System.out.println("updateEmployee");
        Employee emp = null;
        boolean expResult = false;
        boolean result = EmployeeService.updateEmployee(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchEmployee method, of class EmployeeService.
     */
    @Test
    public void testSearchEmployee() throws Exception {
        System.out.println("searchEmployee");
        Employee employee = null;
        EmployeeService instance = new EmployeeService();
        ArrayList expResult = null;
        ArrayList result = instance.searchEmployee(employee);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEmployee method, of class EmployeeService.
     */
    @Test
    public void testDeleteEmployee() {
        System.out.println("deleteEmployee");
        Employee emp = null;
        boolean expResult = false;
        boolean result = EmployeeService.deleteEmployee(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEmployee method, of class EmployeeService.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        Employee emp = null;
        boolean expResult = false;
        boolean result = EmployeeService.addEmployee(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveEmployee method, of class EmployeeService.
     */
    @Test
    public void testSaveEmployee() {
        System.out.println("saveEmployee");
        Employee emp = null;
        String employeeId = "";
        boolean expResult = false;
        boolean result = EmployeeService.saveEmployee(emp, employeeId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
