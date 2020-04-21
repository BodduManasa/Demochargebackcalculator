<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee register</title>
<link rel="stylesheet" type="text/css" href="/style.css">
<script type="text/javascript">
function validation()
{
	
	var firstname=document.forms["employeeregistrationform"]["FirstName"];
	var lastname=document.forms["employeeregistrationform"]["LastName"];
	var age=document.forms["employeeregistrationform"]["age"];
	var gender=document.forms["employeeregistrationform"]["gender"];
	var Contactnumber=document.forms["employeeregistrationform"]["Contactnumber"];
	var city=document.forms["employeeregistrationform"]["city"];
	var state=document.forms["employeeregistrationform"]["state"];
	var userid=document.forms["employeeregistrationform"]["userid"];
	var password=document.forms["employeeregistrationform"]["password"];
	
	
	
	if(firstname.value=="")
		{
		window.alert("Firstname should not be null, Please enter firstname");
		firstname.focus();
		return false;
		}
	else if(lastname.value=="")
		{
		window.alert("lastname should not be null, please enter lastname");
		lastname.focus();
		return false;
		}
	var uage=/^\d{2}$/
	else if((document.forms.value.match(uage))
		{
		window.alert("Please enter valid age");
		age.focus();
		return false;
		}
	String usergender=request.getParameter("gender");
	else if(!usergender.equals("female")&&!usergender.equals("male")&&!usergender.equals("others"))
		{
		window.alert("Please select gender");
		gender.focus();
		return false;
		}
	var mobilenumber = /^[+91][6-9]\d{9}$/;
	else if((document.forms.value.match(mobilenumber))
		{
		window.alert("Please enter valid mobile number");
		Contactnumber.focus();
		return false;
		}

	else if(document.forms.city.selectedIndex=="")
		{
			alert ( "Please select city!");
			return false;
		}
		var sel = document.getElementById("city");
		//get the selected option
		var selectedCity = sel.options[sel.selectedIndex].text;
		alert("You have selected : "+selectedCity);
		return true;
		else if(document.form.state.selectedIndex=="")
		{
			alert ( "Please select state!");
			return false;
		}

		var sel = document.getElementById("city");
		//get the selected option
		var selectedState = sel.options[sel.selectedIndex].text;
		alert("You have selected : "+selectedState);
		return true;
		
		var usrid=/^\d{3}$/ 
		else if(document.forms.value.match(usrid))
			{
		
			window.alert("Please enter valid userid");
			userid.focus();
			return false;

			}
	String pass=/^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})/
		else if(password==""||(document.forms.value.match(pass))
					{
			window.alert("Plaese enter valid password");
			password.focus();
			return false;
					}
		else 
		return true;
	
	}
</script>

</head>
<body>
<body>
<div class="header1">
<h1>ChargeBack Calculator - EmployeeRegistration</h1>
</div>
<!-- Form  -->
<div align="center">
<div class="forms-data">
<form:form name="employeeregistrationform" action="#" method="post" modelAttribute="empreg" onsubmit="return validation()" style="margin-top:50px;">
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
Female: <form:radiobutton path="gender" value="female" label="female" class="form-control"/>
<br>
Male: <form:radiobutton path="gender" value="male" label="male" class="form-control"/>
<br>
Others: <form:radiobutton path="gender" value="others" label="others" class="form-control"/>
<br>
<form:errors path="gender" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td>Contact Number :</td>
<td>
<form:input path="Contactnumber" class="form-control"/>
<br>
<form:errors path="Contactnumber" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td>City :</td>
<td>
<ul>
<form:select path="city" class="form-control" >
<option value=''> Make a selection </option>
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
<form:input path="others" class="form-control"></form:input></option>
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
<form:select path="state" class="form-control" >
<option value=''> Make a selection </option>
<option value="telangana">Telangana<option>
<option value="andhra pradesh" >Andhra Pradesh</option>
<option value="taminadu" >Tamilnadu</option>
<option value="maharastra" >Maharastra</option>
<option value="delhi">Delhi</option>
<option value="kerala" >Kerala</option>
<option value="up" >UP</option>
<option value="rajastan">Rajastan</option>
<option value="mp" >MP</option>
<option value='Others'><form:input path="others" class="form-control"></form:input>
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
<td>Password :</td>
<td><form:password path="password" class="form-control"/>
<br>
<form:errors path="password" cssClass="errors"></form:errors>
</td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Register"class="formsubmitbutton" />
</tr>
</table>
</form:form>
</div>
<a href="/">Home</a>
</div>
</body>
