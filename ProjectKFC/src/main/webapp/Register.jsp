<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Register Kfc</title>
</head>
<body>
	<form action="s1" method="post">
		<div>
			Enter Name:<input type="text" name="name" pattern="[A-Za-z]{3,}"
				title="Enter Name max three characters"><br> <br>
			mobile number: <input type="text" name="mobileNumber"
				pattern="[6-9][0-9]{9}" title="Enter your 10- digit mobile number"><br>
			<br> E Mail : <input type="email" name="mailId"
				pattern="[a-z0-9]+[@][a-z]+[.][a-z]{2,3}"
				title="Enter your mailId In correctly example:kfc@gmail.com"><br>
			<br>

			<button type="submit" value="SignUp">SignUp</button>


		</div>
	</form>
	<a href="login.jsp"><button type="submit" value="SignUp">Login</button></a>
</body>
</html>

