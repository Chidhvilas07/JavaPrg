/*
Q10(b): Build an Application to get Rollno, Studentname, Sub1, Sub2, Sub3, Sub4 and Sub5 
through JSP called index.jsp with client sided validation and submit to the servlet 
called ResultServlet and process all the fields with server sided validation and display 
all the data along with result (Pass if all subjects greater than 40%) and Average marks 
through result.jsp with a link to move to the client side
*/

<html>
<head>
    <title>Student Result Form</title>

    <script>
        function validateForm() {
            let fields = document.forms["form"].elements;

            for (let i = 0; i < fields.length - 1; i++) {
                if (fields[i].value == "") {
                    alert("All fields are required");
                    return false;
                }
            }
            return true;
        }
    </script>
</head>

<body>

<h2>Student Result Form</h2>

<form name="form" action="ResultServlet" method="post" onsubmit="return validateForm()">

    Roll No: <input type="number" name="roll"><br><br>
    Name: <input type="text" name="name"><br><br>

    Sub1: <input type="number" name="s1"><br><br>
    Sub2: <input type="number" name="s2"><br><br>
    Sub3: <input type="number" name="s3"><br><br>
    Sub4: <input type="number" name="s4"><br><br>
    Sub5: <input type="number" name="s5"><br><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>