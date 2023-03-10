<%@page import="com.exavalu.models.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
    <head>
        <title>Employee Management</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <meta name="theme-color" content="#712cf9">

        <!-- Custom styles for this template -->
        <link href="css/header.css" rel="stylesheet">
        <!--<link href="css/carousel.css" rel="stylesheet">-->
    </head>

    <header class="p-3 text-bg-dark" style="width: 100%">
        <c:set var="login_check" value="${Loggedin}"/>
                   
                        
        <div class="container">
            <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
                <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="d-block mx-auto" role="img" viewBox="0 0 24 24"><title>Product</title><circle cx="12" cy="12" r="10"/><path d="M14.31 8l5.74 9.94M9.69 8h11.48M7.38 12l5.74-9.94M9.69 16L3.95 6.06M14.31 16H2.83m13.79-4l-5.74 9.94"/></svg>
                </a>
                 <c:if test="${login_check!=null}">
                <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                    <li><a onclick="fetchContent('addemployee.jsp','targetId')" class="nav-link px-2 text-white">Add Employee</a></li>
                    <li><a onclick="fetchContent('employeeDetails.jsp','targetId')" class="nav-link px-2 text-white">Show Employee</a></li>
                    <li><a onclick="fetchContent('searchemployee.jsp','targetId')" class="nav-link px-2 text-white">Search Employee</a></li>
                    <li><a href="ApiFetch" class="nav-link px-2 text-white">Api Call</a></li>

                </ul>
                 </c:if>
                <c:if test="${login_check==null}">
                <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                    <li><a href="login.jsp" class="nav-link px-2 text-white">Add Employee</a></li>
                    <li><a href="login.jsp" class="nav-link px-2 text-white" >Show Employee</a></li>
                    <li><a href="login.jsp" class="nav-link px-2 text-white">Search Employee</a></li>
                    <li><a href="login.jsp" class="nav-link px-2 text-white">Api Call</a></li>

                </ul>
                </c:if>
                <div class="text-end">
                    <c:if test="${login_check==null}">

                    <a href="login.jsp">
                        <button type="button" class="btn btn-outline-light me-2" >Login</button>
                    </a>
                    <a href="PreSignUp">
                        <button type="button" class="btn btn-warning">Sign-up</button>
                    </a>
                   </c:if>
                    <c:if test="${login_check!=null}">
                    

                        <a class="nav-link px-2 text-white" href="#">
                            Welcome:<c:out value="${user.getFirstName()} ${user.getLastName()}"/></a>
                    <a href="Logout">
                        <button type="button" class="btn btn-outline-light me-2" >Log Out</button>
                    </a>
                    </c:if>


                </div>
            </div>
        </div>
    </header>
                    <script src="https://code.jquery.com/jquery-3.6.3.js"?
            ??????????? integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM="?
    ??????????? crossorigin="anonymous"></script>
    <script>

        function fetchContent(selectedId,targetId) {
            alert(selectedId);
                            $.ajax({
                                url: selectedId,
                                
                                success: function (responseText) {
                                    $("#" + targetId).html(responseText);
                                }
                            });
                        }
                        


    </script>
    <body>
        <div id="targetId"></div>
    </body>
      <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script src="https://cdn.datatables.net/1.13.1/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.13.1/js/dataTables.bootstrap5.min.js"></script>
        <script>
            $(document).ready(function () {
                $('#example').DataTable();
            });
        </script>