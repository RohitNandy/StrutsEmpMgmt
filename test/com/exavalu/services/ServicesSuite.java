/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.exavalu.services;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Rohit Nandy
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.exavalu.services.LoginServiceTest.class, com.exavalu.services.EditEmployeeTest.class, com.exavalu.services.DepartmentServiceTest.class, com.exavalu.services.UserServiceTest.class, com.exavalu.services.EmployeeServiceTest.class, com.exavalu.services.RoleServiceTest.class})
public class ServicesSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
