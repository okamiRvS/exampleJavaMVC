<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<style type="text/css">
.errors {
	background-color: #FFCCCC;
	width: 400px;
	margin-bottom: 8px;
}

.errors li {
	list-style: none;
}
</style>
</head>
<body>
	<h2>Register page</h2>
	<div class="errors">
		<s:actionerror />
	</div>
	<p>

		<s:form action="register" method="post">
			<s:textfield name="username" label="Username" size="20" />
			<s:password name="password" label="Password" size="20" />
			<s:textfield name="name" label="Name" size="20" />
			<s:textfield name="email" label="Email" size="20" />
			<s:textfield name="city" label="City" size="20" />
			<s:textfield name="country" label="Country" size="20" />
			<br><br>
			<s:submit method="execute" align="center" />
		</s:form>
</body>
</html>