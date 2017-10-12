<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>

<head>

<title>Student Registration Form</title>

</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

Favorite Programming Language: ${student.favoriteLanguage}

<br><br>

Operation System: 

<ul>
<c:forEach var ="temp" items ="${student.operatingSystem}">

<li>${temp}</li>

</c:forEach>

</ul>

</body>

</html>