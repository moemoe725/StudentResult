<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="insert_sub.htm" method="POST" modelAttribute="subDto">
		<label>Name</label>
		<form:input path="name"></form:input>
		<label>Classes</label>
		<form:select path="classes_id" items="${classesList}" itemLabel="name" itemValue="id" ></form:select>
	</form:form>
</body>
</html>