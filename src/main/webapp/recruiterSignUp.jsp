<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recruiter SignUp</title>
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

    .signup-container {
        background-color: white;
        padding: 30px;
        width: 400px;
        border-radius: 12px;
        box-shadow: 0px 4px 20px rgba(0,0,0,0.15);
        text-align: center;
    }

    .signup-container h2 {
        margin-bottom: 25px;
        color: #333;
    }

    .form-group {
        text-align: left;
        margin-bottom: 18px;
    }

    label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
        color: #555;
    }

    input[type="text"], input[type="password"] {
        width: 100%;
        padding: 10px;
        border-radius: 6px;
        border: 1px solid #ccc;
        outline: none;
        transition: 0.3s;
    }

    input[type="text"]:focus, input[type="password"]:focus {
        border-color: #4facfe;
        box-shadow: 0 0 5px rgba(79,172,254,0.5);
    }

    button {
        width: 100%;
        padding: 10px;
        background: linear-gradient(to right, #4facfe, #00f2fe);
        border: none;
        border-radius: 6px;
        font-size: 16px;
        font-weight: bold;
        color: white;
        cursor: pointer;
        transition: 0.3s;
    }

    button:hover {
        background: linear-gradient(to right, #00f2fe, #4facfe);
    }

    .login-link {
        margin-top: 15px;
        font-size: 14px;
        color: #555;
    }

    .login-link a {
        color: #4facfe;
        text-decoration: none;
        font-weight: bold;
    }

    .login-link a:hover {
        text-decoration: underline;
    }
</style>
</head>

<body>

<div class="signup-container">
    <h2>Recruiter SignUp</h2>
    <form action="recruiterSignUp" method="post">
        <div class="form-group">
            <label for="orgName">Organization Name</label>
            <input type="text" name="orgName" id="orgName" required>
        </div>

        <div class="form-group">
            <label for="orgPass">Organization Password</label>
            <input type="password" name="orgPass" id="orgPass" required>
        </div>

        <div class="form-group">
            <label for="orgAbout">Organization About</label>
            <input type="text" name="orgAbout" id="orgAbout" required>
        </div>

        <div class="form-group">
            <label for="orgWebsite">Organization Website</label>
            <input type="text" name="orgWebsite" id="orgWebsite" required>
        </div>

        <div class="form-group">
            <label for="orgEmpCount">Organization Employee Count</label>
            <input type="text" name="orgEmpCount" id="orgEmpCount" required>
        </div>

        <button type="submit">Sign Up</button>
    </form>
    <div class="login-link">
        Already registered? <a href="recruiterLogin.jsp">Login</a>
    </div>
</div>

<% String message = (String) request.getAttribute("message"); %>
<% if(message != null) { %>
<%= message %>
<% } %>

</body>

</html>
