<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Formulario</h2>
  <form action="/action_page.php">
    <div class="form-group">
      <label for="email">ID:</label>
      <input type="number" class="form-control" id="id" placeholder="Enter id" name="email">
    </div>
    <div class="form-group">
      <label for="pwd">Nombre:</label>
      <input type="text" class="form-control" id="nombre" placeholder="Enter nombre" name="nombre">
    </div>
    <div class="form-group">
      <label for="pwd">Precio:</label>
      <input type="number" class="form-control" id="precio" placeholder="Enter precio" name="precio">
    </div>
    <div class="checkbox">
      <label><input type="checkbox" name="remember"> Remember me</label>
    </div>
    <button type="button" class="btn btn-primary">Modificar</button>
    <button type="submit" class="btn btn-default">Submit</button>
    
  </form>
</div>

</body>
</html>
