<%@ page import="com.csqf.personnelmanagementsystem.entity.TUserInformation" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%--%>
<%--	TUserInformation user = (TUserInformation)request.getSession().getAttribute("user");--%>

<%--%>--%>
<html>
<head>
	<meta charset="utf-8" />
	<title></title>
	<style type="text/css">
		body{
			margin: 0;
			padding: 0;
		}
		.all{
			background: #339999;
			padding: 1px;
			padding-left: 20px;
			height: 80px;
		}
		.text{
			font-size: 23px;
			color: #FFFFFF;
		}
		#div1{
			float: left;
		}
		#div2{
			text-align: right;
			float: right;
			line-height: 80px;
			padding-right: 20px;
			font-size: 18px;
		}
		#div3{
			text-align: right;
			float: right;
			line-height: 80px;
			padding-right: 30px;
			font-size: 13px;
		}
		a{
			text-decoration: none;
			color: #ffffff;
		}
	</style>
</head>
<body>
	<div class="all">  
		<div id="div1"><p class="text"> D公司人事管理系统</p></div>
		
		<div id="div3">
			<a href="javascript:void(0)">登出</a>
		</div>
		<div id="div2">
<%--			<a href="javascript:void(0)"><%= user==null?null:user.getUsername()%></a>--%>
			<a href="javascript:void(0)">${user.username}</a>
		</div>
	</div>
</body>
</html>