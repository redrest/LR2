<!DOCTYPE html>
<html>
<head>
    <title>Main</title>
    <meta charset="UTF-16"/>
    <!-- Подключение стилей Bootstrap -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- Подключение вашего собственного файла стилей -->
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col">
            <form action="AddServlet">
                <button class="btn btn-primary">Add new user</button>
            </form>
        </div>
        <div class="col">
            <form action="OutServlet">
                <button class="btn btn-primary">All users</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
