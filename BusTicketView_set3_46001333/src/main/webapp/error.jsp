<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error Page</title>
</head>
<body>
<h3>Request cannot be forwarded due to ...</h3>
<div style="color:red;font:15pt verdana">
	<b><%= exception %></b>
</div>
</body>
</html>