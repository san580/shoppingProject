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
  <div class="alert-alert-success">
  <form action="uploadImage?dtoEmploye=${employee}" method="post" enctype="multipart/form-data">
  Upload Photo
   <input type="file" name ="Image" class="form-control" style="background color:green" >
     <button type="submit" class="btn btn-primary" style="background color:green">Upload</button>
  </form>
  <br/>
			<strong> Welcome to my Portal</strong>
		</div>
  
 
	<c:if test="${employee ne null }"> 
		  <table class="table table-hover table-bordered">
            <thead class="thead-dark">
            <tr>
               <th> My Employee Data  </th>
                 <th> Employee Information  </th>
            </tr>
            </thead>
                <tr>
                    <td>EmployeeId<td>${employee.employeeId} </td>
                 </tr>
                 <tr>
                    <td>FirstName<td>${employee.firstName} </td>
                 </tr>
                 <tr>
                    <td>LastName<td>${employee.lastName} </td>
                 </tr>
                 <tr>
                    <td>Gender<td>${employee.gender} </td>
                 </tr>
                 <tr>
                    <td>MobileNumber<td>${employee.mobileNumber} </td>
                 </tr>
                 <tr>
                    <td>EmailId<td>${employee.emailId} </td>
                 </tr>
             </table>       
	</c:if>
  
</div>
</body>
</html>