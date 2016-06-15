<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pazienti</title>
</head>
<body>
<f:view>
		<h1>Anagrafica pazienti</h1>
		<h:form>
			<table>
				<tr>
					<th>Nome</th>
					<th>Cognome</th>
				</tr>
				<c:forEach var="paziente" items="#{pazienteController.pazienti}">
					<tr>
						<td><h:commandLink action="#{pazienteController.findPaziente}"
								value="aggiungi esame">
								<f:param name="id" value="#{paziente.id}" />
							</h:commandLink></td>
					</tr>
				</c:forEach>
			</table>
		</h:form>
	</f:view>
</body>
</html>