/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exavalu.services;


import com.exavalu.models.Employee;
import com.exavalu.utils.JDBCConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Avijit Chattopadhyay
 */
public class EmployeeService {
    
    public static EmployeeService employeeService = null;
    
    public static EmployeeService getInstance()
    {
        if(employeeService==null)
        {
            return new EmployeeService();
        }
        else
        {
            return employeeService;
        }
    }
    
    public static ArrayList getAllEmployees() {

        ArrayList empList = new ArrayList();
        try {
            Connection con = JDBCConnectionManager.getMySQLConnection();
            String sql = "select employeesId,firstName,lastName,age,basicSalary,carAllowance,address,roleName,departmentName,gender,phone from employeedb.employees emp inner join employeedb.roles role on emp.roleId=role.roleId inner join employeedb.department dpt on emp.departmentId=dpt.departmentId ";
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Employee emp = new Employee();
                emp.setAddress(rs.getString("address"));
                emp.setEmployeeId(rs.getString("employeesId"));
                emp.setFirstName(rs.getString("firstName"));
                emp.setLastName(rs.getString("lastName"));
                emp.setPhone(rs.getString("phone"));
                emp.setGender(rs.getString("gender"));
                emp.setAge(rs.getString("age"));
                emp.setDepartmentName(rs.getString("departmentName"));
                emp.setRoleName(rs.getString("roleName"));
                emp.setBasicSalary(rs.getString("basicSalary"));
                emp.setCarAllaowance(rs.getString("carAllowance"));

                empList.add(emp);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("Number of employees = " + empList.size());
        return empList;
    }
    
     public static Employee getEmployee(Employee emp1) {

        Employee emp = new Employee();

        try {
            Connection con = JDBCConnectionManager.getMySQLConnection();
            String sql = "select * from employees e, department d, roles r "
                    + "where e.departmentId=d.departmentId and e.roleId=r.roleId and  e.employeesId =?";

            PreparedStatement preparedStatement = con.prepareStatement(sql);
//            preparedStatement.setString(1, employeeId);
            preparedStatement.setString(1,emp1.getEmployeeId());

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                emp.setAddress(rs.getString("address"));
                emp.setEmployeeId(rs.getString("employeesId"));
                emp.setFirstName(rs.getString("firstName"));
                emp.setLastName(rs.getString("lastName"));
                emp.setPhone(rs.getString("phone"));
                emp.setGender(rs.getString("gender"));
                emp.setAge(rs.getString("age"));
                emp.setDepartmentName(rs.getString("departmentName"));
                emp.setRoleName(rs.getString("roleName"));
                emp.setBasicSalary(rs.getString("basicSalary"));
                emp.setCarAllaowance(rs.getString("carAllowance"));

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return emp;

    }
     


    public static boolean updateEmployee(Employee emp) {

        boolean result = false;
        try {
            Connection con = JDBCConnectionManager.getMySQLConnection();
            String sql = "UPDATE employeedb.employees\n"
                    + "SET firstName = ? , lastName = ? , phone = ? , address = ? ,gender = ? ,age = ? ,basicSalary = ? ,carAllowance = ?,departmentId=?,roleId=? WHERE employeesId = ?;";

            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, emp.getFirstName());
            preparedStatement.setString(2, emp.getLastName());
            preparedStatement.setString(3, emp.getPhone());
            preparedStatement.setString(4, emp.getAddress());
            preparedStatement.setString(5, emp.getGender());
            preparedStatement.setString(6, emp.getAge());
            preparedStatement.setString(7, emp.getBasicSalary());
            preparedStatement.setString(8, emp.getCarAllaowance());
            preparedStatement.setString(9, emp.getDepartmentId());
            preparedStatement.setString(10, emp.getRoleId());
            preparedStatement.setString(11, emp.getEmployeeId());

            int row = preparedStatement.executeUpdate();

            if (row == 1) {
                result = true;
                System.out.println(sql);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }
    
    //SEARCH EMPLOYEE
    
    public ArrayList searchEmployee(Employee employee) throws SQLException{
     ArrayList empList = new ArrayList();
       
            Connection con = JDBCConnectionManager.getMySQLConnection();
            String sql = "select * from employees e, department d, roles r where e.departmentId=d.departmentId and e.roleId=r.roleId "
                    + "having firstName like ?"
                    + "and lastName like ?"
                    + "and gender like ?"
                    + "and departmentName like ?"
                    + "and roleName like ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,employee.getFirstName()+"%");
            preparedStatement.setString(2,employee.getLastName()+"%");
            preparedStatement.setString(3,employee.getGender()+"%");
            preparedStatement.setString(4,employee.getDepartmentName()+"%");
             preparedStatement.setString(5,employee.getRoleName()+"%");
//            preparedStatement.setString(5,request.getParameter("rolesName")+"%");
            System.out.println("sql = "+preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setAddress(rs.getString("address"));
                emp.setEmployeeId(rs.getString("employeesId"));
                emp.setFirstName(rs.getString("firstName"));
                emp.setLastName(rs.getString("lastName"));
                emp.setPhone(rs.getString("phone"));
                emp.setGender(rs.getString("gender"));
                emp.setAge(rs.getString("age"));
                emp.setDepartmentName(rs.getString("departmentName"));
                emp.setDepartmentId(rs.getString("departmentId"));
                emp.setRoleName(rs.getString("roleName"));
                emp.setRoleId(rs.getString("roleId"));
                emp.setBasicSalary(rs.getString("basicSalary"));
                emp.setCarAllaowance(rs.getString("carAllowance"));

                empList.add(emp);

            }
         return empList;
 
 }
    
public static boolean deleteEmployee(Employee emp) {

        boolean result = false;
        try {
            Connection con = JDBCConnectionManager.getMySQLConnection();
            String sql = "UPDATE employeedb.employees SET status = 1 WHERE employesId = ?;";

            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, emp.getEmployeeId());
           

            int row = preparedStatement.executeUpdate();

            if (row == 1) {
                result = true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }


    
    public static boolean addEmployee(Employee emp) {
        boolean result = false;
        try {
            Connection con = JDBCConnectionManager.getMySQLConnection();
            String sql = "INSERT INTO employeedb.employees\n"
                    + "(firstName,lastName,phone,address,gender,age,basicSalary,carAllowance,departmentId,roleId)\n"
                    + "VALUES(? ,? ,? ,? ,? ,? ,? ,? ,? ,? );";

            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, emp.getFirstName());
            preparedStatement.setString(2, emp.getLastName());
            preparedStatement.setString(3, emp.getPhone());
            preparedStatement.setString(4, emp.getAddress());
            preparedStatement.setString(5, emp.getGender());
            preparedStatement.setString(6, emp.getAge());
            preparedStatement.setString(7, emp.getBasicSalary());
            preparedStatement.setString(8,emp.getCarAllaowance());
            preparedStatement.setString(9, emp.getDepartmentId());
            preparedStatement.setString(10, emp.getRoleId());
//            preparedStatement.setString(11, emp.getEmployesId());

         System.out.println(sql);
            int row = preparedStatement.executeUpdate();

            if (row == 1) {
                result = true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return result;

    }
    
    public static boolean saveEmployee(Employee emp, String employeeId) {
        
        boolean result = false;
        try {
            Connection con = JDBCConnectionManager.getMySQLConnection();
            String sql = "UPDATE employees\n"
                    + "SET firstName = ? , lastName = ? , phone = ? , address = ? ,\n"
                    + "gender = ? , age = ? , basicSalary = ?,carAllowance = ?, departmentId=?, roleId=?\n"
                    + "WHERE employeeId = ?";

            PreparedStatement preparedStatement = con.prepareStatement(sql);
            
            preparedStatement.setString(1, emp.getFirstName());
            preparedStatement.setString(2, emp.getLastName());
            preparedStatement.setString(3, emp.getPhone());
            preparedStatement.setString(4, emp.getAddress());
            preparedStatement.setString(5, emp.getGender());
            preparedStatement.setString(6, emp.getAge());
            preparedStatement.setDouble(7, Double.parseDouble(emp.getBasicSalary()));
            preparedStatement.setDouble(8, Double.parseDouble(emp.getCarAllaowance()));
            preparedStatement.setString(9, emp.getDepartmentId());
            preparedStatement.setString(10, emp.getRoleId());
            
                       
            preparedStatement.setString(11, employeeId);
            
            int row = preparedStatement.executeUpdate();

            if(row==1)
            {
                result = true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

}
