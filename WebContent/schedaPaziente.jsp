<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scheda paziente</title>
</head>
<body>
	<f:view>
		<h1>Dettagli paziente</h1>
		<div>Nome: ${pazienteController.paziente.nome}</div>
		<div>Cognome: ${pazienteController.paziente.cognome}</div>
		<li><h:form>
				<h:commandLink value="Prenota esame"
					action="#{esameController.listEsami}" />
			</h:form></li>
			<li><a href='<c:url value="/faces/cercaMedico.jsp" />'>Visualizza medico</a></li>
		<li><a href='<c:url value="/faces/index.jsp" />'>Home</a></li>
	</f:view>
</body>
</html>