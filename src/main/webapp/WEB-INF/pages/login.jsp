<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<%@ include file="header.jspf" %>
  <br/>
  <div class="container">
<form action="employeeLogin" method="post"> 
  <b>EmailId</b>
  <input type="text" name="emailId" class="form-control" required="required" style="width:60%">
  <br/>
  <b>Password</b>
  <input type="password" name="password" class="form-control" required="required" style="width:60%">
  <br/>
  <button type="submit" class="btn btn-success" style="background color:green">Login</button>
  <button type="reset" class="btn btn-danger" style="background color:red"> Registration</button>
  <a href="registration.jsp"></a>
  <button type="reset" class="btn btn-primary" style="background color:blue">Clear</button>
</form>
</div>
</body>
</html>