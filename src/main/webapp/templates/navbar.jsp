
	<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow">
	  
	  <a href="index.jsp">
	  	<img src="img/logo.png" class="logo" alt="Logo Nidea">
	  </a>	
            
      <nav class="my-2 my-md-0 mr-md-10">
        <a class="p-2 text-dark" href="generar-mesa">Mesa</a>        
        <a class="p-2 text-dark" href="calculadora"> Calculadora</a>  
         <a class="p-2 text-dark" href="materiales"> Materiales</a> 
           
           
      </nav>
    
      <c:if test="${empty usuario}">
      
      <a class="btn btn-outline-primary" href="login">Login</a>
      <a class="btn btn-outline-success" href="LoginUserController">LoginUser</a>
      
      </c:if>
         
         <c:if test="${!empty usuario}">
		 <c:if test="${usuario.nombre == 'administrador'}" >
      <span class="badge badge-pill badge-primary">${usuario}</span>
     
        <a href="backoffice/materiales">Materiales</a>
       <a class="btn btn-outline-danger" href="logout">Logout</a>
     
       </c:if>
       
  	 <c:if test="${usuario.nombre != 'administrador'}" >
      
      <span class="badge badge-pill badge-primary">${usuario}</span>
      <a class="btn btn-outline-danger" href="logout">Logout</a>
      </c:if>
      </c:if>
    </div>
    
    <div class="container">