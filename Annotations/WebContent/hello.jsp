<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Files</title>
</head>
<body>
<%@ include file="File1.txt"%>
<jsp:include page="File2.txt"/> 

<% out.print( new java.util.Date()); %>

<%@ page import="java.util.Date" %>

<%= new Date() %>

</body>
</html>