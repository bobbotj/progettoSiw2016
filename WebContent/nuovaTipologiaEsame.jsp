<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Nuova tipologia</title>
</head>
<body>
	<f:view>
		<h:form>
			<h1>Registrazione nuova tipologia</h1>
			<div>
				Nome:
				<h:inputText value="#{tipologiaEsameController.nome}" required="true"
					requiredMessage="nome obbligatorio!" id="nome" />
				<h:message for="nome" />
			</div>
			<div>
				Prezzo:
				<h:inputText value="#{tipologiaEsameController.prezzo}" required="true"
					requiredMessage="prezzo obbligatorio!" id="prezzo" />
				<h:message for="prezzo" />
			</div>
			<div>
				Prerequisiti:
				<h:inputText value="#{tipologiaEsameController.prerequisito}" required="true"
					requiredMessage="tipologia obbligatoria!" id="prerequisito" />
				<h:message for="prerequisito" />
			</div>
			<div>
				<h:commandButton value="Fatto"	action="#{tipologiaEsameController.createTipologiaEsame}" />
			</div>
			<div>
				<h:commandLink value="Tutti gli esami"
					action="#{esameController.listEsami}" />
			</div>
		</h:form>
	</f:view>
</body>
</html>