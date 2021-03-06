<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>progettoSiw</title>
</head>
<body>
	<f:view>
		<h1>progettoSiw</h1>
		<ul>
			<li><a href='<c:url value="/faces/login.jsp" />'>Accedi</a></li>
			<li><a href='<c:url value="/faces/nuovoMedico.jsp" />'>Registrati
					come medico</a></li>
			<li><a href='<c:url value="/faces/nuovoPaziente.jsp" />'>Registrati
					come paziente</a></li>
			<li><h:form>
					<h:commandLink value="Tutti gli esami"
						action="#{esameController.listEsami}" />
				</h:form></li>
			<li><h:form>
					<h:commandLink value="Tutte le tipologie"
						action="#{tipologiaEsameController.listTipologie}" />
				</h:form></li>
		</ul>
	</f:view>
</body>
</html>