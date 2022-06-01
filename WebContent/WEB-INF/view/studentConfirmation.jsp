<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Confirmation</title>
	</head>
	<body>
		<h3>Student: </h3>
		<p>${student.firstName} ${student.lastName}</p>
		<p>${student.country }</p>
		<p>${student.favoriteLanguage}</p>
		
		<ul>
    		<c:forEach var="temp" items="${student.operatingSystems}">
        		<li> ${temp} </li>
    		</c:forEach>
		</ul>
	</body>

</html>