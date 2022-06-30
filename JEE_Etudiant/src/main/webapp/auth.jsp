<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</head>
<body>
<form action="login"  method="POST">
<div class="container" style="margin:50px;">
<div class="row mb-3">
    <label for="inputuser3" class="col-sm-2 col-form-label">UserName</label>
    <div class="col-sm-2">
      <input type="text" class="form-control" id="inputuser3" required><br>
    </div>
<div class="row mb-3">
    <label for="inputPassword3" class="col-sm-2 col-form-label">Password</label>
    <div class="col-sm-2">
      <input type="password" class="form-control" id="inputPassword3" required>
    </div>

</div>
<div class="col-sm-2">
<button type="submit" class="btn btn-primary" >Connectez-vous</button>
</div>
</form>
</body>
</html>
