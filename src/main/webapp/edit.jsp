<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<h3><a href="http://localhost:8080/index.html">Home</a></h3>
<hr>
<h2>Edit meal</h2>
<form method="POST" action="/topjava/edit">
    <input type="number" hidden name="id" value="${meal.getId()}">
    <label for="dateTime">DateTime:</label>
    <input type="datetime-local" id="dateTime" name="dateTime" value="${meal.getDateTime()}"/>
    <br/>
    <br/>
    <label for="description">Description:</label>
    <input type="text" id = "description" name="description" value="${meal.getDescription()}">
    <br/>
    <br/>
    <label for="calories">Calories:</label>
    <input type="number" id = "calories" name="calories" value="${meal.getCalories()}">
    <br/>
    <br/>
    <input type="submit" value="Save"/>
    <input type="button" onclick="window.location.href = 'http://localhost:8080/topjava'" value="Cancel"/>
</form>
</body>
</html>
