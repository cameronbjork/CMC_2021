<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search</title>
</head>
<body>
 <body>
    <p><a href="mainpage.jsp">back to main menu</a></p>
    <h1>Search Menu</h1>
     <form action="search_action.jsp">
     <table width="75%" border="1">
     <tr>
      <th width="25%">by SCHOOL NAME</th>
      <th width="75%">contains <input type="text" name="schoolName"></th>
     </tr>
     <tr>
      <th> by STATE</th>
      <th> contains <input type="text" name="state"></th>
     </tr>

     <tr>
      <th> by LOCATION</th>
      <th> contains <input type="text" name="location">(SUBURBAN, URBAN, SMALL-CITY)></th>
     </tr>

     <tr>
      <th> by CONTROL</th>
      <th> contains <input type="text" name="control">(PRIVATE, STATE, CITY)></th>
     </tr>

     <tr>
      <th> by NUMBER OF STUDENTS</th>
      <th> between <input type="text" name="minStudents"> and <input type="text" name="maxStudents"></th>
     </tr>

     <tr>
      <th> by % FEMALE</th>
      <th> between <input type="text" name="minFemale"> and <input type="text" name="maxFemale"></th>
     </tr>

     <tr>
      <th> by SAT VERBAL</th>
      <th> between <input type="text" name="minSATVerbal"> and <input type="text" name="maxSATVerbal"></th>
     </tr>

     <tr>
      <th> by SAT MATH</th>
      <th> between <input type="text" name="minSATMath"> and <input type="text" name="maxSATMath"></th>
     </tr>

     <tr>
      <th> by EXPENSES</th>
      <th> between <input type="text" name="minExpenses"> and <input type="text" name="maxExpenses"></th>
     </tr>

     <tr>
      <th> by %FINANCIAL AID</th>
      <th> between <input type="text" name="minAid"> and <input type="text" name="maxAid"></th>
     </tr>
    
     <tr>
      <th> by NUMBER OF APPLICANTS</th>
      <th> between <input type="text" name="minApplicants"> and <input type="text" name="maxApplicants"></th>
     </tr>

     <tr>
      <th> by %ADMITTED</th>
      <th> between <input type="text" name="minAdmitted"> and <input type="text" name="maxAdmitted"></th>
     </tr>

     <tr>
      <th> by % ENROLLED</th>
      <th> between <input type="text" name="minEnrolled"> and <input type="text" name="maxEnrolled"></th>
     </tr>

     <tr>
      <th> by ACADEMIICS SCALE (1-5)</th>
      <th> between <input type="text" name="minAcademicScale"> and <input type="text" name="maxAcademicScale"></th>
     </tr>

     <tr>
      <th> by SOCIAL SCALE(1-5)</th>
      <th> between <input type="text" name="minSocialScale"> and <input type="text" name="maxSocialScale"></th>
     </tr>

     <tr>
      <th> by QUALITY OF LIFE SCALE(1-5)</th>
      <th> between <input type="text" name="minQOL"> and <input type="text" name="maxQOL"></th>
     </tr>

     <tr>
      <th> by EMPHASES</th>
      <th> contains either <br>
	<input type="text" name="empasis1"><br>
	<input type="text" name="empasis2"><br>
	<input type="text" name="empasis3"><br>
	<input type="text" name="empasis4"><br>
	<input type="text" name="empasis5">
     </tr>
</table>
<br>
	<input type="submit" value="Search For Schools"><input type="reset" value="Reset Form">         
     </form>


</body>
</html>