<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<html>
<head>
    <title>Meals</title>

</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<h3><a href="topjava/add">Add</a></h3>
<h2>Meals</h2>
<table border="1" style="border-collapse:collapse;">
    <%--    <colgroup>--%>
    <%--        <col span="2" style="background:Khaki">--%>
    <%--        <col style="background-color:LightCyan">--%>
    <%--    </colgroup>--%>
    <tr>
        <th>Date</th>
        <th>Description</th>
        <th>Calories</th>
    </tr>
    <c:forEach var="i" items="${list}">
        <fmt:parseDate value="${ i.getDateTime()}" pattern="y-M-dd'T'H:m" var="myParseDate"></fmt:parseDate>
        <c:set var="choice" value="${i.isExcess() == true ? 'red': 'green'}"/>
        <tr style="color: ${choice}">
            <td><fmt:formatDate value="${myParseDate}" pattern="yyyy-MM-dd HH:mm"></fmt:formatDate></td>
            <td>${i.getDescription()}</td>
            <td>${i.getCalories()}</td>
            <td><p><a href="/topjava/edit?id=${i.getId()}">Edit</a></p></td>
        <tr/>
    </c:forEach>
</table>
</body>
</html>
