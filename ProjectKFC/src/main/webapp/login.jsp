<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login KFC</title>
</head>
<body>
	<form action="login" method="post">
		<div>
			Mail ID:<input type="email" name="mailId"> <br> <br>
			Mobile Number:<input type="number" name="mobileNumber"> <br>
			<br>
			<button type="submit">Login</button>
		</div>
	</form>
	<br> if you don't have account?
	<a href="Register.jsp">SignUp</a>
</body>
</html>