<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
 String path = request.getContextPath();
 request.setAttribute("path",request.getContextPath());
 %>
<!DOCTYPE HTML>
<html zh-CN>
<head>
<!-- 必须申明文档的编码charset，且与文件本身编码保持一致，推荐使用UTF-8编码 -->
<meta charset="utf-8">
<title>Html书写规范</title>
<meta name="keywords" content="关键期,5个左右,单个八个汉字以内">
<meta name="description" content="网站描述，字数尽量空制在80个汉字，160个字符以内！">

<!-- Bootstrap 是移动设备优先的 ,确保适当的绘制和触屏缩放。user-scalable=no是禁止屏幕缩放的 -->
<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=no">
<!--Bookmark是用来显示收藏夹本网页的图标的  -->
<link rel="Bookmark" href="${path}/static/image/favicon.ico">
<!--Bookmark是用来显示浏览器导航栏本网页的图标的  -->
<link rel="Shortcut Icon" href="${path}/static/image/favicon.ico" />

<!-- 把CSS放在头部，可以让页面根据CSS样式逐步渲染-->
<link type="text/css" ref="stylesheet"
	href="${path}/static/css/bootstrap-3.3.5.min.css" />
</head>

<body>${path} aa
</body>

<script type="text/javascript">var path="${path}"</script>
<!-- 浏览器下载js脚本文件时候，不会启动其他下载任务，放在底部有助于页面加载速度 -->
<script type="text/javascript" src="${path}/static/js/require.js"></script>
<script type="text/javascript" src="${path}/static/js/main.js" defer async="true" ></script>
<script type="text/javascript">
require(['jquery','test'],function($,tt){
	$(function() {
		//tt.functionTest();
		functionTest();
	})
})
	</script>

</html>