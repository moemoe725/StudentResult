<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style>
.error{
color:red;
}
</style>
<script>
$(document).ready(function(){
	
	$("#classes_id").change(function(){
		var classesId=this.value;
		$.get("http://localhost:8080/StudentResult/getStudentListByClasses/"+classesId,function(data,status){
		$("#std_id").empty();
	    $.each(data,function(value,k){
	    	$("#std_id").append("<option value="+k.id+">" +k.name+"</option>");
	    });
	  });
	});
});
</script>
<script>
$(document).ready(function(){
	$("#classes_id").change(function(){
		var classesId=this.value;
		$.get("http://localhost:8080/StudentResult/getSubjectListByClasses/"+classesId,function(data,status){
			$("#sub_id").empty();
			$.each(data,function(value,k){
				$("#sub_id").append("<option value="+k.id+">"+k.name+"</option>")
			})
		});
	});
})
</script>
</head>
<body>
	<div class="jumbotron">
	<form:form action="newMark.htm" method="POST" modelAttribute="markDto" class="form-group">
		<label>Name<span class="error">*</span></label>
		<form:input path="name" class="form-control" /><form:errors path="name" cssClass="error"/><br>
		<label>Classes_id</label>
		<form:select path="classes_id" items="${classesList}" itemLabel="name" itemValue="id" class="form-control"></form:select>
		<label>Student_id<span class="error">*</span></label>
		<form:select path="std_id"  class="form-control"/><form:errors path="std_id" cssClass="error"/><br>
		<label>Subject_id</label>
		<form:select path="sub_id" class="form-control"></form:select>
		<label>Semister_id<span class="error">*</span></label>
		<form:select path="sem_id" items="${semisterList}" itemLabel="name" itemValue="id" class="form-control"/><form:errors path="sem_id" cssClass="error"/><br>
		<label>GiveMark</label>
		<form:input path="giveMark" class="form-control"/><br>
		<label>GetMark</label>
		<form:input path="getMark" class="form-control"/>
		<input type="submit" value="Save"/>
	</form:form>
	</div>
</body>
</html>

<%-- <form:input path="classes_id" class="form-control"/><br> --%>
<%-- <form:select path="sub_id" items="${SubjectList}" itemLabel="name" itemValue="id" class="form-control"></form:select> --%>