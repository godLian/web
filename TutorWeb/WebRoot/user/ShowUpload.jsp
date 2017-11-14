<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>ShowUpload</title>
</head>
<body>
<div style ="padding: 3px; border: solid 1px #cccccc; text-align: center" >
<img src ="UploadImages/<s:property value ="imageFileName"/> "/>
<br />
<s:property value ="caption"/>
</div >
</body>
</html>
