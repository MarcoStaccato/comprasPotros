<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
        <title>Login</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link href="css/signin.css" rel="stylesheet">
    <meta charset="utf-8"/>
</head>

    <body>
        <div class="container">

      <form class="form-signin" action="RegistrarUsuario" method="POST">
        <h2 class="form-signin-heading">Registro</h2>
          <hr>
        <p>
            Nombre
            <label for="inputName" class="sr-only">Nombre</label>
        <input type="text" name="inputName" id="inputName" class="form-control" placeholder="Nombre" required autofocus>
        </p>
          <p>
            Apellido Paterno
            <label for="inputApePat" class="sr-only">Apellido Paterno</label>
        <input type="text" name="inputApePat" id="inputApePat" class="form-control" placeholder="Apellido Paterno" required autofocus>
        </p>
          <p>
            Apellido Materno
            <label for="inputApeMat" class="sr-only">Apellido materno</label>
        <input type="text" name="inputApeMat" id="inputApeMat" class="form-control" placeholder="Apellido Materno" required autofocus>
        </p>
        <p>
            Edad
            <label for="inputAge" class="sr-only">Edad</label>
        <input type="number" name="inputAge" id="inputAge" class="form-control" placeholder="Edad" required autofocus>
        </p>
          <hr>
          <hr>
          <p>
            Nickname
            <label for="inputNick" class="sr-only">Nickname</label>
        <input type="text" name="inputNick" id="inputNick" class="form-control" placeholder="nickname" required autofocus>
        </p>
        
        <p>
            Contraseña
        <label for="inputPassword" class="sr-only">Contraseña</label>
        <input type="password" name="inputPassword" id="inputPassword" class="form-control" placeholder="Contraseña" required>
        </p>
          <p>
            Confirmar contraseña
        <label for="inputPassword" class="sr-only">Contraseña</label>
        <input type="password" name="inputPasswordConfirm" id="inputPasswordConfirm" class="form-control" placeholder="Contraseña" required>
        </p>
          
          <div class="checkbox">
          <label>
            <input type="checkbox" value="confirm"> Acepto los <a href="#">términos y condiciones</a>
          </label>
        </div>
          
          
          
        <button class="btn btn-lg btn-primary btn-block" type="submit">Registrarme</button>
      </form>

    </div>
    </body>
</html>