<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tipologia esame</title>
</head>
<body>
	<f:view>
		<h1>Dettagli tipo</h1>
		<div>Nome: ${tipologiaEsameController.tipologiaEsame.nome}</div>
		<div>Prezzo: ${tipologiaEsameController.tipologiaEsame.prezzo}</div>
		<div>Prerequisiti:
			${tipologiaEsameController.tipologiaEsame.prerequisiti}</div>
		<li><a href='<c:url value="/faces/index.jsp" />'>Home</a></li>
		<li><a href='<c:url value="/faces/nuovoTipologiaEsame.jsp" />'>Crea
				nuova</a></li>
		<li><a href='<c:url value="/faces/index.jsp" />'>Home</a></li>
	</f:view>
</body>
</html>