<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>MGR</title>
<link rel="stylesheet" type="text/css"
	href="/mgr/resources/css/style.css" />

</head>
<body>
	<div class="mainContainer">
		<div class="header">
			<div>
				<tiles:insertAttribute name="header" />
			</div>
		</div>
		<div class="menu">
			<div>
				<tiles:insertAttribute name="menu" />
			</div>
		</div>
		<div class="body">
			<div>
				<tiles:insertAttribute name="body" />
			</div>
		</div>
		<div class="footer">
			<div>
				<tiles:insertAttribute name="footer" />
			</div>
		</div>
	</div>
</body>
</html>