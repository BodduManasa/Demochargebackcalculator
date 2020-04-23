<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
           <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmployeeLogin Page</title>
</head>
<body>
<div class="header1">
<h1>ChargeBackcalculator - EmployeeLogin</h1>

</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form action="/emplogin" method="post" modelAttribute="employeelog" style="margin-top:50px;">

<table>
<tr>
<td>Name :</td>
<td>

<form:input path="empid" class="form-control"/>
<br>
<form:errors path="empid" cssClass="errors"></form:errors>
</td>
</tr>

<tr>
<td>Password :</td>
<td><form:password path="password" class="form-control"/>
<br>
<form:errors path="password" cssClass="errors"></form:errors>
</td>
</tr>
<tr>

<td colspan="2" align="center"><input type="submit" value="Login" class="formsubmitbutton" />

</tr>
</table>



</form:form>


</div>

<span>New Employee? </span><a href="employeeregister">Register</a>
</div>


</body>
</html>