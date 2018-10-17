<%@page import="com.cg.project.beans.UserBean"%>
<html>
<body>
	<div align="center">
		<table>
			<tr>
				<td>firstName :-</td>
				<td>${requestScope.userBean.firstName}</td>
			</tr>
			<tr>
				<td>lastName :-</td>
				<td>${requestScope.userBean.lastName}%></td>
			</tr>
			<tr>
				<td>bookName :-</td>
				<td>${requestScope.userBean.bookName}</td>
			</tr>
			<tr>
				<td>movieName :-</td>
				<td>${requestScope.userBean.movieName}</td>
			</tr>
			<tr>
				<td>fruitName :-</td>
				<td>${requestScope.userBean.fruitName}</td>
			</tr>
		</table>
	</div>
</body>
</html>