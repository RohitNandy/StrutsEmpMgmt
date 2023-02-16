<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<option value="">Select State</option>
<c:forEach items="${ProvinceList}" var="country" >
    <option value=${country.getStateCode()}<c:if test="${country.getStateCode().equalsIgnoreCase(emp.getStateCode())}" > selected </c:if>> ${country.getStateName()} </option>
</c:forEach>
