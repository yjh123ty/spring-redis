<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/user/save" method="post">
		编号：<input name="id" /><br/>
		姓名：<input name="username" /><br/>
		<input type="submit" value="提交"/>
	</form>
	<hr/>
	<label for="ye"><input id="ye" type="checkbox"/>文本</label>
	 
</body>
</html>