<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
  
<html>  
  <head>  
     <link rel="stylesheet" type="text/css" media="all" href="resources/principal.css"> 
	    <title>
		</title>
	</head>
<body>
<table border="1" cellpadding="2" cellspacing="2" align="left">
    <tr>
        <td>
            <tiles:insertAttribute name="header"/>
        </td>
    </tr>
    <tr>
        <td>
            <tiles:insertAttribute name="body"/>
        </td>
    </tr>
    <tr>
        <td>
            <tiles:insertAttribute name="footer"/>
        </td>
    </tr>
</table>
</body>  
</html>