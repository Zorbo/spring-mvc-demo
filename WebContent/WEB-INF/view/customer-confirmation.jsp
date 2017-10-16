<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE>
<html>

<head>
<title>Customer Confirmation</title>
</head>

<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}

<br><br>

Number of Entry's: ${customer.entry}

<br><br>

Postal code: ${customer.postalCode}

<br><br>

Course code: ${customer.courseCode}


</body>



</html>