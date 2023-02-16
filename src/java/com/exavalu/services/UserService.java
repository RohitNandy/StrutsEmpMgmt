
package com.exavalu.services;
import com.exavalu.models.Country;
import com.exavalu.models.User;
import com.exavalu.utils.JDBCConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserService {
      public static UserService userService = null;
    
    private UserService(){}
    
    public static UserService getInstance()
    {
        if(userService==null)
        {
            return new UserService();
        }
        else
        {
            return userService;
        }
    }
    
    public boolean doLogin(User user)
    {
        boolean success = false;
        
        String sql = "SELECT * FROM employeedb.users where emailAddress = ? and password = ?;";
        
        try {
            Connection con = JDBCConnectionManager.getMySQLConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            
            System.out.println("LoginService :: "+ps);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                success = true;
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        return success;
    }
    
        public boolean doSignUp(User user)
    {
       
        
        String sql = "INSERT INTO employeedb.users(emailAddress,password,firstName,lastName,status,phoneNumber, addressLiinel, addressLine2, countryCode, stateCode, distCode)\n" +
"VALUES(? ,? ,? ,? ,1,?,?,?,?,?,? );";
           
        
        try {
            Connection con = JDBCConnectionManager.getMySQLConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
             ps.setString(3, user.getFirstName());
              ps.setString(4, user.getLastName());
            ps.setString(5, user.getPhoneNumber());
            ps.setString(6, user.getAddressLiinel());
            ps.setString(7, user.getAddressLine2());
            ps.setString(8, user.getCountryCode());
            ps.setString(9, user.getStateCode());
            ps.setString(10, user.getDistCode());
            
            
            System.out.println("LoginService :: "+ps);
            
            ps.executeUpdate();
            return true;
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        return false;
    }

    public ArrayList getAllCountries() {
        ArrayList countryList = new ArrayList();
        Connection con = JDBCConnectionManager.getMySQLConnection();
        try {
            String sql = "SELECT * from countries";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Country country = new Country();
                country.setCountryCode(rs.getString("countryCode"));
            country.setCountryName(rs.getString("countryName"));
            countryList.add(country);
            }
        }
        catch(SQLException e){
            
        }
        return countryList;
    }
    
}