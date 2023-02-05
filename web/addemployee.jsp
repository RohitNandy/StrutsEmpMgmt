<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="com.exavalu.services.DepartmentService"%>
<%@page import="com.exavalu.services.RoleService"%>
<%@page import="com.exavalu.models.Role"%>
<%@page import="com.exavalu.models.Employee"%>
<%@page import="com.exavalu.models.Department"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">        
        <title>Employee Management</title>      
        <link href="css/bootstrap.min.css" rel="stylesheet" >
        <link href="css/signin.css" rel="stylesheet"> 
        <link href="css/menu_css.css" rel="stylesheet" >
        <link href="css/product.css" rel="stylesheet" >
        <!-- Custom styles for this template -->
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>

            <main class="form-signin w-100 m-auto">

                <form action="AddEmployee" method="post">

                    <img class="mb-4" src="images/flower-logo.jpg" alt="" width="150" height="150">

                    <h1 class="h3 mb-3 fw-normal">Add Employee Data</h1>





                    <div class="form-floating">
                        <input type="text" class="form-control" id="floatingInput" placeholder="first name" name="firstName"  maxlength="45" required>
                        <label for="floatingInput">First Name</label>
                    </div>

                    <div class="form-floating">
                        <input type="text" class="form-control" id="floatingInput" placeholder="last name" name="lastName"  maxlength="45" required>
                        <label for="floatingInput">Last Name</label>
                    </div>


                    <div class="form-floating">
                        <input type="text" class="form-control" id="floatingInput" placeholder="address" name="address" required maxlength="45">
                        <label for="floatingInput">Address</label>
                    </div>

                    <div class="form-floating">
                        <input type="text" class="form-control" id="floatingInput" placeholder="phone" name="phone" required maxlength="13" pattern="[0-9]{3}[0-9]{3}[0-9]{4}">
                        <label for="floatingInput">Phone</label>
                    </div>

                    <div class="form-floating">
                        <select name="gender" class="form-select" id="gender" required>
                            <option value="">Select Gender</option>
                            <option value="Male">Male</option>  
                            <option value="Female">Female</option> 
                            <option value="Other">Other</option> 
                        </select>
                        <label for="floatingInput">Gender</label>
                    </div>

                    <div class="form-floating">
                        <input type="text" class="form-control" id="floatingInput" placeholder="age" name="age" min="1" max="120" required>
                        <label for="floatingInput">Age</label>
                    </div>

                    <div class="form-floating">
                    <c:set var="departmentList" value="${DepartmentService.getAllDepartment()}" />
                    <c:set var="itr" value="${departmentList.iterator()}" />
                    <select name="departmentId" class="form-select" id="departmentId" required>
                        <option value="">Select Department</option>
                        <c:forEach items="${departmentList}" var="dept">
                            <option value="${dept.departmentId}">${dept.departmentName}</option>
                        </c:forEach>
                    </select>
                    <label for="floatingInput">Department</label>
                </div>




                </div>
                <div class="form-floating">
                    <c:set var="roleList" value="${RoleService.getAllRole()}" />
                    <c:set var="itr" value="${roleList.iterator()}" />
                    <select name="roleId" class="form-select" id="roleId" required>
                        <option value="">Select Role</option>
                        <c:forEach items="${roleList}" var="role">
                            <option value="${role.roleId}">${role.roleName}</option>
                        </c:forEach>
                    </select>
                    <label for="floatingInput">Role</label>
                </div>

                <div class="form-floating">
                    <input type="number" value= 0 class="form-control" id="floatingInput" placeholder="basicSalary" name="basicSalary" min="0" required>
                    <label for="floatingInput">Basic Salary</label>
                </div>

                <div class="form-floating">
                    <input type="number" value=0 class="form-control" id="floatingInput" placeholder="carAllaowance" name="carAllaowance" min="0" required>
                    <label for="floatingInput">Car Allowance</label>
                </div>

                <button class="w-100 btn btn-lg btn-primary" type="submit">Save</button>

            </form>
        </main>

    </body>
</html>