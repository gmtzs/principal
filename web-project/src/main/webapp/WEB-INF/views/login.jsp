<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c"    uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div id="loginbox" style="margin-top:50px;" class="mainbox col-md-4 col-md-offset-4 col-sm-8 col-sm-offset-2" >
			
			<div class="panel panel-info" >
				
				<div class="panel-heading">
					<div class="panel-title">Log In</div>
				</div>

				<div style="padding-top:30px" class="panel-body">
				
					<form action="j_spring_security_check" method="POST" role="form" >
					
					<c:if test="${ msg != null}">
						
							<div class="alert alert-danger alert-dismissable fade in">
								<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
								${msg}
							</div>
						
					</c:if>
					
					<div style="margin-bottom: 25px" class="input-group">
						 <span class="input-group-addon">
							<i class="glyphicon glyphicon-user"> </i>
						</span>
						<input  type="text" name="userName" class="form-control" placeholder="Usuario" required="true"  />
					</div>
						
					<div style="margin-bottom: 25px" class="input-group">
						<div class="input-group-addon">
							<i class="glyphicon glyphicon-eye-open"></i>
						</div>		
						<input  type="password" name="pwd" class="form-control" placeholder="Contraseña"  required="true" />
					</div>	
					
					<div style="margin-top:10px" class="form-group">
						<div class="col-sm-12 controls" style="padding-left: 30%;">
							<button type="submit" id="btn-login" value="Log in" class="btn btn-primary" > Aceptar</button>
						</div>	
					</div>
					<input type="hidden" name="${_csrf.parameterName}"	value="${_csrf.token}" />
					
					</form>
						
				</div>	
					
						<a href="#"> Forgot your password?</a>
						<a href="#">Register</a>
					
					
			</div>
		</div>
	</div>
	<div id="domMessage" style="display: none;">
		<h1>We are processing your request. Please be patient.</h1>
	</div>
	
</body>
</html>