<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.cg.project.beans.Associate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center; color: blue">
	 <h2>
		Welcome
		<%-- <%
		Associate associate = (Associate) request.getAttribute("associate");
		/* out.print(associate.getName()); */
		%> --%>
		${requestScope.associate.name}  ${requestScope.associate.phoneNo}
	</h2>
	<%-- <%=associate.getName() %> --%>
	
	
	<table align="center" border="3px">
	<tr>
	<th>Name</th>
	<th>PhoneNo</th>
	<th>EmailId</th>
	<th>Hobbies</th>
	<th>DateOfBirth</th>
	</tr>
	<tr>
	<td>
	 ${requestScope.associate.name}
	</td>
	<td>
	${requestScope.associate.phoneNo}
	</td>
	<td>
	${requestScope.associate.emailId}
	</td>
	<td><c:forEach var="hobby" items="${requestScope.associate.hobbies}">
		<c:out value = "${hobby}"/>
	</c:forEach>
	</td> 
	<td>
	${requestScope.associate.dateOfBirth}
	</td>
	</tr>
	</table>
</body>
</html>