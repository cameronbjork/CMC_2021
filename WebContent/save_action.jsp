<%@ page language="java" import="cmc.account.user.*"%>

<% UserInteraction ui = (UserInteraction)session.getAttribute("loggedInController");
ui.saveUniversity((String)session.getAttribute("Username"), request.getParameter("Save"));
session.setAttribute("loggedInController", ui);
response.sendRedirect("manageschools.jsp");
%>