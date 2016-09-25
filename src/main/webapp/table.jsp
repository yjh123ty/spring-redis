<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="common_head.jsp" %>

<title>table表格</title>

<script type="text/javascript">
$(function(){
	$.post("/user/list",function(data){
		console.debug(data);
	},"json");
});


</script>

</head>

<body>

	<table class="am-table am-table-centered am-table-bordered am-table-hover table-main">
    <thead>
        <tr>
            <th>用户账号</th>
            <th>用户昵称</th>
            <th>注册时间</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Amaze UI</td>
            <td>http://amazeui.org</td>
            <td>2012-10-01</td>
        </tr>
        <tr>
            <td>Amaze UI</td>
            <td>http://amazeui.org</td>
            <td>2012-10-01</td>
        </tr>
<!--         <tr class="am-active"> -->
		<tr>
            <td>Amaze UI(Active)</td>
            <td>http://amazeui.org</td>
            <td>2012-10-01</td>
        </tr>
        <tr>
            <td>Amaze UI</td>
            <td>http://amazeui.org</td>
            <td>2012-10-01</td>
        </tr>
        <tr>
            <td>Amaze UI</td>
            <td>http://amazeui.org</td>
            <td>2012-10-01</td>
        </tr>
    </tbody>
</table>

</body>
</html>