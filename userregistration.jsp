<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee register</title>
<link rel="stylesheet" type="text/css" href="/style.css">
</head>
<body>
<body>
<div class="header1">
<h1>ChargeBack Calculator - UserRegistration</h1>
</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form action="/user/userregistration" method="post"  modelAttribute="userreg"  style="margin-top:50px;">
<table>
<tr>
<td>FirstName :</td>
<td>
<form:input path="firstname" class="form-control"/>
<br>
<form:errors path="firstname" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td>LastName :</td>
<td>
<form:input path="lastname" class="form-control"/>
<br>
<form:errors path="lastname" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td>Age :</td>
<td>
<form:input path="age" class="form-control"/>
<br>
<form:errors path="age" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td>Gender :</td>
<td>
Female: <form:radiobutton path="gender" value="f"  class="form-control"/>
Male: <form:radiobutton path="gender" value="m"  class="form-control"/>
Others: <form:radiobutton path="gender" value="others"  class="form-control"/>
<form:errors path="gender" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td>Contact Number :</td>
<td>
<form:input path="contactNumber" class="form-control"/>
<br>
<form:errors path="contactNumber" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td>City :</td>
<td>
<ul>
<form:select path="city"  >
<option value="-1"> Make a selection     : </option>
<option value="hyderabad">Hyderabad<option>
<option value="secunderbad" >Secunderbad</option>
<option value="warangal" >Warangal</option>
<option value="nagarkurnool" >Nagarkurnool</option>
<option value="kammam">Kammam</option>
<option value="nizambad" >Nizambad</option>
<option value="suryapet" >Suryapet</option>
<option value="nellore">Nellore</option>
<option value="vijayawada" >vijayawada</option>
<option value='Others'>
</option>
</form:select>
</ul>
<br>
<form:errors path="city" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td>State :</td>
<td>
<ul>
<form:select path="state"  >
<option value=''> Make a selection       :</option>
<option value="telangana">Telangana<option>
<option value="andhra pradesh" >Andhra Pradesh</option>
<option value="taminadu" >Tamilnadu</option>
<option value="maharastra" >Maharastra</option>
<option value="delhi">Delhi</option>
<option value="kerala" >Kerala</option>
<option value="up" >UP</option>
<option value="rajastan">Rajastan</option>
<option value="mp" >MP</option>
<option value='Others'>
</option>
</form:select>
</ul>
<br>
<form:errors path="state" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td>UerId :</td>
<td>
<form:input path="userid" class="form-control"/>
<br>
<form:errors path="userid" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td>Password:</td>
<td><form:password path="password" class="form-control"/>
<br>
<form:errors path="password" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Register" class="formsubmitbutton" />
</tr>
</table>
</form:form>
</div>
<a href="/">Home</a>
</div>
</body>
