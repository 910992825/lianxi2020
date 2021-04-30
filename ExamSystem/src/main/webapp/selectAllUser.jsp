<%@page import="domain.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td>用户ID</td><td>name</td><td>password</td><td>email</td><td>sex</td>
			</tr>
		</thead>
	<tbody>
		<% List<User> alluser = (List)request.getAttribute("alluser"); 
		
		for(User u :alluser){
			%>
			<tr>
				<td><%=u.getUserid()%></td><td><%=u.getUsername()%></td><td><%=u.getUserpassword()%></td>
				<td><%=u.getEmail()%></td><td><%=u.getSex()%></td>
				<td><a href="delete.do?username=<%=u.getUsername()%>">删除用户</a></td>
			</tr>
		
		<%
		}
		%>
	
	</tbody>

	</table>
</body>
</html>