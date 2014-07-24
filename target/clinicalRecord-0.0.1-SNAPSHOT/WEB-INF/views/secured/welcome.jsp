<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/views/include.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="false"%>

<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>	 
		<c:if test="${userName != null}">
		   <h2>Welcome : ${userName}
	           | <a href="<c:url value="/j_spring_security_logout" />" > Logout</a></h2>  
		</c:if>
	</body>
</html>