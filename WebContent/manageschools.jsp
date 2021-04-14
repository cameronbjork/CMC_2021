<%@ page language="java" import="cmc.account.user.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manage Schools</title>
</head>
<body>
    <p><a href = "mainpage.jsp">back to main</a></p>
	<table border="1">
	  <tr>
	    <td>School</td>
	  </tr>
	  <% UserInteraction ui = (UserInteraction)session.getAttribute("loggedInController");
	  	for (int i=0; i < ui.displaySavedUniversities((String)session.getAttribute("Username")).size(); i++) {%>
	  <tr>
	   <td> <input type= "submit" name="Remove" value="Remove"></td>
	   <td><%=ui.displaySavedUniversities((String)session.getAttribute("Username")).get(i).getUniName() %></td>
	   <td> <input type= "submit" name="View" value="View"></td>
	  </tr>
	  <% }%>
</table>
</body>
</html>