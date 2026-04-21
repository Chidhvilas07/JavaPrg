<%--
Q7(a): Build a Session Management using JSP program set with one minute 
session expiry time to get your name through text box and press submit 
to display the message by greeting Hello your name!. 
Check the expiry of the session after one minute.
--%>

<html>
<head>
    <title>Session Example</title>
</head>
<body>

<h2>Enter Your Name</h2>

<form method="post">
    Name: <input type="text" name="username" required>
    <br><br>
    <input type="submit" value="Submit">
</form>

<%
    // Set session timeout to 60 seconds (1 minute)
    session.setMaxInactiveInterval(60);

    String name = request.getParameter("username");

    if (name != null) {
        session.setAttribute("user", name);
    }

    String user = (String) session.getAttribute("user");

    if (user != null) {
%>
        <h3>Hello <%= user %>!</h3>
        <p>Session will expire in 60 seconds.</p>
<%
    } else {
%>
        <p>No active session.</p>
<%
    }
%>

</body>
</html>