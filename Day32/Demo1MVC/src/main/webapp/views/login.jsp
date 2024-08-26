<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h2>Welcome to JSP </h2>
	
	<%!
		int count=0; // Forward declaration & Defination
	%>
	
	<% 
	 count++;
	
		if(count%2==0){
			//out.println("Even Number"+count);
		%>
		<h3 style="color:green;">Even Number</h3>
		<%
		}
		else{
			//out.println("Odd Number");
			%>
			<h3 style="color:red;">Odd Number..</h3>
			<%
			
		}
	
	%> 
	
	<h2>Count value is  <%=count %> </h2>
	
	
	
</body>
</html>