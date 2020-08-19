<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Operation</title>
</head>
<body>
<%@include file="header.jspf"%>

<div class="container">
		<div class="panel panel-primary">
			<div class="panel heading">
				<div class="row">
					<div class="col">
				      <img src="img/edit.jpg"  style="height: 160px;">
						<h3>Update Employee Information</h3>
					</div>
					<div>
				</div>
				</div>
				
				<div class="panel-body">
	
				<c:set var="employee" value="${entity}"></c:set>
	           <c:if test="${not empty employee}"></c:if>
				<form action="/delete"></form>
				<button type="submit"class="btn btn-success">Welcome</button>
				<br/>
								<form action="updateEmployee" method="get"> 
					<div class="row">
						<div class="col-md-3"><label for="employeeId">employeeId*</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="employeeId" value="${employee.employeeId }"/></div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="password">password:</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="password" value="${employee.password }"/></div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="firstName">firstName*</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="firstName" value="${employee.firstName }"/></div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="lastName">lastName*</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="lastName" value="${employee.lastName }"/></div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="gender">gender*</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="gender" value="${employee.gender }"/></div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="salary">salary*</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="salary" value="${employee.salary }"/></div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="address">address*</label></div>
						<div class="col-md-9">
							<select class="form-control" name="address">
								<option ${student.address==Delhi ? 'selected':''}>Texas</option>
									<option ${employee.address==Noida ? 'selected':''}>New York</option>
									<option ${employee.address==Nepal ? 'selected':''}>Nepal</option>
									<option ${employee.address==Ohio ? 'selected':''}>North Carolina</option>
									<option ${employee.address==NewYork ? 'selected':''}>California</option>
									<option ${employee.address==Texas ? 'selected':''}>Hawaii</option>
							</select>
						</div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="mobileNumber">mobileNumber:</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="mobileNumber" value="${employee.mobileNumber }"/></div>
					</div>
					<div class="row">
						<div class="col-md-3"><label for="emailId">emailId:</label></div>
						<div class="col-md-9"><input type="text"  class="form-control" name="emailId" value="${employee.emailId }"/></div>
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