<%@page import="com.cg.project.beans.UserBean"%>
<%@page session="false" %>
<html>
<body>
	<div align="center">
	<%
			HttpSession session=request.getSession(false);
			UserBean userBean=null;
			if(session==null)
				response.sendRedirect("personalInfoPage.jsp");
			else
				userBean=(UserBean)session.getAttribute("userBean");
		%>

		<table>
			<tr>
				<td>firstName :-</td>
				<td><%=userBean.getFirstName()%></td>
			</tr>
			<tr>
				<td>lastName :-</td>
				<td><%=userBean.getLastName()%></td>
			</tr>
			<tr>
				<td>bookName :-</td>
				<td><%=userBean.getBookName()%></td>
			</tr>
			<tr>
				<td>movieName :-</td>
				<td><%=userBean.getMovieName()%></td>
			</tr>
			<tr>
				<td>fruitName :-</td>
				<td><%=userBean.getFruitName()%></td>
			</tr>
		</table>
	</div>
</body>
</html>