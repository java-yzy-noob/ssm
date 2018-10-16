<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="theGood" items="${PageInfo.list }">
	
		${theGood.gid }----${theGood.gname }----${theGood.gtype } <br />
	</c:forEach>
	<a href="getAllGoods?pagenum=1">首页</a>
	<a href="getAllGoods?pagenum=${PageInfo.prePage }">上一页</a>
	<a href="getAllGoods?pagenum=${PageInfo.nextPage }">下一页</a>
	<a href="getAllGoods?pagenum=${PageInfo.pages }">末页</a>
	
</body>
</html>