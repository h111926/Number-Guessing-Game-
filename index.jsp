<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 
<title>Number Guessing Game</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
   <h1>🎮 Number Guessing Game</h1>

    <form action="guess" method="post">
        <label>Enter your guess (1–10):</label><br>
        <input type="number" name="userGuess" required min="1" max="10"><br><br>
        <button type="submit">Submit</button>
    </form>

    <div class="result">
        <% if (request.getAttribute("message") != null) { %>
            <p><%= request.getAttribute("message") %></p>
        <% } %>
    </div>
   
</body>
</html>
