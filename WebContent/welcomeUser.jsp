<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
</head>
<body>
	<h2>
		Welcome
		<s:property value="username" />
		...!
	</h2>

</body>
</html>