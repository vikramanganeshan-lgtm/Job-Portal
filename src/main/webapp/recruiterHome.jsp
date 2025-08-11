<%@page import="myJobPortal.DTO.Job"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recruiter Home Page</title>
</head>
<body>

<h1>Welcome To Recruiter Home Page </h1>

<a href = "createJob.jsp"> Create Job</a>
<br>

<% List<Job> jobs = (List) request.getAttribute("recruiterJobs"); %>

<table border = "2px">
<tr>
<th>ID</th>
<th>DESIGNATION</th>
<th>EXPERIENCE</th>
<th>LOCATION</th>
<th>SALARY</th>
<th>SKILL</th>
</tr>

<% for(Job job : jobs) {%>

<tr>
<td><%= job.getId() %></td>
<td><%= job.getDesignation() %></td>
<td><%= job.getExperience() %></td>
<td><%= job.getLocation() %></td>
<td><%= job.getSalary() %></td>
<td><%= job.getSkill() %></td>
</tr>

<% } %>

</table>
</body>
</html>