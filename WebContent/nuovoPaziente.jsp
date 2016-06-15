<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nuovo paziente</title>
</head>
<body>
<f:view>
		<h:form title="createPaziente">
			<h1>Registrazione nuovo paziente</h1>
			<div>Nome:
				<h:inputText value="#{pazienteController.nome}" required="true"
					requiredMessage="nome obbligatorio!" id="nome" />
				<h:message for="nome" />
			</div>
			<div>Cognome:
				<h:inputText value="#{pazienteController.cognome}" required="true"
					requiredMessage="cognome obbligatorio!" id="cognome" />
				<h:message for="cognome" />
			</div>
			<div>Scegliere una password per l'accesso al sistema:
				<h:inputSecret value="#{pazienteController.password}"
					required="true" requiredMessage="password obbligatoria!"  id="password" />
				<h:message for="password" />
			</div>
			<div>
				<h:commandButton value="Fatto"	action="#{pazienteController.createPaziente}" />
			</div>
		</h:form>
	</f:view>
</body>
</html>