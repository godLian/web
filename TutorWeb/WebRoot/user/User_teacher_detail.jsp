<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>易教易学网</title>
<meta charset="utf-8">
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<link href="../css/reset.css" rel="stylesheet" type="text/css" />
<link href="../css/luara.left.css" rel="stylesheet" type="text/css" />
<link href="../css/user.css" rel="stylesheet" type="text/css" />
<link href="../css/jiajiao400_layout.css" rel="stylesheet"
	type="text/css" />
<!--地区选择 js文件-->
<script src="../js/area.js">
	
</script>
<script src="../js/jquery-1.10.1.min.js" type="text/javascript">
	
</script>
<!--文字轮换 js文件-->
<script src="../js/jquery.SuperSlide.2.1.1.js" type="text/javascript">
	
</script>
<!--Luara js文件-->
<script src="../js/jquery.luara.0.0.1.min.js">
	
</script>
<!--tab选项卡 js文件-->
<script src="../js/admin.js" type="text/javascript">
	
</script>
</meta>
</head>
</html>
<body>
	<!--头部-->
	<div id="headerBar">
		<!--登陆\注册-->
		<div class="topbar">
			<div class="topbox">
				<div class="box_1">
					您好！欢迎来到易学易教网！ <a href="#"> 请登录 </a> | <a href="#"> 免费注册 </a>
				</div>
				<div class="box_2">
					<div class="fav">
						<div class="tel">
							<span> 全国投诉专线：18359337329 </span>
						</div>
						<span> | <a
							href="javascript:window.external.addFavorite('http://www.ygjj.com','阳光家教网')">
								收藏本站 </a> </span>
					</div>
				</div>
			</div>
		</div>
		<!--Logo\搜索-->
		<div class="logoBar">
			<div class="comWidth">
				<div class="logo fl">
					<a href="#"> <img src="../images/logo.jpg" /> </a>
				</div>
				<div class="all fl">
					<div class="head">
						<p>
							<label class="diqu"> </label>
						</p>
						<p>
							<label class="btn"> [更多城市] </label>
						</p>
					</div>
					<!--弹出层（选择城市）-->
					<div class="cityBox">
						<div class="head">
							<span class="title"> 选择城市 </span> <span class="close"
								onclick="closeFun()"> 关闭 </span>
						</div>
						<div class="cont">
							<div class="c1">
								<label class="bt"> 省/直辖市： </label>
								<ul class="list" id="province">
								</ul>
							</div>
							<ul class="list" id="city" style="width: 100%;margin-left: 20px">
							</ul>
						</div>
					</div>
				</div>
				<script>
					$(function() {
						var this_ity;
						$
								.getScript(
										'http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js',
										function(_result) {
											if (remote_ip_info.ret == '1') {
												this_ity = remote_ip_info.city;
												var myDate = new Date();
												var thisDate = myDate
														.getMonth() + 1;
												$
														.getScript(
																'http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js',
																function(
																		_result) {
																	$
																			.ajax({
																				type : "GET",
																				url : "http://wthrcdn.etouch.cn/weather_mini?city="
																						+ this_ity,
																				dataType : "json",
																				success : function(
																						data) {
																					if (data.status == 1000) {
																						var date = [];
																						var json = data.data;
																						$(
																								".diqu")
																								.html(
																										json.city);
																					} else {
																						alert("获取数据错误")
																					}
																				}
																			});
																});
											} else {
												alert('没有找到匹配的IP地址信息！');
											}
										});

					});
					function cityBtn(obj) {
						closeFun();
						var cityS = $(obj).html();
						var myDate = new Date();
						var thisDate = myDate.getMonth() + 1;
						$
								.getScript(
										'http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js',
										function(_result) {
											$
													.ajax({
														type : "GET",
														url : "http://wthrcdn.etouch.cn/weather_mini?city="
																+ cityS,
														dataType : "json",
														success : function(data) {
															if (data.status == 1000) {
																var date = [];
																var json = data.data;
																$(".diqu")
																		.html(
																				json.city);
															} else {
																alert("获取数据错误")
															}

														}
													});
										});
					}
					function closeFun() {
						$("#province").html("");
						$("#city").html("");
						$(".cityBox").hide();
					}
				</script>
				<div class="search_box fl">
					<input class="search_text fl" name="search_text" type="text">
					<input class="search_btn fr" type="button" value="搜 索"> </input> </input>
				</div>
				<div class="shopCar fr">
					<span class="shopText fl"> 购物车 </span> <span class="shopNum fl">
						0 </span>
				</div>
			</div>
		</div>
		<!--导航栏-->
		<div class="nav clearfix">
			<div class="comWidth">
				<ul>
					<li><a href="#"> 首页 </a></li>
					<li class="sunav"><a href="#"> 教师秀 </a> <span>
							<ul>
								<li><a href="#"> 幼教老师 </a></li>
								<li><a href="#"> 小学老师 </a></li>
								<li><a href="#"> 初中老师 </a></li>
								<li><a href="#"> 高中老师 </a></li>
								<li><a href="#"> 应届高考生 </a></li>
								<li><a href="#"> 文科状元 </a></li>
								<li><a href="#"> 理科状元 </a></li>
							</ul> </span></li>
					<li class="sunav"><a href="#"> 课程教辅 </a> <span>
							<ul>
								<li><a href="#"> 语文 </a></li>
								<li><a href="#"> 数学 </a></li>
								<li><a href="#"> 外文 </a></li>
								<li><a href="#"> 思想政治 </a></li>
								<li><a href="#"> 历史 </a></li>
								<li><a href="#"> 地理 </a></li>
								<li><a href="#"> 物理 </a></li>
								<li><a href="#"> 化学 </a></li>
								<li><a href="#"> 生物 </a></li>
							</ul> </span></li>
					<li class="sunav"><a href="#"> 课外兴趣 </a> <span>
							<ul>
								<li><a href="#"> 声乐 </a></li>
								<li><a href="#"> 美术 </a></li>
								<li><a href="#"> 形体 </a></li>
								<li><a href="#"> 体能/运动 </a></li>
								<li><a href="#"> 信息技术 </a></li>
							</ul> </span></li>
					<li class="sunav"><a href="#"> 教育资讯 </a></li>
					<li class="sunav"><a href="#"> 教育心得 </a></li>
					<li class="sunav"><a href="#"> BBS论坛 </a></li>
				</ul>
			</div>
		</div>
	</div>
	<!--会员注册-->
	<div id="content">
		<div class="breadcrumbnav mb">
			当前位置：<a href="#"> 首页</a>&gt; <a href="#"> 请家教 </a> &gt; <a href="#">
				王家教 </a>
		</div>
		<div class="box680 fl mr">
			<div class="teacher_detailbox">
			<!-- 循环开始 -->
				<s:iterator value="#session.taught" var="taught">
				<div class="title">
					<div class="btbox mb5">
						<strong class="name vm mr"> <s:property value="#taught[1]"/> </strong>
					</div>
					<div class="msg"><s:property value="#taught[19]"/></div>
				</div>
				<div class="cont">
					<div class="detail_photo fl">
						<div class="dbox">
							<dl>
								<dt class="img-t">
									<img alt="小学数学家教王教员" height="210" src="/upload/<s:property value="#taught[2]"/>"
										title="小学数学家教王教员" width="150"></img>
								</dt>
								<dd class="clearfix two">
									<div class="icon i1">
										<strong class="bk num"> 244250 </strong> <br> <strong
											class="ts"> 家教ID </strong> </br>
									</div>
									<div class="icon i2">
										<strong class="bk num"> 1 </strong> <br> 
										<strong class="ts"> 浏览量 </strong> </br>
									</div>
								</dd>
							</dl>
						</div>
					</div>
					<div class="detail_info fl">
						<ul class="mb5">
							<li><strong class="bt"> 身份验证 </strong>
							<s:if test='=="1"'>
								<div class="nr">
								<s:if test="#taught[3]=='true'">
									<span> 公民认证 </span>
								</s:if>
								<s:if test="#taughr[4]=='true'">
									<span> 大学生认证 </span>
								</s:if>
								</div>
							</s:if>
							</li>
							<li><strong class="bt"> 学校 </strong>
								<div class="nr">
									<a href="#" target="_blank" title="中央民族大学家教"><s:property value="#taught[5]"/></a>
								</div>
							</li>
							<li><strong class="bt"> 所学专业 </strong>
								<div class="nr"><s:property value="#taught[6]"/></div> 
								<strong class="bt"> 所在年级 </strong>
								<div class="nr"><s:property value="#taught[7]"/></div>
							</li>
							<li><strong class="bt"> 年龄 </strong>
								<div class="nr"><s:property value="#taught[9]"/></div>
							</li>
							<li><strong class="bt"> 性别 </strong>
								<div class="nr"><s:property value="#taught[10]"/></div>
							</li>
							<li><strong class="bt"> 家教经验 </strong>
								<div class="nr"><s:property value="#taught[12]"/>年</div>
							</li>
							<li><strong class="bt"> 所在区域 </strong>
								<div class="nr"><s:property value="#taught[11]"/></div>
							</li>
							<li><strong class="bt"> 辅导科目 </strong>
								<div class="nr">
									<a href="http://www.jiajiao400.com/bj/jiajiao/xiaoxueshuxue/"
										target="_blank" title="北京小学数学家教"> <s:property value="#taught[14]"/> </a> 
									<a href="http://www.jiajiao400.com/bj/jiajiao/xiaoxueaoshu/"
										target="_blank" title="北京小学奥数家教"> <s:property value="#taught[15]"/> </a>
								</div></li>
							<li><strong class="bt"> 授课方式 </strong>
								<div class="nr"><s:property value="#taught[17]"/>.</div></li>
						</ul>
						<div class="msgbox mb5">
							<ul>
								<li><strong class="bt"> 课时费用 </strong>
									<div class="nr">
										<span style="color:#FD6512;"> 个人价：<s:property value="#taught[13]"/>元/小时起 </span>
									</div></li>
								<li style="padding: 10px 0;"><strong class="bt">
										电话 </strong>
									<div class="nr">
										<a class="#"> <s:property value="#taught[16]"/> </a>
									</div></li>
							</ul>
						</div>
						<ul>
							<li><strong class="bt"> 个人简介 </strong>
								<div class="nr">
									<s:property value="#taught[18]"/>
								</div></li>
						</ul>
					</div>
						<div class="clearfix fr">
							<span style="margin-right:180px;">
								<a href="<%=path%>/taught/Taught_adddetail.action?id=<s:property value="#taught[0]"/>" target="_blank"><img src="../images/icon/btn112.png"></a>
							</span>
						</div>
					<div class="clear"></div>
				</div>
				</s:iterator>
				<!--循环结束-->
			</div>
			<!--/box_ui_sy4-->
			<div class="box_ui_sy6 related_teacher mb20">
				<div class="title">
					<h2 class="tith mr">其他相关家教</h2>
				</div>
				<!--/ title-->
				<div class="cont">
					<ul>
						<li>
							<dl class="clearfix">
								<dt class="img50">
									<a class="img-h"
										href="http://www.jiajiao400.com/bj/jiajiao/168290.html"> <img
										src="./魏公村白石桥附近小学数学家教,王教员验证ID244250-北京常青藤家教网_files/310536_1504362104VqKY.jpg.thumb.jpg"
										width="50"> </img> </a> <a class="design"
										href="http://www.jiajiao400.com/bj/jiajiao/168290.html"
										target="_blank"> </a>
								</dt>
								<dd>
									<div class="btbox">
										<a class="green"
											href="http://www.jiajiao400.com/bj/jiajiao/168290.html"
											target="_blank"> 经海七路光谷附近的左洋 </a>
									</div>
									<div class="nr clearfix">
										<a class="green fr"
											href="http://www.jiajiao400.com/bj/jiajiao/168290.html"
											target="_blank"> 查看详细信息 </a> <span class="bk mr30"> <strong
											class="sbt"> 辅导科目： </strong> 初中数学 </span> <span class="bk mr30">
											<strong class="sbt"> 性别： </strong> 男 </span> <span class="bk">
											<strong class="sbt"> 身份： </strong> 大学生家教 </span>
									</div>
								</dd>
							</dl></li>
						<li>
							<dl class="clearfix">
								<dt class="img50">
									<a class="img-h"
										href="http://www.jiajiao400.com/bj/jiajiao/231949.html"> <img
										src="./魏公村白石桥附近小学数学家教,王教员验证ID244250-北京常青藤家教网_files/nopic50.png">
										</img> </a> <a class="design"
										href="http://www.jiajiao400.com/bj/jiajiao/231949.html"
										target="_blank"> </a>
								</dt>
								<dd>
									<div class="btbox">
										<a class="green"
											href="http://www.jiajiao400.com/bj/jiajiao/231949.html"
											target="_blank"> 右安门附近的LI </a>
									</div>
									<div class="nr clearfix">
										<a class="green fr"
											href="http://www.jiajiao400.com/bj/jiajiao/231949.html"
											target="_blank"> 查看详细信息 </a> <span class="bk mr30"> <strong
											class="sbt"> 辅导科目： </strong> 小学全科 </span> <span class="bk mr30">
											<strong class="sbt"> 性别： </strong> 女 </span> <span class="bk">
											<strong class="sbt"> 身份： </strong> 大学生家教 </span>
									</div>
								</dd>
							</dl></li>
						<li>
							<dl class="clearfix">
								<dt class="img50">
									<a class="img-h"
										href="http://www.jiajiao400.com/bj/jiajiao/242889.html"> <img
										src="./魏公村白石桥附近小学数学家教,王教员验证ID244250-北京常青藤家教网_files/432270_1504948735E1Q2.jpg.thumb.jpg"
										width="50"> </img> </a> <a class="design"
										href="http://www.jiajiao400.com/bj/jiajiao/242889.html"
										target="_blank"> </a>
								</dt>
								<dd>
									<div class="btbox">
										<a class="green"
											href="http://www.jiajiao400.com/bj/jiajiao/242889.html"
											target="_blank"> 华纺易城小区附近的Jane </a>
									</div>
									<div class="nr clearfix">
										<a class="green fr"
											href="http://www.jiajiao400.com/bj/jiajiao/242889.html"
											target="_blank"> 查看详细信息 </a> <span class="bk mr30"> <strong
											class="sbt"> 辅导科目： </strong> 中考数学 </span> <span class="bk mr30">
											<strong class="sbt"> 性别： </strong> 女 </span> <span class="bk">
											<strong class="sbt"> 身份： </strong> 大学生家教 </span>
									</div>
								</dd>
							</dl></li>
						<li>
							<dl class="clearfix">
								<dt class="img50">
									<a class="img-h"
										href="http://www.jiajiao400.com/bj/jiajiao/243043.html"> <img
										src="./.jpg" width="50"> </img> </a> <a class="design"
										href="http://www.jiajiao400.com/bj/jiajiao/243043.html"
										target="_blank"> </a>
								</dt>
								<dd>
									<div class="btbox">
										<a class="green"
											href="http://www.jiajiao400.com/bj/jiajiao/243043.html"
											target="_blank"> 西土城路10附近的王老师 </a>
									</div>
									<div class="nr clearfix">
										<a class="green fr"
											href="http://www.jiajiao400.com/bj/jiajiao/243043.html"
											target="_blank"> 查看详细信息 </a> <span class="bk mr30"> <strong
											class="sbt"> 辅导科目： </strong> 初中英语 </span> <span class="bk mr30">
											<strong class="sbt"> 性别： </strong> 女 </span> <span class="bk">
											<strong class="sbt"> 身份： </strong> 大学生家教 </span>
									</div>
								</dd>
							</dl></li>
					</ul>
				</div>
			</div>
			<!--/box_ui_sy6-->
			<div class="title_style4 mb20">
				<a class="hover" href="javascript:;" id="writecomment"> 写家教点评 </a>
			</div>
			<!--/ title_style4-->
			<div class="box_ui_sy5 pa10 tc">
				<div align="center" id="dianji" onclick="dianji()"
					style="height:40px;padding-top:25px">
					<span class="gray9"> 我是家长/学员， </span> <a class="green"
						href="javascript:;" id="comts" style="cursor:pointer"> 我要写点评 </a>
				</div>
			</div>
		</div>
		<div class="box270 fl">
			<div class="box_ui_sy3">
				<div class="title">
					<h2 class="tith">王教员 最近登陆时间</h2>
				</div>
				<!--/title-->
				<div class="cont">
					<div class="databox">
						<ul>
							<li>注册时间：2017-10-17</li>
							<li>最近一次登录：2017-10-17</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="box_ui_sy1 mt">
				<div class="title">
					<h2 class="tith">热门大学家教</h2>
				</div>
				<div class="cont pa15">
					<ul class="article_list_s1">
						<li><a href="http://www.jiajiao400.com/bj/jiajiao/p1i1807/">
								首都师范大学家教 </a></li>
						<li><a href="http://www.jiajiao400.com/bj/jiajiao/p1i6/">
								北京航空航天大学家教 </a></li>
						<li><a href="http://www.jiajiao400.com/bj/jiajiao/p1i1724/">
								北京理工大学家教 </a></li>
						<li><a href="http://www.jiajiao400.com/bj/jiajiao/p1i10/">
								北京化工大学家教 </a></li>
						<li><a href="http://www.jiajiao400.com/bj/jiajiao/p1i5/">
								北京工业大学家教 </a></li>
						<li><a href="http://www.jiajiao400.com/bj/jiajiao/p1i3/">
								清华大学家教 </a></li>
						<li><a href="http://www.jiajiao400.com/bj/jiajiao/p1i1/">
								北京大学家教 </a></li>
						<li><a href="http://www.jiajiao400.com/bj/jiajiao/p1i1727/">
								北京科技大学家教 </a></li>
						<li><a href="http://www.jiajiao400.com/bj/jiajiao/p1/">
								更多 >> </a></li>
					</ul>
				</div>
			</div>
			<div class="box_ui_sy1 mt">
				<div class="title">
					<h2 class="tith">家长使用帮助</h2>
				</div>
				<!--/title-->
				<div class="cont pa15">
					<ul>
						<li><a href="http://www.jiajiao400.com/help/price"
							target="_blank"> 家教课时费参考标准 </a></li>
						<li><a href="http://www.jiajiao400.com/help/#help_ask3"
							target="_blank"> 如何查看家教的联系方式？ </a></li>
						<li><a href="http://www.jiajiao400.com/help/tiaoxuan"
							target="_blank"> 挑选家教的3个诀窍是什么？ </a></li>
						<li><a href="http://www.jiajiao400.com/contract.rar">
								信用保证，下载签订家教聘用协议 </a></li>
						<li><a href="http://www.jiajiao400.com/help/fangpian"
							target="_blank"> 找家教防诈骗 </a></li>
					</ul>
				</div>
				<!--/cont-->
			</div>
			<div class="box_ui_sy1 mb">
				<div class="title">
					<h2 class="tith">老师谈教育</h2>
				</div>
				<div class="cont pa15">
					<ul class="article_list_s1">
						<li><a
							href="http://www.jiajiao400.com/bj/jiajiao/106558.html"
							target="_blank"> 汤老师 </a> ： <a
							href="http://www.jiajiao400.com/bj/jiajiaowenzhang/50220.html"
							target="_blank"> [累累硕果，冰山一角] </a></li>
						<li><a
							href="http://www.jiajiao400.com/bj/jiajiao/241608.html"
							target="_blank"> 郭老师 </a> ： <a
							href="http://www.jiajiao400.com/bj/jiajiaowenzhang/50203.html"
							target="_blank"> 中国油画介绍 </a></li>
						<li><a href="http://www.jiajiao400.com/bj/jiajiao/43757.html"
							target="_blank"> 卜老师 </a> ： <a
							href="http://www.jiajiao400.com/bj/jiajiaowenzhang/50157.html"
							target="_blank"> 教育部改革至得语文者，赢在中高 </a></li>
						<li><a
							href="http://www.jiajiao400.com/bj/jiajiao/238020.html"
							target="_blank"> 莫等闲教育 </a> ： <a
							href="http://www.jiajiao400.com/bj/jiajiaowenzhang/50137.html"
							target="_blank"> 中学生理科学习方法建议 </a></li>
						<li><a
							href="http://www.jiajiao400.com/bj/jiajiao/178315.html"
							target="_blank"> 尚 </a> ： <a
							href="http://www.jiajiao400.com/bj/jiajiaowenzhang/50128.html"
							target="_blank"> 化学知识结构概述 </a></li>
						<li><a
							href="http://www.jiajiao400.com/bj/jiajiao/233429.html"
							target="_blank"> 敖老师 </a> ： <a
							href="http://www.jiajiao400.com/bj/jiajiaowenzhang/50126.html"
							target="_blank"> 想写好作文，先得学好《声律启蒙 </a></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="clear"></div>
	</div>
	<!--底部-->
	<div class="footNavBox">
		<div class="footNav">
			<div class="cityTel">
				<span> 厦门热线 </span>
				<p>400-700-7788</p>
			</div>
			<div class="navBox">
				<dl>
					<dt>会员指南</dt>
					<dd>
						<span> → </span> <a href="#"> 帮助中心 </a>
					</dd>
					<dd>
						<span> → </span> <a href="#"> 如何请家教 </a>
					</dd>
					<dd>
						<span> → </span> <a href="#"> 如何做家教 </a>
					</dd>
					<dd>
						<span> → </span> <a href="#"> 教辅人员签约协议 </a>
					</dd>
				</dl>
				<dl>
					<dt>支付方式</dt>
					<dd>
						<span> → </span> <a href="#"> 在线支付 </a>
					</dd>
					<dd>
						<span> → </span> <a href="#"> 银行转账 </a>
					</dd>
					<dd>
						<span> → </span> <a href="#"> 资费标准 </a>
					</dd>
					<dd>
						<span> → </span> <a href="#"> 退款说明 </a>
					</dd>
				</dl>
				<dl>
					<dt>服务条款</dt>
					<dd>
						<span> → </span> <a href="#"> 隐私保护 </a>
					</dd>
					<dd>
						<span> → </span> <a href="#"> 侵权处理 </a>
					</dd>
					<dd>
						<span> → </span> <a href="#"> 免责说明 </a>
					</dd>
				</dl>
				<dl>
					<dt>关于我们</dt>
					<dd>
						<span> → </span> <a href="#"> 易学易教网简介 </a>
					</dd>
					<dd>
						<span> → </span> <a href="#"> 易学易教网公告 </a>
					</dd>
					<dd>
						<span> → </span> <a href="#"> 联系我们 </a>
					</dd>
					<dd>
						<span> → </span> <a href="#"> 友情链接 </a>
					</dd>
				</dl>
			</div>
			<div class="clearfix"></div>
			<div class="ps">
				【易学易教网】是中国规模较大的正规、专业家教网站。我们为您提供最优质的厦门家教，帮助厦门小老师、中学老师和大学生家教寻求家教兼职。欢迎致电
				<span class="focus"> 400-700-7788 </span>
			</div>
		</div>
	</div>
</body>
