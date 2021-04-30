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
<form action="check.do">
	<table>
		<thead>
			<tr>
				<td>序号</td><td>题目</td><td>A</td><td>B</td><td>C</td><td>D</td><td>答案</td>
			</tr>
		</thead>
	<tbody>
		<% List<Question> exam = (List)request.getAttribute("exam"); 
		int i = 1;
		
		for(Question q :exam){
			%>
			<tr>
				<td><%=q.getQuestionid()%></td><td><%=q.getQuestion()%></td><td><%=q.getA()%></td>
				<td><%=q.getB()%></td><td><%=q.getC()%></td><td><%=q.getD() %></td>
				<td>
					<input type="radio" name="answer<%=i %>" value="A"/>A
					<input type="radio" name="answer<%=i %>" value="B"/>B
					<input type="radio" name="answer<%=i %>" value="C"/>C
					<input type="radio" name="answer<%=i++ %>" value="D"/>D
				</td>
			</tr>
		
		<%
		}
		%>
		
	</tbody>

	</table>
	<input type="submit" value="交卷">
</form>
</body>
</html>