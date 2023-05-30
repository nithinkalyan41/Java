<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSTL example</title>
</head>
<body>
        <c:set var="i" value="23" scope="application"></c:set>
        <h1><c:out value="${i}"></c:out></h1>

        <h1><c:out value="${i}"></c:out></h1>
        <hr>
        <br/>
            <c:if test="${i==23}">
                <h1>TRUE</h1>
            </c:if>


</body>
</html>