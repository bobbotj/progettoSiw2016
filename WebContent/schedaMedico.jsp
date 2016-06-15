<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scheda medico</title>
</head>
<body>
	<f:view>
		<h1>Dettagli medico</h1>
		<div>Nome: ${medicoController.medico.nome}</div>
		<div>Cognome: ${medicoController.medico.cognome}</div>
		<div>Specializzazione:
			${medicoController.medico.specializzazione}</div>
		<li><a href='<c:url value="/faces/index.jsp" />'>Home</a></li>
		<li><h:form>
				<h:commandLink value="Anagrafica pazienti"
					action="#{pazienteController.listPazienti}" />
			</h:form></li>
		<li><a href='<c:url value="/faces/nuovoEsame.jsp" />'>Crea
				nuovo esame</a></li>
		<h2>ricerca esame per codice:</h2>
		<div>
			inserisci codice esame
			<h:inputText value="#{esameController.codice}" required="false"
				id="codice" />
			<h:message for="codice" />
			<h:commandButton value="Cerca"
				action="#{esameController.findByCode}" />
		</div>
	</f:view>
</body>
</html>