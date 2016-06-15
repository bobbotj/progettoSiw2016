<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista tipologie</title>
</head>
<body>
<f:view>
		<h1>Esami</h1>
		<h:form>
			<table>
				<tr>
					<th>Nome</th>
					<th>Prezzo</th>
					<th>Prerequisiti</th>
				</tr>
				<c:forEach var="tipoEsame" items="#{tipologiaEsameController.tipologieEsame}">
					<tr>
						<td><h:commandLink action="#{tipologiaEsameController.findTipologiaEsame}"
								value="dettagli">
								<f:param name="id" value="#{tipologiaEsame.id}" />
							</h:commandLink></td>
					</tr>
				</c:forEach>
			</table>
		</h:form>
	</f:view>
</body>
</html>