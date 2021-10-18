<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Library</title>
</head>
<body>
<h2>Add Book</h2>



<form:form action="addBook" modelAttribute="book">
    Name <form:input path="name" />
    <br><br>
    Author <form:input path="author" />
    <br><br>
    Genre <form:input path="genre" />
    <br><br>
    Comment <form:input path="comment" />
    <br><br>
    <input type="submit" value="OK" />
</form:form>


</body>
</html>
