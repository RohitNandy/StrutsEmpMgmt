/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exavalu.models;

import com.exavalu.services.DepartmentService;
import com.exavalu.services.EditEmployee;
import com.exavalu.services.EmployeeService;
import com.exavalu.services.LoginService;
import com.exavalu.services.RoleService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.struts2.dispatcher.ApplicationMap;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Avijit Chattopadhyay
 */
public class Employee extends ActionSupport implements ApplicationAware, SessionAware, Serializable {

    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String address;
    private String phone;
    private String gender;
    private String age;
    private String departmentName;
    private String roleName;
    private String basicSalary;
    private String carAllaowance;

    private String departmentId;
    private String roleId;
    private int status;

    private SessionMap<String, Object> sessionMap = (SessionMap) ActionContext.getContext().getSession();

    private ApplicationMap map = (ApplicationMap) ActionContext.getContext().getApplication();

    @Override
    public void setApplication(Map<String, Object> application) {
        setMap((ApplicationMap) application);
    }

    @Override
    public void setSession(Map<String, Object> session) {
        setSessionMap((SessionMap<String, Object>) (SessionMap) session);
    }

    public String doLogin() throws Exception {
        String result = "FAILURE";

        boolean success = LoginService.getInstance().doLogin(this);

        if (success) {
            System.out.println("returning Success from doLogin method");
            sessionMap.put("Loggedin", this);
            ArrayList empList = EmployeeService.getInstance().getAllEmployees();
            sessionMap.put("EmpList", empList);
            result = "SUCCESS";
        } else {
            System.out.println("returning Failure from doLogin method");
        }

        return result;
    }

    public String doLogout() {
        String result = "SUCCESS";
        sessionMap.clear();
        return result;
    }
    
    public String showEmployee() throws Exception {
        String result = "FAILURE";
        ArrayList empList = EmployeeService.getAllEmployees();
        if (empList != null) {
            result = "SUCCESS";
        }

        return result;
    }

    
    
    public String doSearch() throws SQLException {
        String result = "SUCCESS";
        ArrayList EmpList = EmployeeService.getInstance().searchEmployee(this);
        sessionMap.put("EmpList", EmpList);
        ArrayList DeptList = DepartmentService.getAllDepartment();
        sessionMap.put("DeptList", DeptList);
        ArrayList RoleList = RoleService.getAllRole();
        sessionMap.put("RoleList", RoleList);
        return result;
    }
    
    public String doAdd() throws SQLException {
        String result = "SUCCESS";
        EmployeeService.addEmployee(this);
        ArrayList DeptList = DepartmentService.getAllDepartment();
        sessionMap.put("DeptList", DeptList);
        ArrayList RoleList = RoleService.getAllRole();
        sessionMap.put("RoleList", RoleList);
        
            String createdMsg = "Employee created successfully!!";
            sessionMap.put("CreatedMsg", createdMsg);
            ArrayList empList = new ArrayList();
            empList = EmployeeService.getInstance().getAllEmployees();
            sessionMap.put("EmpList", empList);

            System.out.println("returning Success from doSearch method");
            result = "SUCCESS";

       
           
        
        return result;
    }
    
    public String doGetEmp(){
         String result = "FAILURE";
        Employee emp = EmployeeService.getEmployee(this);
        sessionMap.put("Emp", emp);

        ArrayList depList = DepartmentService.getAllDepartment();
        ArrayList roleList = RoleService.getAllRole();
        sessionMap.put("DeptList", depList);
        sessionMap.put("RoleList", roleList);

        if (true) {

            System.out.println("returning Success from doSearch method");
            result = "SUCCESS";

        }
        return result;
    }
    
    public String doUpdate() throws Exception {

        String result = "FAILURE";
        boolean success = EmployeeService.updateEmployee(this);

        if (success) {
            String updateMsg = "updated Employee";
            sessionMap.put("UpdateMsg", updateMsg);
            
            ArrayList empList = new ArrayList();
            empList = EmployeeService.getInstance().getAllEmployees();
            sessionMap.put("EmpList", empList);
            
            System.out.println("returning Success from doUpdate method");
            result = "SUCCESS";

        }
        return result;
    }
    
    public String saveEmployee(){
        String result = "FAILURE";
        Employee emp = new Employee();
        emp.setFirstName(getFirstName());
        emp.setAddress(getAddress());
        emp.setAge(getAge());
        emp.setDepartmentId(getDepartmentId());
        emp.setCarAllaowance(getCarAllaowance());
        emp.setGender(getGender());
        emp.setBasicSalary(getBasicSalary());
        emp.setRoleId(getRoleId());
        emp.setPhone(getPhone());
        emp.setLastName(getLastName());
        boolean res = EmployeeService.saveEmployee(emp, getEmployeeId());
         if(res){
            ArrayList empList = EmployeeService.getInstance().getAllEmployees();
            getSessionMap().put("empList", empList);
            result="SUCCESS";
        }
        else{
            getSessionMap().put("Emp", emp);
        }
        return result;
    }
    
    public String doDelete() throws Exception {

        String result = "FAILURE";
        boolean success = EmployeeService.deleteEmployee(this);

        if (success) {
            String updateMsg = "deleted successfully!";
            sessionMap.put("UpdateMsg", updateMsg);
            
            ArrayList empList = new ArrayList();
            empList = EmployeeService.getInstance().getAllEmployees();
            sessionMap.put("EmpList", empList);
            
            
            result = "SUCCESS";

        }
        return result;
    }

    


    /**
     * @return the employeeId
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the departmentName
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * @param departmentName the departmentName to set
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * @return the roleName
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName the roleName to set
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return the basicSalary
     */
    public String getBasicSalary() {
        return basicSalary;
    }

    /**
     * @param basicSalary the basicSalary to set
     */
    public void setBasicSalary(String basicSalary) {
        this.basicSalary = basicSalary;
    }

    /**
     * @return the carAllaowance
     */
    public String getCarAllaowance() {
        return carAllaowance;
    }

    /**
     * @param carAllaowance the carAllaowance to set
     */
    public void setCarAllaowance(String carAllaowance) {
        this.carAllaowance = carAllaowance;
    }

    /**
     * @return the departmentId
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * @param departmentId the departmentId to set
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * @return the roleId
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * @param roleId the roleId to set
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * @return the sessionMap
     */
    public SessionMap<String, Object> getSessionMap() {
        return sessionMap;
    }

    /**
     * @param sessionMap the sessionMap to set
     */
    public void setSessionMap(SessionMap<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    /**
     * @return the map
     */
    public ApplicationMap getMap() {
        return map;
    }

    /**
     * @param map the map to set
     */
    public void setMap(ApplicationMap map) {
        this.map = map;
    }

}
