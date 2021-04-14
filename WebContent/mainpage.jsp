<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="cmc.account.user.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
<%UserInteraction ui = (UserInteraction)session.getAttribute("loggedInController"); %>
<p> Welcome User: <%= ui.displayProfile(ui.getCurrentUser().getFirstName()).getFirstName() %></p>
<a href="manageprofile.html"><p>Manage My Profile</p></a>
<a href="manageschools.html"><p>Manage My Saved Schools</p></a>
<a href="search.html"><p>Search for Schools</p></a>
<br>
<form action="index.html">
  <input type="submit" value="Log-out"></input>
</form>
</body>
</html>