<%@include file="/templates/head.jsp" %>
<%@include file="/templates/navbar.jsp" %>
<%@include file="/templates/alert.jsp" %>


<h1>Bienvenido ${nombre} !!!</h1> 
${applicationScope.usuarios_conectados } 
<%
//ArrayList<Material> lista = (ArrayList<Material>)request.getAttribute("materiales");
//Mejor usamos EL => Expresion Language => ${}
//Podemos usar cualquier expresion, si no hay expresion pinta la variable
	
%>


<jsp:include page="/templates/footer.jsp"></jsp:include>