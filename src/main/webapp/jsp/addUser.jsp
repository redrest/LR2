<!DOCTYPE html>
<html>
<head>
    <title>add Users</title>
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
            <input type="text" id="Name" class="form-control" placeholder="Name">
        </div>
        <div class="col">
            <input type="text" id="LN" class="form-control" placeholder="Last name">
        </div>
        <div class="col">
            <input type="text" id="MN" class="form-control" placeholder="Middle name">
        </div>
        <div class="col">
            <input type="text" id="Age" class="form-control" placeholder="Age">
        </div>
        <div class="col">
            <input type="text" id="Lng" class="form-control" placeholder="Language">
        </div>
    </div>
    <div class="row mt-3">
        <div class="col">
            <input type="button" name="data" onclick="req()" class="btn btn-primary" value="ADD">
        </div>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="js/takejson.js"></script>

</body>
</html>

