<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gestion des Clients</title>
</head>
<body>
	<div class="container">
		<div class="content">
			<h2 style="color: white">Connexion</h2>
			<s:form action="login">
				<s:textfield name="login" label="Login" />
				<s:textfield name="password" type="password" label="Password" />
				<s:submit value="SIGN IN"/>
			</s:form>
		</div>
	</div>
</body>
</html>