<%@page import="domain.Question"%>
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
				<td>序号 </td><td>题目</td><td>A</td><td>B</td><td>C</td><td>D</td><td>answer</td>
			</tr>
		</thead>
	<tbody>
		<% List<Question> allquestion = (List)request.getAttribute("allquestion"); 
		
		for(Question q :allquestion){
			%>
			<tr>
				<td><%=q.getQuestionid()%></td><td><%=q.getQuestion()%></td><td><%=q.getA()%></td>
				<td><%=q.getB()%></td><td><%=q.getC()%></td><td><%=q.getD()%></td>
				<td><%=q.getAnswer()%></td>
			</tr>
		
		<%
		}
		%>
	
	</tbody>

	</table>
</body>
</html>