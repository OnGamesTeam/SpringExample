<%--
  Created by IntelliJ IDEA.
  User: f4b3r
  Date: 27/01/19
  Time: 19.05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Page</title>
</head>
<body>
      <h2> Vecchia funzione :(</h2>
      <form action="processForm" method="GET">
          <input type="text" name="studentname" placeholder="Inserisci il tuo nome"/>
          <input type="submit"/>
      </form>
      <br>
      <h2> Nuova funzione!</h2>
      <form action="processForm3" method="GET">
          <input type="text" name="studentname" placeholder="Inserisci il tuo nome"/>
          <input type="submit"/>
      </form>
</body>
</html>
