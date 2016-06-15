<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<f:view>
		<h:form>
			<h1>Inserisci Cognome e Password</h1>
			<table>
				<tr>
					<td>Cognome:</td>
					<td><h:inputText value="#{medicoController.cognome}" required="true"
					requiredMessage="cognome obbligatorio!" id="cognome" /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><h:inputSecret value="#{medicoController.password}" required="true"
					requiredMessage="password obbligatoria!" id="password"/></td>
				</tr>
			</table>
			<p><h:commandButton value="login" action="#{medicoController.verificaCredenziali}"/></p>
		</h:form>
	</f:view>
</body>
</html>