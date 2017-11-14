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
    <link rel="stylesheet" type="text/css" href="../css/style.css">
    <link rel="stylesheet" type="text/css" href="../css/reset.css">
    <link rel="stylesheet" type="text/css" href="../css/luara.left.css"/>
    <link rel="stylesheet" type="text/css" href="../css/user.css">

    <!--地区选择 js文件-->
	<script src="../js/area.js"></script>
    <script type="text/javascript" src="../js/jquery-1.10.1.min.js"></script>
    <!--文字轮换 js文件-->
    <script type="text/javascript" src="../js/jquery.SuperSlide.2.1.1.js"></script>
    <!--Luara js文件-->
    <script src="../js/jquery.luara.0.0.1.min.js"></script>
    <!--tab选项卡 js文件-->
    <script type="text/javascript" src="../js/admin.js"></script>
</head>
<body>
<!--头部-->
<div id="headerBar">
	<!--登陆\注册-->
    <div class="topbar">
        <div class="topbox">
            <div class="box_1">
                您好！欢迎来到易学易教网！<a href="#">请登录</a> | <a href="#">免费注册</a>
            </div>
            <div class="box_2">
                <div class="fav">
                    <div class="tel">
                        <span>全国投诉专线：18359337329</span>
                    </div>
                    <span>&nbsp;|&nbsp;<a href="javascript:window.external.addFavorite(&#39;http://www.ygjj.com&#39;,&#39;阳光家教网&#39;)">收藏本站</a></span>
                </div>
            </div>
        </div>
    </div>
    <!--Logo\搜索-->
    <div class="logoBar">
        <div class="comWidth">
            <div class="logo fl">
                <a href="#"><img src="../images/logo.jpg"></a>
            </div>
            <div class="all fl">
			    <div class="head">
			        <p><label class="diqu"></label></p>
			        <p><label class="btn">[更多城市]</label></p>
			    </div>
			    <!--弹出层（选择城市）-->
			    <div class="cityBox">
			        <div class="head">
			            <span class="title">选择城市</span>
			            <span class="close" onClick="closeFun()">关闭</span>
        			</div>
        			<div class="cont">
			            <div class="c1">
			                <label class="bt">省/直辖市：</label>
			                <ul class="list" id="province"></ul>
			            </div>
            			<ul class="list" style="width: 100%;margin-left: 20px" id="city"></ul>
        			</div>
    			</div>
			</div>
			<script>
			    $(function(){
			        var this_ity;
			        $.getScript('http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js', function(_result) {
			            if (remote_ip_info.ret == '1') {
			              this_ity=remote_ip_info.city;
			                var myDate = new Date();
			                var thisDate=myDate.getMonth()+1;
			                $.getScript('http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js', function(_result) {
			                    $.ajax({
			                        type: "GET",
			                        url: "http://wthrcdn.etouch.cn/weather_mini?city="+this_ity,
			                        dataType: "json",
			                        success: function(data){
			                            if(data.status==1000){
			                                var date=[];
			                                var json=data.data;
			                                $(".diqu").html(json.city);
			                            }else{
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
			function cityBtn(obj){
			    closeFun();
			    var cityS=$(obj).html();
			    var myDate = new Date();
			    var thisDate=myDate.getMonth()+1;
			    $.getScript('http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js', function(_result) {
			        $.ajax({
			            type: "GET",
			            url: "http://wthrcdn.etouch.cn/weather_mini?city="+cityS,
			            dataType: "json",
			            success: function(data){
			                if(data.status==1000){
			                    var date=[];
			                    var json=data.data;
			                    $(".diqu").html(json.city);
			                }else{
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
                <input type="text" name="search_text" class="search_text fl">
                <input type="button" value="搜 索" class="search_btn fr">
            </div>
            <div class="shopCar fr">
                <span class="shopText fl">购物车</span>
                <span class="shopNum fl">0</span>
            </div>
        </div>
    </div>
    <!--导航栏-->
    <div class="nav clearfix">
        <div class="comWidth">
            <ul>
                <li>
                    <a href="#">首页</a>
                </li>
                <li class="sunav"><a href="#">教师秀</a>
                    <span>
                        <ul>
                            <li><a href="#">幼教老师</a></li>
                            <li><a href="#">小学老师</a></li>
                            <li><a href="#">初中老师</a></li>
                            <li><a href="#">高中老师</a></li>
                            <li><a href="#">应届高考生</a></li>
                            <li><a href="#">文科状元</a></li>
                            <li><a href="#">理科状元</a></li>
                        </ul>
                    </span>
                </li>
                <li class="sunav"><a href="#">课程教辅</a>
                    <span>
                        <ul>
                            <li><a href="#">语文</a></li>
                            <li><a href="#">数学</a></li>
                            <li><a href="#">外文</a></li>
                            <li><a href="#">思想政治</a></li>
                            <li><a href="#">历史</a></li>
                            <li><a href="#">地理</a></li>
                            <li><a href="#">物理</a></li>
                            <li><a href="#">化学</a></li>
                            <li><a href="#">生物</a></li>
                        </ul>
                    </span>
                </li>
                <li class="sunav"><a href="#">课外兴趣</a>
                    <span>
                        <ul>
                            <li><a href="#">声乐</a></li>
                            <li><a href="#">美术</a></li>
                            <li><a href="#">形体</a></li>
                            <li><a href="#">体能/运动</a></li>
                            <li><a href="#">信息技术</a></li>
                        </ul>
                    </span>
                </li>
                <li class="sunav"><a href="#">教育资讯</a></li>
                <li class="sunav"><a href="#">教育心得</a></li>
                <li class="sunav"><a href="#">BBS论坛</a></li>
            </ul>
        </div>
    </div>
</div>
<!--会员注册-->
<div class="containerBox">
        <!--container-->
        <div class="comWidth">
            <!--bread-->
            <div class="bread">
                <div class="dh">当前位置：<a href="#">首页</a> &gt; 预约教师</div>
            </div>
            <div class="regBox">
                <div class="tit">
                    <div class="iconReg">&nbsp;</div>
                    <h3>预约家教 </h3>
                </div>
                <div class="regForm">
                    <div id="pnlSecond" class="second"> 
                    <form name="bookform" action="<%=path%>/order/Order_add.action" method="post">       	
						<s:iterator value="#session.teacherList" var="tea">
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tbody>
                            <tr>
                                <th>教辅教师号：</th>
                                <td>
                                    <input readonly="readonly" name="teacher_id" class="" type="text" value="<s:property value="#tea[0]"/>">
                                    <input name="user_id" type="hidden" value="${user_id}">
                                </td>
                            </tr>
                            <tr>
                                <th>教辅教师&nbsp;：</th>
                                <td>
                                    <label name="txtPrice" class="txt"><s:property value="#tea[1]"/></label>
                                </td>
                            </tr>
                            <tr>
                                <th>教师手机&nbsp;：</th>
                                <td>
                                    <label name="txtPrice" class="txt"><s:property value="#tea[2]"/></label>
                                </td>
                            </tr>
                            <tr>
                                <th>单&nbsp;&nbsp;价&nbsp;：</th>
                                <td>
                                    <label name="txtPrice" class="txt" name="price"><s:property value="#tea[3]"/></label>$
                                </td>
                            </tr>
                            <tr>
                                <th>教辅学员&nbsp;：</th>
                                <td>
                                    <input name="targetname" type="text" class="txt"><br>
                                </td>
                            </tr>
                            <tr>
                                <th>年&nbsp;&nbsp;级&nbsp;：</th>
                                <td>
                                    <input name="grade" type="text" class="txt"><br>
                                </td>
                            </tr>
                            <tr>
                                <th>教辅方向&nbsp;：</th>
                                <td>
                                    <input name="direction" type="text" class="txt">
                                </td>
                            </tr>
                            <tr>
                                <th>教辅时间段：</th>
                                <td>
                                    <textarea name="teachdate" cols="30" rows="3" style="overflow-x:scroll;overflow-x:hidden;border:1px solid #c2c2c2;"></textarea>
                                    <span>详细描述,以便老师安排时间</span>
                                </td>
                            </tr>
                            <tr>
                                <th>学习情况简介：</th>
                                <td>
                                     <textarea name="learning" cols="30" rows="5" style="overflow-x:scroll;overflow-x:hidden;border:1px solid #c2c2c2;"></textarea>
                                </td>
                            </tr>
                            <tr>
                                <th>&nbsp;</th>
                                <td>
                                	<input type="submit" value="" style="background:url(../images/icon/btn113.png) no-repeat;width:110px;height:43px;">
                                    <!-- <a href="<%=path%>/order/Order_add.action"><img src="../images/icon/btn113.png"/></a> -->
                                </td>
                            </tr>
                            </tbody>
                        </table>
                        </s:iterator>
                        </form>
                    </div>
                    
                </div>
                <div class="regDes">
                    <p class="tit2">
                        易学易教网优势</p>
                    <p>
                        <strong>机会多</strong><br>
                        老师只要有付出就会有回报，这里有更多的家教机会</p>
                    <p>
                        <strong>速度快</strong><br>
                        家长、学生告知需求后以最快的速度找到适合的教员</p>
                    <p>
                        <strong>师资强大</strong><br>
                        大量名校名师、优秀大学生，保证教学质量</p>
                    <p>
                        <strong>贴心服务</strong><br>
                        满足不同需求的老师、家长和学员，提供特色、贴心服务
                    </p>
                </div>
                <div style="clear:both; height:1px; overflow:hidden;"></div>
            </div>
            <!--end regbox-->
        </div>
        <!--idx end container-->
        <div style="clear:both; height:20px; overflow:hidden;"></div>
    </div>

<!--底部-->
<div class="footNavBox">
    <div class="footNav">
        <div class="cityTel">
            <span>厦门热线</span><p>400-700-7788</p>
        </div>
        <div class="navBox">
            <dl>
                <dt>会员指南</dt>
                <dd>
                    <span>→ </span><a href="#">帮助中心</a></dd>
                <dd>
                    <span>→ </span><a href="#">如何请家教</a></dd>
                <dd>
                    <span>→ </span><a href="#">如何做家教</a></dd>
                <dd>
                    <span>→ </span><a href="#">教辅人员签约协议</a></dd>
            </dl>
            <dl>
                <dt>支付方式</dt>
                <dd>
                    <span>→ </span><a href="#">在线支付</a></dd>
                <dd>
                    <span>→ </span><a href="#">银行转账</a></dd>
                <dd>
                    <span>→ </span><a href="#">资费标准</a></dd>
                <dd>
                    <span>→ </span><a href="#">退款说明</a></dd>
            </dl>
            <dl>
                <dt>服务条款</dt>
                <dd>
                    <span>→ </span><a href="#">隐私保护</a></dd>
                <dd>
                    <span>→ </span><a href="#">侵权处理</a></dd>
                <dd>
                    <span>→ </span><a href="#">免责说明</a></dd>
            </dl>
            <dl>
                <dt>关于我们</dt>
                <dd>
                    <span>→ </span><a href="#">易学易教网简介</a></dd>
                <dd>
                    <span>→ </span><a href="#">易学易教网公告</a></dd>
                <dd>
                    <span>→ </span><a href="#">联系我们</a></dd>
                <dd>
                    <span>→ </span><a href="#">友情链接</a></dd>
            </dl>
        </div>
        <div class="clearfix">
        </div>
        <div class="ps">
            【易学易教网】是中国规模较大的正规、专业家教网站。我们为您提供最优质的厦门家教，帮助厦门小老师、中学老师和大学生家教寻求家教兼职。欢迎致电<span class="focus">400-700-7788</span>
        </div>
    </div>
</div>
</body>
</html>