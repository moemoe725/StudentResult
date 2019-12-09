<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<a href="<c:url value='new_student.htm'/>">Add New Student</a>
<div class="container">
	<table class="table table-dark table-hover table-border">
		<thead>
			<tr>
				<th>No</th>
				<th>Name</th>
				<th>Classes</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${StudentList}" var="std" varStatus="row">
			<tr>
				<td>${row.count }</td>
				<td>${std.name }</td>
				<td>${std.classes.name }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>