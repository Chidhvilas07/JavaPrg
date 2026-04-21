<%--
Displays validated user data
--%>

<html>
<body>

<h2>User Details</h2>

<p>Username: <%= request.getAttribute("name") %></p>
<p>Email: <%= request.getAttribute("email") %></p>
<p>Designation: <%= request.getAttribute("desig") %></p>

<br>
<a href="UserDataIndex.jsp">Go Back</a>

</body>
</html>