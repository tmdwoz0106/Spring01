<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<form action="/test.do" method="POST">
<input type="text" name = "id" value="${cnt }">	
<button type = "submit">전송</button>
</form>	

</body>
</html>
