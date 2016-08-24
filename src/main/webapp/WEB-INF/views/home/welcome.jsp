<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html lang="zh-CN">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta name="description" content="">
<meta name="author" content="">

<title>Narrow Jumbotron Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="/static/bootstrap/css/bootstrap.css" rel="stylesheet">
</head>
<body>
	<div>
		<c:url var="logoutUrl" value="/logout" />
		<form class="form-inline" action="${logoutUrl}" method="post">
			<input type="submit" value="Log out" /> <input type="hidden"
				name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
	</div>
	<div class="container">
		<div class="header clearfix">
			<h1 class="text-muted">成功登陆</h1>
		</div>
		<div class="jumbotron">
			<h1>科瑞森重装集团</h1>
			<p class="lead">
				你好！
				<%--添加这句话就会报错  无法解析？ <c:out value="${pageContext.request.remoteUser}" /> --%>
			</p>
			<div>
				<a class="btn btn-lg btn-success" href="/login" role="button">登录</a>
				<a class="btn btn-lg btn-success" href="#" role="button">客户入口</a>
			</div>
		</div>
		<div class="col-lg-6">
			<h4>Subheading</h4>
			<p>Donec id elit non mi porta gravida at eget metus. Maecenas
				faucibus mollis interdum.</p>

			<h4>Subheading</h4>
			<p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
				Cras mattis consectetur purus sit amet fermentum.</p>

			<h4>Subheading</h4>
			<p>Maecenas sed diam eget risus varius blandit sit amet non
				magna.</p>
		</div>
	</div>
	<footer class="footer">
		<p class="">&copy; Company 2014</p>
	</footer>
</body>
</html>
