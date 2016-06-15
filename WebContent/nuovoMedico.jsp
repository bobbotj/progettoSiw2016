<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nuovo Medico</title>
</head>
<body>
<f:view>
		<h:form>
			<h1>Registrazione nuovo medico</h1>
			<div>Nome:
				<h:inputText value="#{medicoController.nome}" required="true"
					requiredMessage="nome obbligatorio!" id="nome" />
				<h:message for="nome" />
			</div>
			<div>Cognome:
				<h:inputText value="#{medicoController.cognome}" required="true"
					requiredMessage="cognome obbligatorio!" id="cognome" />
				<h:message for="cognome" />
			</div>
			<div>Specializzazione:
				<h:inputText value="#{medicoController.specializzazione}"
					required="false" id="specializzazione" />
				<h:message for="specializzazione" />
			</div>
			<div>Scegliere una password per l'accesso al sistema:
				<h:inputSecret value="#{medicoController.password}"
					required="true" requiredMessage="password obbligatoria!"  id="password" />
				<h:message for="password" />
			</div>
			<div>
				<h:commandButton value="Fatto"	action="#{medicoController.createMedico}" />
			</div>
		</h:form>
	</f:view>
</body>
</html>