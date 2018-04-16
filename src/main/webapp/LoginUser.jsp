
<%@include file="/templates/head.jsp" %>
<%@include file="/templates/navbar.jsp" %>
<%@include file="/templates/alert.jsp" %>


<div id="login">

  <form class="form-signin" action="LoginUserController" method="post">     

      <div class="form-label-group">
            <label for="usuario">Id Usuario:</label>
        <input type="text" class="form-control"
               name="id" 
               placeholder="ID Usuario" 
              
               value="3"
               style:text-decoration: underline>
               
  
      </div>

      <div class="form-label-group">
      <label for="password">Nombre Usuario:</label>
        <input type="text" 
               name="nombre" 
               class="form-control" 
               placeholder="Nombre Usuario" required>
               
        
      </div>
     
      <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
      
    </form>

</div>
<jsp:include page="templates/footer.jsp"></jsp:include>