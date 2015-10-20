<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
        <title>Login</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link href="signin.css" rel="stylesheet">
    <meta charset="utf-8"/>
</head>

  <body>
      <div class="col-md-4">
      <div class="container">

      <form class="form-signin" action="UserValidate" method="POST">
        <h2 class="form-signin-heading">Login :) <%java.util.Date Fecha = new java.util.Date(); 
        String fecha = (Fecha.getDate() + "/"+(Fecha.getMonth()+1)+"/"+(Fecha.getYear()+1900)).toString();
        out.print(fecha);%> </h2>
        <label for="inputNick" class="sr-only">Nick</label>
        <input type="text" name="inputNick" id="inputNick" class="form-control" placeholder="Nick" required autofocus>
        <label for="inputPassword" class="sr-only">Contraseña</label>
        <input type="password" name="inputPassword" id="inputPassword" class="form-control" placeholder="Contraseña" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Recordarme en este equipo
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
      </form>

    </div>
        </div>
  </body>
</html>