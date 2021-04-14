<%@ page language="java" import="cmc.account.user.*"%>

<%
UserInteraction ui = new UserInteraction();
int result = ui.logOn(request.getParameter("Username"), request.getParameter("Password")); //do login
if (result == 0) {
	session.setAttribute("loggedInController", ui); 
	session.setAttribute("Username", request.getParameter("Username"));
	response.sendRedirect("mainpage.jsp");
} else if (result == -1) {
	response.sendRedirect("index.jsp?error=-1");
}else if (result == -2) {
	response.sendRedirect("index.jsp?error=-2");
}
else if (result == -3){
	response.sendRedirect("index.jsp?error=-3");
}
%>