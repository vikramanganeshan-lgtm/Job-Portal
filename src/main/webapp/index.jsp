<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Job Portal - Welcome</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(to right, #4facfe, #00f2fe);
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .welcome-container {
        background-color: white;
        padding: 40px;
        width: 450px;
        border-radius: 12px;
        box-shadow: 0px 4px 20px rgba(0,0,0,0.15);
        text-align: center;
    }

    h1 {
        color: #333;
        margin-bottom: 25px;
    }

    .option {
        margin: 20px 0;
        font-size: 16px;
        color: #555;
    }

    a {
        color: white;
        background: linear-gradient(to right, #4facfe, #00f2fe);
        padding: 8px 14px;
        border-radius: 6px;
        text-decoration: none;
        font-weight: bold;
        transition: 0.3s;
    }

    a:hover {
        background: linear-gradient(to right, #00f2fe, #4facfe);
    }
</style>
</head>
<body>

<div class="welcome-container">
    <h1>Hello User, Welcome to our Job Portal</h1>
    <div class="option">
        To create a recruiter account: 
        <a href="recruiterSignUp.jsp">Sign Up</a>
    </div>
    <div class="option">
        If you are an existing recruiter: 
        <a href="recruiterLogin.jsp">Login</a>
    </div>
</div>

</body>
</html>
