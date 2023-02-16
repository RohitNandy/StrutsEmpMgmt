/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.exavalu.models;

import java.util.Map;
import org.apache.struts2.dispatcher.ApplicationMap;
import org.apache.struts2.dispatcher.SessionMap;
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
public class EmployeeTest {
    
    public EmployeeTest() {
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
     * Test of setApplication method, of class Employee.
     */
    @Test
    public void testSetApplication() {
        System.out.println("setApplication");
        Map<String, Object> application = null;
        Employee instance = new Employee();
        instance.setApplication(application);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSession method, of class Employee.
     */
    @Test
    public void testSetSession() {
        System.out.println("setSession");
        Map<String, Object> session = null;
        Employee instance = new Employee();
        instance.setSession(session);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doLogin method, of class Employee.
     */
    @Test
    public void testDoLogin() throws Exception {
        System.out.println("doLogin");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.doLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doLogout method, of class Employee.
     */
    @Test
    public void testDoLogout() {
        System.out.println("doLogout");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.doLogout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showEmployee method, of class Employee.
     */
    @Test
    public void testShowEmployee() throws Exception {
        System.out.println("showEmployee");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.showEmployee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doSearch method, of class Employee.
     */
    @Test
    public void testDoSearch() throws Exception {
        System.out.println("doSearch");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.doSearch();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doAdd method, of class Employee.
     */
    @Test
    public void testDoAdd() throws Exception {
        System.out.println("doAdd");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.doAdd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doGetEmp method, of class Employee.
     */
    @Test
    public void testDoGetEmp() {
        System.out.println("doGetEmp");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.doGetEmp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doUpdate method, of class Employee.
     */
    @Test
    public void testDoUpdate() throws Exception {
        System.out.println("doUpdate");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.doUpdate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveEmployee method, of class Employee.
     */
    @Test
    public void testSaveEmployee() {
        System.out.println("saveEmployee");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.saveEmployee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doDelete method, of class Employee.
     */
    @Test
    public void testDoDelete() throws Exception {
        System.out.println("doDelete");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.doDelete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeId method, of class Employee.
     */
    @Test
    public void testGetEmployeeId() {
        System.out.println("getEmployeeId");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getEmployeeId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeeId method, of class Employee.
     */
    @Test
    public void testSetEmployeeId() {
        System.out.println("setEmployeeId");
        String employeeId = "";
        Employee instance = new Employee();
        instance.setEmployeeId(employeeId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Employee.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Employee.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Employee instance = new Employee();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Employee.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Employee.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Employee instance = new Employee();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Employee.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Employee.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Employee instance = new Employee();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Employee.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Employee.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Employee instance = new Employee();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class Employee.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class Employee.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        Employee instance = new Employee();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhone method, of class Employee.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhone method, of class Employee.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        Employee instance = new Employee();
        instance.setPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Employee.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Employee instance = new Employee();
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Employee.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        int status = 0;
        Employee instance = new Employee();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Employee.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class Employee.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        Employee instance = new Employee();
        instance.setGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Employee.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Employee.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        String age = "";
        Employee instance = new Employee();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartmentName method, of class Employee.
     */
    @Test
    public void testGetDepartmentName() {
        System.out.println("getDepartmentName");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getDepartmentName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartmentName method, of class Employee.
     */
    @Test
    public void testSetDepartmentName() {
        System.out.println("setDepartmentName");
        String departmentName = "";
        Employee instance = new Employee();
        instance.setDepartmentName(departmentName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoleName method, of class Employee.
     */
    @Test
    public void testGetRoleName() {
        System.out.println("getRoleName");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getRoleName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoleName method, of class Employee.
     */
    @Test
    public void testSetRoleName() {
        System.out.println("setRoleName");
        String roleName = "";
        Employee instance = new Employee();
        instance.setRoleName(roleName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBasicSalary method, of class Employee.
     */
    @Test
    public void testGetBasicSalary() {
        System.out.println("getBasicSalary");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getBasicSalary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBasicSalary method, of class Employee.
     */
    @Test
    public void testSetBasicSalary() {
        System.out.println("setBasicSalary");
        String basicSalary = "";
        Employee instance = new Employee();
        instance.setBasicSalary(basicSalary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarAllaowance method, of class Employee.
     */
    @Test
    public void testGetCarAllaowance() {
        System.out.println("getCarAllaowance");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getCarAllaowance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarAllaowance method, of class Employee.
     */
    @Test
    public void testSetCarAllaowance() {
        System.out.println("setCarAllaowance");
        String carAllaowance = "";
        Employee instance = new Employee();
        instance.setCarAllaowance(carAllaowance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepartmentId method, of class Employee.
     */
    @Test
    public void testGetDepartmentId() {
        System.out.println("getDepartmentId");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getDepartmentId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepartmentId method, of class Employee.
     */
    @Test
    public void testSetDepartmentId() {
        System.out.println("setDepartmentId");
        String departmentId = "";
        Employee instance = new Employee();
        instance.setDepartmentId(departmentId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoleId method, of class Employee.
     */
    @Test
    public void testGetRoleId() {
        System.out.println("getRoleId");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getRoleId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoleId method, of class Employee.
     */
    @Test
    public void testSetRoleId() {
        System.out.println("setRoleId");
        String roleId = "";
        Employee instance = new Employee();
        instance.setRoleId(roleId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSessionMap method, of class Employee.
     */
    @Test
    public void testGetSessionMap() {
        System.out.println("getSessionMap");
        Employee instance = new Employee();
        SessionMap<String, Object> expResult = null;
        SessionMap<String, Object> result = instance.getSessionMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSessionMap method, of class Employee.
     */
    @Test
    public void testSetSessionMap() {
        System.out.println("setSessionMap");
        SessionMap<String, Object> sessionMap = null;
        Employee instance = new Employee();
        instance.setSessionMap(sessionMap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMap method, of class Employee.
     */
    @Test
    public void testGetMap() {
        System.out.println("getMap");
        Employee instance = new Employee();
        ApplicationMap expResult = null;
        ApplicationMap result = instance.getMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMap method, of class Employee.
     */
    @Test
    public void testSetMap() {
        System.out.println("setMap");
        ApplicationMap map = null;
        Employee instance = new Employee();
        instance.setMap(map);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
