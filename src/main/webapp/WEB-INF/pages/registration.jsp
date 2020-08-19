<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
<%@include file="header.jspf"%>
	<div class="alert-alert-success">
			<strong> Welcome for registration ! </strong>
		</div>

<div class="container">
		<div class="panel panel-primary">
			<div class="panel heading">
				<div class="row">
					<div class="col">
						<h3>Employee Registration</h3>
					</div>
					<div>
				</div>
				</div>
				
				<div class="panel-body">
				<form action=""></form>
				<button type="submit"class="btn btn-success">Welcome</button>
				<br/>
								<form action="registerEmployee" method="post"> 
					<div class="row">
						<div class="col-md-3"><label for="employeeId">employeeId*</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="employeeId"/></div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="password">password:</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="password"/></div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="firstName">firstName*</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="firstName"/></div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="lastName">lastName*</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="lastName"/></div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="gender">gender*</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="gender"/></div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="salary">salary*</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="salary"/></div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="address">address*</label></div>
						<div class="col-md-9">
							<select class="form-control" name="address">
								<option>Texas</option>
								<option>New York</option>
								<option>Nepal</option>
								<option>North Carolina</option>
								<option>California</option>
								<option>Hawaii</option>
							</select>
						</div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="mobileNumber">mobileNumber:</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="mobileNumber"/></div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="emailId">emailId:</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="emailId"/></div>
					</div>
					<a href="index.jsp"><button type="button" class="btn btn-success">Login</button></a>
					<button type="submit" class="btn btn-danger">Registration</button>
					<button type="reset" class="btn btn-success">clear</button>
				</form>
			</div>
			</div>
		</div>
	</div>
</body>
</html>