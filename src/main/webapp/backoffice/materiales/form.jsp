
<%@page import="com.ipartek.formacion.nidea.controller.backoffice.MaterialesBackofficeController"%>
<%@include file="/templates/head.jsp" %>
<%@include file="/templates/navbar.jsp" %>
<%@include file="/templates/alert.jsp" %>

<a href="backoffice/materiales" title="Ir la página anterior">Volver</a>

<div class="container">
  <h2>Formulario</h2>
  <form action="backoffice/materiales" method="post">
    <div class="form-group">
      <label for="email">ID:</label>
      <input type="number" class="form-control" id="id" placeholder="Enter id" name="id" readonly value="${material.id}">
    </div>
    <div class="form-group">
      <label for="pwd">Nombre:</label>
      <input type="text" class="form-control" id="nombre" placeholder="Enter nombre" name="nombre" value="${material.nombre}">
    </div>
    <div class="form-group">
      <label for="pwd">Precio:</label>
      <input type="number" class="form-control" id="precio" placeholder="Enter precio" name="precio"  value="${material.precio}">
    </div>
    <div class="checkbox">
      <label><input type="checkbox" name="remember"> Remember me</label>
    </div>
  <div class="form-group row">
  <c:if test="${ material.id== -1}">
	    <div class="col-sm-12">
	    <input type="hidden" name="op" value="<%=MaterialesBackofficeController.OP_GUARDAR%>">
	      <button type="submit" class="btn btn-primary btn-lg btn-block">Crear</button>
	   </div>
	   </c:if>
	  </div>
	  
	   <c:if test="${ material.id >-1}">
	  <div class="form-group row">
	    <div class="col-sm-6">
	     <input type="hidden" name="op" value="<%=MaterialesBackofficeController.OP_GUARDAR%>"> 	
	      <button type="submit" class="btn btn-success btn-lg btn-block">Modificar</button>
	    </div>
	    <div class="col-sm-6">
	        <a type="button" class="btn btn-danger btn-lg btn-block" data-toggle="modal" data-target="#exampleModal">Eliminar</a>
	    </div>
	    	    <!-- Modal -->
		<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  			<div class="modal-dialog" role="document">
    			<div class="modal-content">
      				<div class="modal-header">
        				<h5 class="modal-title" id="exampleModalLabel">Confírmame la eliminación, por favor</h5>
        				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
          					<span aria-hidden="true">&times;</span>
        				</button>
      				</div>
      				<div class="modal-body">
        				<span>¿Está seguro de que desea eliminar el material ${material.nombre}?</span>
      				</div>
      				<div class="modal-footer">
        			 <a href="backoffice/materiales?id=${material.id}&op=<%=MaterialesBackofficeController.OP_ELIMINAR%>"  class="btn btn-danger btn-lg btn-block">Eliminar</a>
        					<button type="button" class="btn btn-primary btn-lg btn-block" data-dismiss="modal">Cancelar</button>
      				</div>
    			</div>
    			
  			</div>
		</div>
	  </div>
	  </c:if>
	</form>
</div>
 
    
  </form>
</div>



<%@include file="/templates/footer.jsp" %>
