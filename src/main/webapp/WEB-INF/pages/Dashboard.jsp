<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jspf"%>
	<div class="alert-alert-success">
			<strong>Total number of employees are ${employeeList.size()}</strong>
		</div>
	<c:set var="employeeList" value="${employeeList}"></c:set>
	<c:if test="${employeeList ne null }">
		<div class="container">
			<table class="table table-hover table-bordered">
				<thead class="thead-dark">
					<tr>
						<th>Employee Id</th>
						<th>FirstName</th>
						<th>LastName</th>
						<th>Gender</th>
						<th>MobileNumber</th>
						<th>EmailId</th>
						<th>Action</th>
					</tr>
				</thead>
				<c:forEach items="${ employeeList}" var="employee">
					<tr>
						<td>${employee.employeeId}</td>
						<td>${employee.firstName}</td>
						<td>${employee.lastName}</td>
						<td>${employee.gender}</td>
						<td>${employee.mobileNumber}</td>
						<td>${employee.emailId}</td>
                         <td><a href="deleteEmployee?employeeId=${employee.employeeId }">
						<img alt="delete" src="img/delete.jpg" Style="height:60px"></a>						
						<a href="registerEmployee?employeeId=${employee.employeeId}&action=edit"><img alt="edit" src="img/edit.png" style="height: 40px"></a>
					</tr>
				</c:forEach>
			</table>


		</div>

	</c:if>
</body>
</html>