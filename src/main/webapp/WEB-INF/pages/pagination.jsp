<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%@ include file="header.jspf"%>
	<br />
	<%System.out.println("I m inside my pagination jsp"); %>
	<div class="container">
		<div class="alert-alert-success">
			<strong> Welcome to my Portal</strong> <br />
			
</div>
  		<c:set var="shownext" value="${recordStarts+pageSize-1}"/>
  		<c:choose>
  			 <c:when test="${shownext lt totalRecords }">
  			 	<c:set var="count" value="${shownext}"/>
  			 </c:when>
  			 <c:otherwise>
  			 	<c:set var="count" value="${totalRecords}"/>
  			 </c:otherwise>
  		</c:choose>
  		
  		<hr/> ${recordStarts} - ${count}  of  ${totalRecords}
  		
  		<c:if test="${recordStarts gt 1 }">
	 <a href="${pageContext.request.contextPath}/pagination?pageid=${pageid-1}">
	 <img src="${pageContext.request.contextPath}/img/previous.png"></a>
	 </c:if>
	 <c:if test="${shownext lt totalRecords }">
	  <a href="${pageContext.request.contextPath}/pagination?pageid=${pageid+1}">
	  <img src="${pageContext.request.contextPath}/img/next.png"></a> 
	  </c:if>
		 

		<c:if test="${employeeList ne null }">
			<table class="table table-hover table-bordered">
				<thead class="thead-dark">
					<tr>
						<th>EmployeeId</th>
						<th>FirstName</th>
						<th>LastName</th>
						<th>Gender</th>
						<th>MobileNumber</th>
						<th>EmailId</th>
						<th>Action</th>
					</tr>
				</thead>
				<c:forEach items="${employeeList}" var="employee">
					<tr>
						<td>${employee.employeeId}</td>
						<td>${employee.firstName}</td>
						<td>${employee.lastName}</td>
						<td>${employee.gender}</td>
						<td>${employee.mobileNumber}</td>
						<td>${employee.emailId}</td>
						<td><a href="editEmployee?sid=${employee.employeeId}"><img
								src="img/edit.png" style="height: 50px"></a> <a
							href="deleteEmployee?sid=${employee.employeeId}"><img
								src="img/delete.png" style="height: 50px"></a></td>
								</tr>
				</c:forEach>
			</table>
		</c:if>

	</div>
</body>
</html>