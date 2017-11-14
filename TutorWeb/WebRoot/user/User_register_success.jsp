<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


注册成功!将在<span id="time" style="background:red">5</span>秒钟后自动跳转到首页，如果不跳转，请点击下面链接

<script type="text/javascript">  

function delayURL(url) {
	var delay = document.getElementById("time").innerHTML;
	if(delay > 0) {
		delay--;
		document.getElementById("time").innerHTML = delay;
	} else {
		window.top.location.href = url;
    }
    setTimeout("delayURL('" + url + "')", 1000); 
}

</script>


<a href="<%=path%>/user/User_home_page.jsp">易学易教网首页</a>

<script type="text/javascript">
	delayURL("<%=path%>/user/User_home_page.jsp");
</script>