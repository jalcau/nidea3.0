<%@include file="/templates/head.jsp" %>
<%@include file="/templates/navbar.jsp" %>
<%@include file="/templates/alert.jsp" %>

<script>
setTimeout(function () { location.reload(1); }, 5000);	
</script>

<h1>Bienvenido  !!!</h1> 
applicationScope (JSP ) == ServletContext ( servlet ) <br>

<hr>

<ul>
	<c:forEach var="usuario" items="${applicationScope.usuarios_conectados}">
		<li>${usuario.key} - ${usuario.value}</li>
	</c:forEach>
</ul>
<%
//ArrayList<Material> lista = (ArrayList<Material>)request.getAttribute("materiales");
//Mejor usamos EL => Expresion Language => ${}
//Podemos usar cualquier expresion, si no hay expresion pinta la variable
	
%>


<jsp:include page="/templates/footer.jsp"></jsp:include>