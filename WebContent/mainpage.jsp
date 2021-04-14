<%@ page language="java" import="cmc.account.user.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
<%UserInteraction ui = (UserInteraction)session.getAttribute("loggedInController"); %>
Hello User: <%= ui.displayProfile((String)session.getAttribute("Username")).getFirstName()%>
<p><a href="manageprofile.jsp">Manage My Profile</a></p>
<p><a href="manageschools.jsp">Manage My Saved Schools</a></p>
<p><a href="search.jsp">Search for Schools</a></p>
<br>
<form action="index.jsp">
  <input type="submit" value="Log-out"></input>
</form>
</body>
</html>