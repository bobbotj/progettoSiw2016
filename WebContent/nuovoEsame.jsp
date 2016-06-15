<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nuovo esame</title>
</head>
<body>
	<f:view>
		<h:form>
			<h1>Registrazione nuovo esame</h1>
			<div>
				Nome:
				<h:inputText value="#{esameController.nome}" required="true"
					requiredMessage="nome obbligatorio!" id="nome" />
				<h:message for="nome" />
			</div>
			<div>
				Tipologia esame:
				<h:inputText value="#{esameController.tipo}" required="true"
					requiredMessage="tipologia obbligatoria!" id="tipo" />
				<h:message for="tipo" />
			</div>
			<div>
				<h:commandButton value="Inserisci Esame"
					action="#{esameController.createEsame}" />
			</div>
			<div>
				<h:commandButton value="Associa paziente" action="#{pazienteController.listPazienti}"/>
			</div>
			<div>
				<h:commandLink value="Tutti gli esami"
					action="#{esameController.listEsami}" />
			</div>
		</h:form>
	</f:view>
</body>
</html>