<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<form action="servlet1">
    <table>
        <tr>
            <td><input type="text" name="name" placeholder="enter name"></td>
            <td><button type="submit">submit</button></td>
        </tr>
    </table>
</form>
</body>
</html>