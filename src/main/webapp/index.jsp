<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function () {
            $('form').submit(function (e) {
                e.preventDefault();

                let userID = $('#userID').val();
                let password = $('#password').val();

                if (!(userID === "admin" && password === "admin")) {
                    alert('Incorrect user id or password.');
                } else {
                    $.ajax({
                        type: 'POST',
                        url: 'login',
                        data: {userID: userID, password: password},
                        success: function(response) {
                            if (response === 'Success Login') {
                                window.location.href = 'dashboard.jsp';
                            } else {
                                alert('Failed Login!.');
                            }
                        }
                    });
                }
            });
        });
    </script>
</head>
<body>
<h1>Login</h1>
<form>
    <label for="userID">User ID:</label>
    <input type="text" id="userID" name="userID" required><br><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br><br>
    <input type="submit" value="Login">
</form>
</body>
</html>
