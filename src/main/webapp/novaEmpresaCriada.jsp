<%
	String nomeEmpresa = (String)request.getAttribute("empresa");
	System.out.println(nomeEmpresa);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h1><% out.println(nomeEmpresa); %></h1>
</body>
</html>