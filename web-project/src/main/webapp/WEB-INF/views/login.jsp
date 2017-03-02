<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c"    uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/style.css" />
<script type=text/javascript src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type=text/javascript src="resources/functions.js"></script>
<script type=text/javascript src="resources/jquery.blockUI.js"></script>
</head>
<body>
	<div id="login">
		<form:form action="Sign.htm" modelAttribute="user" method="POST" >
			<h1>Log In</h1>
			<fieldset id="inputs">
				<form:input path="userName" placeholder="U s u a r i o" required="true" /> 
				<form:password path="pwd" placeholder="C o n t r a s e ñ a"  required="true" />
			</fieldset>
			<fieldset id="actions">
				<input type="submit" id="submit" value="Log in"> <a href="">Forgot
					your password?</a><a href="">Register</a>
			</fieldset>
		</form:form>
	</div>
	<div id="domMessage" style="display: none;">
		<h1>We are processing your request. Please be patient.</h1>
	</div>
</body>
</html>