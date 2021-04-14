<%@ page language="java" import="cmc.account.user.*"%>

<%
UserInteraction ui = new UserInteraction();
ui.userEditUser((String)session.getAttribute("Username"), request.getParameter("FirstName"), request.getParameter("LastName"), request.getParameter("PassWord"));
session.setAttribute("loggedInController", ui);
response.sendRedirect("manageprofile.jsp");
%>