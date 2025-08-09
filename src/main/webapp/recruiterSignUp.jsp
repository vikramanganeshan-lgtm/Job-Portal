<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recruiter SignUp</title>
</head>
<style>
body{
background-image: url("https://evalground.com/blog/wp-content/uploads/2017/04/What-Next_.png");
background-repeat: no-repeat;
background-size: cover;
}
#outerBody{
margin-top: 160px;
margin-left: 360px;
width: 600px;
}
#myDiv{
border-left: 1px solid black;
border-right: 1px solid black;
border-bottom: 1px solid black;
height: 50vh;
background-color: beige;
padding-top: 30px;
}
label{
margin-left: 130px;
margin-top: 50px;
}
#head{
border: 1px solid black;
background-color: aqua;
margin-top: 50px;
}
h2{
margin-left: 220px;
}
#btn{
margin-left: 270px;
padding: 10px;
background-color: aqua;
border-radius: 5px;
border: 0.2px solid aqua;
margin-top: 40px;
}
span{
margin-left: 200px;
}
</style>
<body>
<div id = "outerBody">
<div id = "head">
<h2>Recruiter SignUp</h2>
</div>
<div id = "myDiv">
<form action = "recruiterSignUp.jsp" method = "get">
<label for = "orgName">Organization Name : </label>
<input type = "text" name = "orgName" required> <br> <br>
<label for = "orgPass">Organization Password : </label>
<input type = "password" name = "orgPass" required> <br> <br>
<label for = "orgAbout">Organization About : </label>
<input type = "text" name = "orgAbout" required> <br> <br>
<label for = "orgWebsite">Organization WebSite : </label>
<input type = "text" name = "orgWebsite" required> <br> <br>
<label for = "orgEmpCount">Organization Employee Count : </label>
<input type = "text" name = "orgEmpCount" required> 
<button id = "btn">Submit</button> <br> <br>
<span>If already registered ? </span>
<a href = "recruiterLogin.jsp">Login</a>
</form>
</div>
</div>
</body>
</html>