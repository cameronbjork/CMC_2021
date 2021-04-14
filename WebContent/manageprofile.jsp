<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="cmc.account.user.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Profile</title>
</head>
<body>
<%UserInteraction ui = (UserInteraction)session.getAttribute("loggedInController"); %>
<p><a href="mainpage.jsp">back to main menu</a></p>
<form action="editprofile_action.jsp">
<table border="1" style=" width:600px; height:250px">
<tr>
  <td width="75%">First Name</td>
  <td width="25%"><input type="text" name="FirstName" value="<%= ui.displayProfile((String)session.getAttribute("Username")).getFirstName()%>"></input></td>
</tr>
<tr>
  <td>Last Name</td>
  <td><input type="text" name="LastName" value="<%= ui.displayProfile((String)session.getAttribute("Username")).getLastName()%>"></input></td>
</tr>
<tr>
  <td>Username</td>
  <td><p><%= ui.displayProfile((String)session.getAttribute("Username")).getUserName()%></p></td>
</tr>
<tr>
  <td>Password</td>
  <td><input type="text" name="PassWord" value="<%= ui.displayProfile((String)session.getAttribute("Username")).getPassWord()%>"></input></td>
</tr>
</table>
<table>
  <tr>
    <td><input type="submit" value="Edit Profile"></input></td>
    <td><input type="reset" value="Reset"></input></td>
    
  </tr>
</table>
</form>
</body>
</html>