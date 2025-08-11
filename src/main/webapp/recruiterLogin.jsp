<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recruiter Login</title>
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

    .login-container {
        background-color: white;
        padding: 30px;
        width: 350px;
        border-radius: 12px;
        box-shadow: 0px 4px 20px rgba(0,0,0,0.15);
        text-align: center;
    }

    .login-container h2 {
        margin-bottom: 25px;
        color: #333;
    }

    .form-group {
        text-align: left;
        margin-bottom: 20px;
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

    .register-link {
        margin-top: 15px;
        font-size: 14px;
        color: #555;
    }

    .register-link a {
        color: #4facfe;
        text-decoration: none;
        font-weight: bold;
    }

    .register-link a:hover {
        text-decoration: underline;
    }
    
    #message{
    	font-family: Arial, sans-serif;
    	color:red;
    }
</style>
</head>

<body>

<div class="login-container">
    <h2>Recruiter Login</h2>
    <form action="recruiterLogin" method="post">
        <div class="form-group">
            <label for="orgName">Organization Name</label>
            <input type="text" name="orgName" id="orgName" required>
        </div>

        <div class="form-group">
            <label for="orgPass">Organization Password</label>
            <input type="password" name="orgPass" id="orgPass" required>
        </div>

		<div id = "message">
	    	<% String message = (String) request.getAttribute("message"); %>
			<% if(message != null) { %>
			<%= message %>
			<% } %>
    	</div>
    	
    	<br>
		
        <button type="submit">Login</button>
    </form>
    <div class="register-link">
        Don't have an account? <a href="recruiterSignUp.jsp">Register</a>
    </div>
</div>

</body>

</html>
