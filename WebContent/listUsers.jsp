<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users List</title>
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script>
	$(document).ready(
			function() {
				$("#myInput").on(
						"keyup",
						function() {
							var value = $(this).val().toLowerCase();
							$("#myTable tr").filter(
									function() {
										$(this).toggle(
												$(this).text().toLowerCase()
														.indexOf(value) > -1)
									});
						});
			});
</script>

<style type="text/css">
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>

</head>
<body>
	<h2>List Users</h2>
	<p>Type something in the input field to search the table for
		usernames, names, emails...:</p>
	<input id="myInput" type="text" placeholder="Search..">
	<br>
	<br>

	<table>
		<thead>
			<tr>
				<th>Index</th>
				<th>Username</th>
				<th>Password</th>
				<th>Name</th>
				<th>Email</th>
				<th>City</th>
				<th>Country</th>
				<th>Role</th>
			</tr>
		</thead>
		<tbody id="myTable">
			<s:set var="counter" value="0" />
			<s:iterator value="admins" status="stat">
				<tr>
					<td><s:property value="counter" /></td>
					<!-- <td><s:property value="%{#stat.index}" /></td> -->
					<td><s:property value="admins[#stat.index].username" /></td>
					<td><s:property value="admins[#stat.index].password" /></td>
					<td><s:property value="admins[#stat.index].name" /></td>
					<td><s:property value="admins[#stat.index].email" /></td>
					<td><s:property value="admins[#stat.index].city" /></td>
					<td><s:property value="admins[#stat.index].country" /></td>
					<td>Admin</td>
					<s:set var="counter" value="%{#counter+1}" />
					<!-- 
					<td>
						<s:if test="%{#admins[#stat.index].isAdmin}">
							User
						</s:if>
						<s:else>
							Admin
						</s:else>
					 -->
				</tr>
			</s:iterator>
			<s:iterator value="users" status="stat">
				<tr>
					<td><s:property value="counter" /></td>
					<td><s:property value="users[#stat.index].username" /></td>
					<td><s:property value="users[#stat.index].password" /></td>
					<td><s:property value="users[#stat.index].name" /></td>
					<td><s:property value="users[#stat.index].email" /></td>
					<td><s:property value="users[#stat.index].city" /></td>
					<td><s:property value="users[#stat.index].country" /></td>
					<td>User</td>
					<s:set var="counter" value="%{#counter+1}" />
				</tr>
			</s:iterator>
		</tbody>
	</table>

</body>
</html>