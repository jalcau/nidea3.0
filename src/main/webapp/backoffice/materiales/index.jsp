<%@include file="/templates/head.jsp" %>
<%@include file="/templates/navbar.jsp" %>
<%@include file="/templates/alert.jsp" %>



<h1>Backoffice materiales</h1>

<form action="backoffice/materiales" method="get">
	<input type="text" name="search" required placeholder="Nombre del Material">
	<input type="submit" value="Buscar">	
</form>

<table id="example" class="table table-striped table-bordered" style="width:100%">
        <thead>
            <tr>
                <th>iD</th>
                <th>Nombre</th>
                <th>Precio</th>
               
            </tr>
        </thead>
        <tbody>
        
		<c:forEach items="${materiales}" var="material">
		<tr>
			<td>${material.id} </td>
			<td>${material.nombre} </td>
			<c:if test = "${material.precio > 6.0 && material.precio < 25.0}"> 
				<td><span class="text-primary">${material.precio} &euro;</span></td>
				</c:if>
				<c:if test = "${material.precio <= 6.0}"> 
				<td> ${material.precio} &euro</td>
				</c:if>
				<c:if test = "${material.precio >= 25.0}"> 
				<td><span class="text-danger">${material.precio} &euro;</span></td>
				</c:if>
 </tr>
</c:forEach>
 
   </tbody>
   </table>
  
    
    <ol>
	<c:forEach items="${materiales}" var="material">
	  <c:choose>
         
         <c:when test = "${material.precio > 6.0 && material.precio < 25.0}">
			<li>${material.nombre} - <span class="text-primary">${material.precio} &euro;</span> </li>
           
         </c:when>
         <c:when test = "${material.precio <= 6.0}">
			<li>${material.nombre} - ${material.precio} &euro; </li>
			</c:when>
			      <c:when test = "${material.precio >= 25.0}">
		 <li>${material.nombre} - <span class="text-danger">${material.precio} &euro;</span> </li>
			</c:when>
         </c:choose>
		 
	</c:forEach>
	
</ol>
    