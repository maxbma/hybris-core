<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<title>Producer List</title>
<body>
<h1>Producer List</h1>
<ul>
    <c:forEach var="producer" items="${producers}">
        <li> ${producer.firstName} ${producer.surname}</li>
    </c:forEach>
</ul>
</body>
</html>