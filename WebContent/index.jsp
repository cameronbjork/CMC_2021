<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Form</title>
</head>
<body>
<%
	String errorCode = request.getParameter("error");
	if (errorCode != null) {
		int errCode = Integer.parseInt(errorCode);
			if (errCode == -1) {%>
				<p>Invalid Username</p>
			<% } else {%>
				<p>Invalid Password</p>
		<% }}%>
<form method="post" action="login_action.jsp">
<table style="width:25%">
  <tr>
    <td>Username: </td>
    <td><input type="text" name="Username"></input></td>
  </tr>
  <tr>
    <td>Password: </td>
    <td><input type="text" name="Password"></input></td>
  </tr>
</table>
<input type="submit" value="Log-in"></input>
</form>

</body>
</html>