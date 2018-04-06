
<%@page import="com.ipartek.formacion.nidea.controller.backoffice.MaterialesBackofficeController"%>
<%@include file="/templates/head.jsp" %>
<%@include file="/templates/navbar.jsp" %>
<%@include file="/templates/alert.jsp" %>

<a href="backoffice/materiales" title="Ir la p�gina anterior">Volver</a>

<div class="container">
  <h2>Formulario</h2>
  <form action="backoffice/materiales" method="post">
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
  <div class="form-group row">
  <c:if test="${ id_material == -1}">
	    <div class="col-sm-12">
	    <input type="hidden" name="op" value="<%=MaterialesBackofficeController.OP_GUARDAR%>">
	      <button type="submit" class="btn btn-primary btn-lg btn-block">Crear</button>
	   </div>
	   </c:if>
	  </div>
	  
	   <c:if test="${ id_material >-1}">
	  <div class="form-group row">
	    <div class="col-sm-6">
	     <input type="hidden" name="op" value="<%=MaterialesBackofficeController.OP_GUARDAR%>"> 	
	      <button type="submit" class="btn btn-success btn-lg btn-block">Modificar</button>
	    </div>
	    <div class="col-sm-6">
	        <a href="backoffice/materiales?id=${id_material}&op=<%=MaterialesBackofficeController.OP_ELIMINAR%>"  class="btn btn-danger btn-lg btn-block">Eliminar</a>
	    </div>
	  </div>
	  </c:if>
	</form>
</div>
    <button type="submit" class="btn btn-default">Submit</button>
    
  </form>
</div>

</body>
</html>
