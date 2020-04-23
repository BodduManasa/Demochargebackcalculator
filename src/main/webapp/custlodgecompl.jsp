<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration for lodging complaint</title>
<link rel="stylesheet" type="text/css" href="/style1.css"/>
<script type="text/javascript">
function validate(){
	var firstname=document.getElementById("firstName").value;
	var lastname=document.getElementById("lastName").value;
	
	var contactnumber=document.getElementById("contactNumber").value;
	
	
	var emailid=document.getElementById("emailId").value;
	var accountnumber=document.getElementById("accountnumber")
	var pattern= /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	var pattern1=/^((\+[1-9]{1,4}[ \-]*)|(\([0-9]{2,3}\)[ \-]*)|([0-9]{2,4})[ \-]*)*?[0-9]{3,4}?[ \-]*[0-9]{3,4}?$/;
	
	if(firstname==""){
		alert("Please update Mandatory fields");
		document.getElementById("firstName").style.borderColor="red";
		return false;
		}
	 if(lastname==""){
		alert("Please update Mandatory fields");
		document.getElementById("lastName").style.borderColor="red";
		return false;
		}
	 
	 if(contactnumber==""){
		alert("Please update Mandatory fields");
		document.getElementById("contactNumber").style.borderColor="red";
		return false;
		}		
	 
	 if(emailid==""){
			alert("Please update Mandatory fields");
			document.getElementById("adminId").style.borderColor="red";
			
			return false;
		
	  if(!pattern.test(emailid)){
		alert("Please update Mandatory fields");
		document.getElementById("emailId").style.borderColor="red";
		return false;		
		}
	 if(!pattern1.test(contactnumber)){
		alert("Please update Mandatory fields");
		document.getElementById("contactnumber").style.borderColor="red";
		return false;
		}
	
}
</script>
</head>
<body>
<div class="header"/>
<h1>Chargeback Calculator</h1>
</div>
<h2>customer Registration for lodging complaint</h2>
<div class="formdata">
<form:form onsubmit="return validate()" action="custlodgecomp" modelAttribute="" method="post">

<table>
<tr>
<td>FirstName:</td>
<td><form:input path="firstName" id="firstName" /></td>
</tr>
<tr>
<td>LastName:</td>
<td><form:input path="lastName" id="lastName" /></td>
</tr>
<tr>
<td>Contact Number:</td>
<td><form:input path="contactNumber" id="contactNumber" />
</td>
</tr>

<tr>
<td>EmailId:</td>
<td><form:input path="emailId" id="emailId" /></td>
</tr>

<tr>
<td>Account number:</td>
<td><form:input path="accountnumber" id="accountnumber" /></td>
</tr>
</table>
<input type="submit" value ="submit" class="formsubmitbutton"/>
</form:form>

</body>
</div>
</html>