<%@ page language="java" import="cmc.account.user.*, java.util.ArrayList, cmc.university.*"%>

<%
UserInteraction ui = (UserInteraction)session.getAttribute("loggedInController");
ArrayList<University> searchResults = new ArrayList<University>();

int minStudents = -1;
if (!request.getParameter("minStudents").equals("")) {
	minStudents = Integer.parseInt(request.getParameter("minStudents"));
}

int maxStudents = -1;
if (!request.getParameter("maxStudents").equals("")) {
	maxStudents = Integer.parseInt(request.getParameter("maxStudents"));
}

int minFemale = -1;
if (!request.getParameter("minFemale").equals("")) {
	minFemale = Integer.parseInt(request.getParameter("minFemale"));
}

int maxFemale = -1;
if (!request.getParameter("maxFemale").equals("")) {
	maxFemale = Integer.parseInt(request.getParameter("maxFemale"));
}

int minSATVerbal = -1;
if (!request.getParameter("minSATVerbal").equals("")) {
	minSATVerbal = Integer.parseInt(request.getParameter("minSATVerbal"));
}

int maxSATVerbal = -1;
if (!request.getParameter("maxSATVerbal").equals("")) {
	maxSATVerbal = Integer.parseInt(request.getParameter("maxSATVerbal"));
}

int minSATMath = -1;
if (!request.getParameter("minSATMath").equals("")) {
	minSATMath = Integer.parseInt(request.getParameter("minSATMath"));
}

int maxSATMath = -1;
if (!request.getParameter("maxSATMath").equals("")) {
	maxSATMath = Integer.parseInt(request.getParameter("maxSATMath"));
}

int minExpenses = -1;
if (!request.getParameter("minExpenses").equals("")) {
	minExpenses = Integer.parseInt(request.getParameter("minExpenses"));
}

int maxExpenses = -1;
if (!request.getParameter("maxExpenses").equals("")) {
	maxExpenses = Integer.parseInt(request.getParameter("maxExpenses"));
}

int minAid = -1;
if (!request.getParameter("minAid").equals("")) {
	minAid = Integer.parseInt(request.getParameter("minAid"));
}

int maxAid = -1;
if (!request.getParameter("maxAid").equals("")) {
	maxAid = Integer.parseInt(request.getParameter("maxAid"));
}

int minApplicants = -1;
if (!request.getParameter("minApplicants").equals("")) {
	minApplicants = Integer.parseInt(request.getParameter("minApplicants"));
}

int maxApplicants = -1;
if (!request.getParameter("maxApplicants").equals("")) {
	maxApplicants = Integer.parseInt(request.getParameter("maxApplicants"));
}

int minAdmitted = -1;
if (!request.getParameter("minAdmitted").equals("")) {
	minAdmitted = Integer.parseInt(request.getParameter("minAdmitted"));
}

int maxAdmitted = -1;
if (!request.getParameter("maxAdmitted").equals("")) {
	maxAdmitted = Integer.parseInt(request.getParameter("maxAdmitted"));
}

int minEnrolled = -1;
if (!request.getParameter("minEnrolled").equals("")) {
	minEnrolled = Integer.parseInt(request.getParameter("minEnrolled"));
}

int maxEnrolled = -1;
if (!request.getParameter("maxEnrolled").equals("")) {
	maxEnrolled = Integer.parseInt(request.getParameter("maxEnrolled"));
}

int minAcademicScale = -1;
if (!request.getParameter("minAcademicScale").equals("")) {
	minAcademicScale = Integer.parseInt(request.getParameter("minAcademicScale"));
}

int maxAcademicScale = -1;
if (!request.getParameter("maxAcademicScale").equals("")) {
	maxAcademicScale = Integer.parseInt(request.getParameter("maxAcademicScale"));
}

int minSocialScale = -1;
if (!request.getParameter("minSocialScale").equals("")) {
	minSocialScale = Integer.parseInt(request.getParameter("minSocialScale"));
}

int maxSocialScale = -1;
if (!request.getParameter("maxSocialScale").equals("")) {
	maxSocialScale = Integer.parseInt(request.getParameter("maxSocialScale"));
}

int minQOL = -1;
if (!request.getParameter("minQOL").equals("")) {
	minQOL = Integer.parseInt(request.getParameter("minQOL"));
}

int maxQOL = -1;
if (!request.getParameter("maxQOL").equals("")) {
	maxQOL = Integer.parseInt(request.getParameter("maxQOL"));
}

searchResults.addAll(ui.searchUniversities(request.getParameter("schoolName"), request.getParameter("state"), request.getParameter("location"), request.getParameter("control"), minStudents, maxStudents, minFemale, maxFemale, minSATVerbal, maxSATVerbal, minSATMath, maxSATMath, minExpenses, maxExpenses, minAid, maxAid, minApplicants, maxApplicants,
		minAdmitted, maxAdmitted, minEnrolled, maxEnrolled, minAcademicScale, maxAcademicScale, minSocialScale, maxSocialScale, minQOL, maxQOL, request.getParameter("emphasis1"), request.getParameter("emphasis2"), request.getParameter("emphasis3"), request.getParameter("emphasis4"), request.getParameter("emphasis5")));
session.setAttribute("searchResults", searchResults);
session.setAttribute("loggedInController", ui);
response.sendRedirect("searchresults.jsp");
%>