<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
 <%@ page import="java.util.*, java.text.*"  %>  

<%@ page import="java.util.List, java.text.*" %>

<!DOCTYPE html>
<html lang="en">
  <head>
  <title>converter</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
   
  </head>
  <body>
  
  <div class="container" >
   <h4> Celcius value: </h4>
   
  <form class="navbar-form navbar-left" role="search"  method="POST">
  <div class="form-group">
    <input type="text" class="form-control" placeholder="Search">
  </div>
  <button type="submit" class="btn btn-default">Convertir</button>
</form>
<br><br>
<h2> Fahrenheit :</h2>

<%

if(request.getAttribute("result") != null)
	out.write(request.getAttribute("result").toString());

%>


  </div>
  
  
  
  
  
  
  </body>
  
  
  
  
  </html>