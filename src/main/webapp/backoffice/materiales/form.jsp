
<%@page import="com.ipartek.formacion.nidea.controller.backoffice.MaterialesBackofficeController"%>
<%@include file="/templates/head.jsp" %>
<%@include file="/templates/navbar.jsp" %>
<%@include file="/templates/alert.jsp" %>

<a href="backoffice/materiales?op=21" title="Ir la página anterior">Volver</a>

<div class="container">
  <h2>Formulario</h2>
  <form action="/action_page.php">
    <div class="form-group">
      <label for="email">ID:</label>
      <input type="number" class="form-control" id="id" placeholder="Enter id" name="id" value="${id_material}">
    </div>
    <div class="form-group">
      <label for="pwd">Nombre:</label>
      <input type="text" class="form-control" id="nombre" placeholder="Enter nombre" name="nombre" v>
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
