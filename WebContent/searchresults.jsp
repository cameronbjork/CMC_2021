<%@ page language="java" import="cmc.account.user.*, java.util.ArrayList, cmc.university.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Results</title>
</head>
<body>
<%  UserInteraction ui = (UserInteraction)session.getAttribute("loggedInController");
	ArrayList<University> searchResults = new ArrayList<University>();
	searchResults.addAll((ArrayList<University>)session.getAttribute("searchResults"));
	%>
    <p><a href="search.jsp">back to Search Menu</a><p>
    <form>
       <table width="60%" border="1">
	 <tr>
	   <th> School</th>
	 </tr>
	<%for (int i = 0; i < searchResults.size(); i++) { %>
	 <tr>
	   <td width="10%"><input type="submit" formaction="save_action.jsp" name="Save" value="<%searchResults.get(i).getUniName();%>"></input></td>
	   <th width="80%"><%= searchResults.get(i).getUniName() %></th>
	   <th width="10%"><button type="submit" formaction="viewsearch_action.jsp" name="View" value="<%searchResults.get(i).getUniName();%>">View</button></th>
	   </tr>
	   <%} %>
       </table>
	</form>
	
	

</body>
</html>