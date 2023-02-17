package com.exavalu.models;

import com.exavalu.services.ApiService;
import com.exavalu.services.CountryService;
import com.exavalu.services.DistrictService;
import com.exavalu.services.EmployeeService;
import com.exavalu.services.LoginService;
import com.exavalu.services.StateService;
import com.exavalu.services.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import org.apache.log4j.Logger;
import org.apache.struts2.dispatcher.ApplicationMap;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

public class User extends ActionSupport implements ApplicationAware, SessionAware, Serializable {

    private String email;
    private String password;

    private String firstName;
    private String lastName, phoneNumber, addressLiinel, addressLine2, countryCode, stateCode, distCode;
    private SessionMap<String, Object> sessionMap = (SessionMap) ActionContext.getContext().getSession();

    private ApplicationMap map = (ApplicationMap) ActionContext.getContext().getApplication();

    @Override
    public void setApplication(Map<String, Object> application) {
        setMap((ApplicationMap) application);
    }

    @Override
    public void setSession(Map<String, Object> session) {
        setSessionMap((SessionMap<String, Object>) (SessionMap) session);
        getSessionMap().put("Loggedin", NONE);
    }

    public String doLogin() throws Exception {
        String result = "FAILURE";

        boolean success = UserService.getInstance().doLogin(this);

        if (success) {
            System.out.println("returning Success from doLogin method");
            getSessionMap().put("Loggedin", this);
            ArrayList empList = EmployeeService.getInstance().getAllEmployees();
            getSessionMap().put("EmpList", empList);
            result = "SUCCESS";

        } else {
            System.out.println("returning Failure from doLogin method");
            Logger log = Logger.getLogger(User.class.getName());
            log.error("returning Failure from Login method");
            
        }

        return result;
    }

//    public String doPreSignUp() throws Exception {
//        String result = "SUCCESS";
//            ArrayList countryList = UserService.getInstance().getAllCountries();
//            getSessionMap().put("CountryList", countryList);
//            return result;
//    }
    public String getAllEmployee() throws Exception {
        String result = "SUCCESS";

        return result;

    }

    public String doPreSignUp() throws Exception {
        String result = "SUCCESS";
        ArrayList countryList = CountryService.getInstance().getAllCountry();

        sessionMap.put("CountryList", countryList);
        sessionMap.put("Emp", this);
        if (this.countryCode != null) {
            ArrayList stateList = StateService.getInstance().getAllState(this.countryCode);
            sessionMap.put("ProvinceList", stateList);
            sessionMap.put("User", this);
            result = "STATELIST";
        }
        if (this.stateCode != null) {
            ArrayList distList = DistrictService.getInstance().getAllDistrict(this.stateCode);
            sessionMap.put("DistrictList", distList);
            this.setStateCode(this.stateCode);
            sessionMap.put("User", this);
            result = "DISTRICTLIST";
        }
        if (this.addressLine2 != null && this.addressLine2.length() > 0 && this.addressLiinel != null && this.addressLiinel.length() > 0 && this.phoneNumber != null && this.phoneNumber.length() > 0 && this.firstName != null && this.firstName.length() > 0 && this.lastName != null && this.lastName.length() > 0 && this.email != null && this.email.length() > 0 && this.password != null && this.password.length() > 0 && this.stateCode.length() > 1 && this.countryCode.length() > 1 && this.distCode.length() > 1) {
            boolean success = UserService.getInstance().doSignUp(this);

            if (success) {
                result = "DONE";
                sessionMap.put("SuccessSignUp", "Successfully Registered");

            }
            System.out.println(sessionMap);
            return result;
        }
        System.out.println(this.countryCode);
        System.out.println(this.stateCode);
        System.out.println(this.distCode);
        System.out.println(this.email);

        System.out.println(sessionMap);
        return result;

    }

    public String doLogout() {
        String result = "SUCCESS";
        getSessionMap().clear();
        return result;
    }

    public String doSignUp() {
        String result = "FAILURE";
        boolean success = UserService.getInstance().doSignUp(this);
        if (success) {
            String createmsg = "User created !";
            getSessionMap().put("Createmsg", createmsg);

            System.out.println("returning Success from doLogin method");
            result = "SUCCESS";

        } else {
            System.out.println("returning Failure from doLogin method");
        }
        return result;
    }

    public String apiCall() throws Exception {
        String result = "SUCCESS";
        ArrayList userList = ApiService.getInstance().getAllData();
        boolean success = LoginService.getInstance().doSignUpAll(userList);

        if (success) {
            result = "SUCCESS";
            sessionMap.put("SuccessSignUp", "Successfully Registered");

        } else {
            sessionMap.put("FailSignUp", "Email All Ready Exsists");
        }
        System.out.println(sessionMap);
        return result;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the addressLiinel
     */
    public String getAddressLiinel() {
        return addressLiinel;
    }

    /**
     * @param addressLiinel the addressLiinel to set
     */
    public void setAddressLiinel(String addressLiinel) {
        this.addressLiinel = addressLiinel;
    }

    /**
     * @return the addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * @param addressLine2 the addressLine2 to set
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * @return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return the stateCode
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * @param stateCode the stateCode to set
     */
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * @return the distCode
     */
    public String getDistCode() {
        return distCode;
    }

    /**
     * @param distCode the distCode to set
     */
    public void setDistCode(String distCode) {
        this.distCode = distCode;
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
