<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./bootstrap/bootstrap.css"/>
</head>
<body>

<h2>Welcome to Login</h2>

	<div class="container">
		<div class="row">
			<div class="col">
			<form action="LoginServlet" method="post">
				<div class="mt-3 mb-2">
					<label>Username::</label>
					<input type="text" name="username" class="form-control" placeholder="Enter the Usernamer"><br>
					<label>Password::</label>
					<input type="password" name="password" class="form-control" placeholder="Enter the Password"><br>
					<button type="submit" class="btn btn-success">Login</button>
					
				</div>
				
			</form>
			
			</div>
		</div>
	</div>

</body>
</html>