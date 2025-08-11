<%@page import="myJobPortal.DTO.Recruiter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Job</title>
</head>
<body>

<h1>Welcome to create job page</h1>

<% HttpSession sess = request.getSession(); %>
<% Recruiter recruiter = (Recruiter) sess.getAttribute("sessionData"); %>

<% if(recruiter != null) {%>

<h2><%= recruiter.getOrganizationName() %></h2>

<% } %>

<form action="createJob" method = "post">
Designation: <input type = "text" name = "designation"> <br> <br>
Salary: <input type = "text" name = "salary"> <br> <br>
Experience: <input type = "text" name = "experience"> <br> <br>
Location: <input type = "text" name = "location"> <br> <br>
Skill: <input type = "text" name = "skill"> <br> <br>

<input type = "submit">
</form>

</body>
</html>