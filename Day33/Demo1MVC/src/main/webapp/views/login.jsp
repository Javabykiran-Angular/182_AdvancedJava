<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"> -->
	<link rel="stylesheet" href="../bootstrap/bootstrap.css">
</head>
<body>
	
	<h2>Welcome to Login Page </h2>
	<div class="container">
		<div class="row">
			<div class="col">
			
			<form action="api/login" method="post">
				<div class="mt-2 mb-2">
					<label>Username::</label>
					<input type="text" name="username" class="form-control" placeholder="Enter The Username..."><br>
					<label>Password::</label>
					<input type="password" name="password" class="form-control" placeholder="Enter The Password..."><br>
					<button type="submit" class="btn btn-success">Login</button>
				</div>

	
			</form>
	
				
			</div>
		</div>
	
	</div>
	
	
	
	
	
</body>
</html>