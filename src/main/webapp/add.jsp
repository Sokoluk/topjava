<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<h2>Edit meal</h2>
<form method="POST" action="/add">
  <label for="dateTime">DateTime:</label>
  <input type="text" id="dateTime"/>
  <br/>
  <br/>
  <label for="description">Description:</label>
  <input type="text" id = "description">
  <br/>
  <br/>
  <label for="calories">Calories:</label>
  <input type="text" id = "calories">
  <br/>
  <br/>
  <input type="submit" value="Создать!"/>
</form>
</body>
</html>
