<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Library</title>
</head>
<body>
<h2>All books</h2>
<table border="1px">
    <tr>
        <th> book name </th>
        <th> author </th>
        <th> genre </th>
        <th> comment </th>
        <th> operation </th>
    </tr>
    <c:forEach var="bks" items="${allBooks}">
        <c:url var="updateButton" value="/update">
            <c:param name="id" value="${bks.name}">
            </c:param>
        </c:url>
        <tr>
            <td>${bks.name}</td>
            <td>${bks.author.author}</td>
            <td>${bks.genre.genre}</td>
            <td>${bks.comment.description}</td>
            <td>
                <input type="button" VALUE="Update"
                onclick="window.location.href='${updateButton}'"/>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="add"
    onclick="window.location.href='addNewBook'" />

</body>
</html>
