<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUpPage</title>
</head>
<body>
	<h2 style="text-align: center; color: Red">Registration Form</h2>
	<form style="text-align: center" action="SignUp" method="post">
		<table align="center">
			<tr>
				<td>Name: <input type="text" name="name" required>
				<td>
			</tr>
			<tr>
				<td>PhoneNo: <input type="text" name="phoneNo" required></td>
			</tr>
			<tr>
				<td>EmailId: <input type="email" name="emailId" required></td>
			</tr>

			<tr>
				<td>Hobbies: <input type="checkbox" name="hobbies"
					value="cricket">Cricket<br> <input type="checkbox"
					name="hobbies" value="singing">Singing<br> <input
					type="checkbox" name="hobbies" value="dancing">Dancing<br>
					<input type="checkbox" name="hobbies" value="swimming">Swimming
				</td>
			</tr>
			<tr>
				<td>DateOfBirth:<input type="date" name="dateOfBirth" required>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
				<td><input type="reset" value="reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>