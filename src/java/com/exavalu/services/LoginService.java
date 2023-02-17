/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exavalu.services;

import com.exavalu.models.Employee;
import com.exavalu.models.User;
import com.exavalu.utils.JDBCConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 *
 * @author Avijit Chattopadhyay
 */
public class LoginService {
    
    public static LoginService loginService = null;
    
    private LoginService(){}
    
    public static LoginService getInstance()
    {
        if(loginService==null)
        {
            return new LoginService();
        }
        else
        {
            return loginService;
        }
    }
    
    public boolean doLogin(Employee emp)
    {
        boolean success = false;
        
        String sql = "Select * from users where emailAddress=? and paaaassword=?";
        
        try {
            Connection con = JDBCConnectionManager.getMySQLConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, emp.getEmail());
            ps.setString(2, emp.getPassword());
            
            System.out.println("LoginService :: "+ps);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                success = true;
            }
            
        } catch (SQLException ex) {
            //ex.printStackTrace();
            Logger log = Logger.getLogger(User.class.getName());
            log.error(LocalDateTime.now()+"  returning Failure from Login method  "+ "error code: "+ex.getErrorCode());
        }
        
        
        return success;
    }
    
    public boolean doSignUp(User user) {
        boolean result = false;
        String sql = "INSERT INTO apiusers(email,password,firstName,lastName,countrycode,statecode,distcode)" + "VALUES(? ,? ,? ,?,?,?,?)";

        try {
            Connection con = JDBCConnectionManager.getMySQLConnection();

            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFirstName());
            preparedStatement.setString(4, user.getLastName());
            preparedStatement.setString(5, user.getCountryCode());
            preparedStatement.setString(6, user.getStateCode());
            preparedStatement.setString(7, user.getDistCode());

            System.out.println(preparedStatement);
            int res = preparedStatement.executeUpdate();

            if (res == 1) {
                result = true;
            }

        } catch (SQLException ex) {
            int e = ex.getErrorCode();
            System.out.println(e);
        }

        return result;

    }
    
    public boolean doSignUpAll(ArrayList userList) {
        boolean result = true;
        for(int i=0;i<userList.size();i++)
        {
            if(!doSignUp((User)userList.get(i)))
            {
                result=false;
            }
        }
        return result;
    }
}
