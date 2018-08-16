<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<spring:url value="resources/ticketing.css" var="ticketingCSS"/>
<spring:url value="resources/ticketing.js" var="ticketingJS"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<link href="${ticketingCSS}" rel="stylesheet"/>
<script src="${ticketingJS}"></script>


<title>Spring MVC Tutorial by Crunchify - Hello World Spring MVC Example</title>
<style type="text/css">
body {
	background-image: url('https://cdn.crunchify.com/bg.png');
}
</style>
</head>
<body>
	<br>
	<br>
	<div
		style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">
 
 		<h2>Checkout this font color. Loaded from 'crunchify.css' file under '/WebContent/resources/' folder</h2>
 
		<div id="crunchifyMessage"></div>
 		
 		<%
 			out.println("your IP address is : " + request.getRemoteHost());
 		%>
 		
 		
		Spring MCV Tutorial by <a href="https://crunchify.com">Crunchify</a>.
		Click <a href="https://crunchify.com/category/java-tutorials/" target="_blank">here</a> 
		for all Java and 
		<a href='https://crunchify.com/category/spring-mvc/' target='_blank'>here</a>
		for all Spring MVC, Web Development examples.<br>
	
	</div>
</body>
</html>