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
 <%System.out.println("I m inside my emplist ***********************************jsp"); %> 
  <div class="container">
  <div class="alert-alert-success">
			<strong> Welcome to my Portal</strong>
		</div>
 
	<c:if test="${employeeList ne null }">
	
	${recordStarts} - ${recordStarts+pageSize-1}  of  ${totalRecords}
	${recordStarts}
	
	<c:if test="${recordStarts ne null }">
	${recordStarts }
		 <a href="${pageContext.request.contextPath}/pagination?pageid=${pageid-1}">
	 <img src="${pageContext.request.contextPath}/img/previous.png"></a>
	
	<c:if test="${recordStarts+pageSize-1 gt totalRecords}">
	pageSize-${pageSize }
	totalRecords--${totalRecords }
	what is value ---${recordStarts+pageSize-1 gt totalRecord }
	 	 <a href="${pageContext.request.contextPath}/pagination?pageid=${pageid+1}">
	  <img src="${pageContext.request.contextPath}/img/next.png"></a>  
	</c:if>
	  
		  <table class="table table-hover table-bordered">
            <thead class="thead-dark">
            <tr>
                 <th> EmployeeId  </th>
                 <th> FirstName  </th>
                 <th> LastName  </th>
                 <th> Gender  </th>
                 <th> MobileNumber  </th>
                 <th> EmailId  </th>
                 <th> Action  </th>
            </tr>
            </thead>
            <c:forEach items="${employeeList}" var="employee">
                <tr>
                   <td>${employee.employeeId} </td>
                   <td>${employee.firstName} </td>
                   <td>${employee.lastName} </td>
                   <td>${employee.gender} </td>
                   <td>${employee.mobileNumber} </td>
                    <td>${employee.emailId} </td>
                    <td> <a href="editEmployee?sid=${employee.employeeId}"><img src="img/edit.png" style="height:50px"></a>
                    <a href="deleteEmployee?sid=${employee.employeeId}"><img src="img/delete.png" style="height:50px"></a></td>
              </c:forEach>
             </table>       
	</c:if>
  
</div>
</body>
</html>