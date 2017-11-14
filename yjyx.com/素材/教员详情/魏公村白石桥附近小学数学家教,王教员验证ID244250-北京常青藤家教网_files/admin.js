function tab_door(par,cont){

$(par +" "+"li").hover(
  function () {
    $(this).addClass("active");
  },
  function () {
    $(this).removeClass("active");
  }
);
}







//滑过 页签切换
//par
//contag
//menu
//menutag
function jscityre_sortToggle(par,contag,menu,menutag){ 
var contArray=$(par+" "+contag);
var menuArray=$(menu+" "+menutag);
menuArray.each(function(i){
	$(this).hover(function(){
		menuArray.each(function(n){
			if(i==n){
				if($(contArray[n]).attr("style"))$(contArray[n]).removeAttr("style");
				$(this).attr("class","active");
			}else{
				$(this).removeAttr("class");
				$(contArray[n]).css("display","none");
			}
			
		})
	});
});
}


//点击 页签切换
//par
//contag
//menu
//menutag
function click_tab(par,contag,menu,menutag){ 
var contArray=$(par+" "+contag);
var menuArray=$(menu+" "+menutag);
menuArray.each(function(i){
	$(this).click(function(){
		menuArray.each(function(n){
			if(i==n){
				if($(contArray[n]).attr("style"))$(contArray[n]).removeAttr("style");
				$(this).attr("class","hover");
			}else{
				$(this).removeAttr("class");
				$(contArray[n]).css("display","none");
			}
			
		})
	});
});
}





//页签切换
//par
//contag
//menu
//menutag
function noticetab(par,contag,menu,menutag){ 
var contArray=$(par+" "+contag);
var menuArray=$(menu+" "+menutag);
menuArray.each(function(i){
	$(this).hover(function(){
		menuArray.each(function(n){
			if(i==n){
				if($(contArray[n]).attr("style"))$(contArray[n]).removeAttr("style");
				$(this).addClass("active");
			}else{
				$(this).removeClass("active");
				$(contArray[n]).css("display","none");
			}
			
		})
	});
});
}







//店铺首页推荐房源滚动
function shoplistindex(id){ 
	var updisplay1 = $("#updisplay1");
	var updisplay  = $("#updisplay");
	var dnbar  = $(".x-l");
	var upbar  = $(".x-r");
	var uwidth = updisplay1.width();
	var uleft  = parseInt(updisplay1.css('left'));
	var _interval;
	if(uwidth>100){
	if(id>2){upbar.click(function (){
		 clearInterval(_interval);
		if(-parseInt(updisplay1.css('left'))<(id-2)*135){
		updisplay1.animate({left:'-=135'},"quick");}
	})
	}
	dnbar.click(function (){
		 clearInterval(_interval);
		if(parseInt(updisplay1.css('left'))<0)updisplay1.animate({left:'+=135'},"quick");
	})
	}
	$(document).ready(function(){    
	_interval = setInterval(function (){
		if(-parseInt(updisplay1.css('left'))<(id-2)*135){
		updisplay1.animate({left:'-=135'},"quick");}else{
			updisplay1.css({'left':"0px"});
		}
	},2500);
	})
} 



<!--
//图片滚动列表 mengjia 070927
var Speed_1 = 10; //速度(毫秒)
var Space_1 = 20; //每次移动(px)
var PageWidth_1 = 123 * 5; //翻页宽度
var interval_1 = 7000; //翻页间隔
var fill_1 = 0; //整体移位
var MoveLock_1 = false;
var MoveTimeObj_1;
var MoveWay_1="right";
var Comp_1 = 0;
var autoPlayObj_1=null;
function GetObj(objName){if(document.getElementById){return eval('document.getElementById("'+objName+'")')}else{return eval('document.all.'+objName)}}
function autoPlay_1(){clearInterval(autoPlayObj_1);autoPlayObj_1=setInterval('ISL_GoDown_1();ISL_StopDown_1();',interval_1)}
function ISL_GoUp_1(){if(MoveLock_1)return;clearInterval(autoPlayObj_1);MoveLock_1=true;MoveWay_1="left";MoveTimeObj_1=setInterval('ISL_ScrUp_1();',Speed_1);}
function ISL_StopUp_1(){if(MoveWay_1 == "right"){return};clearInterval(MoveTimeObj_1);if((GetObj('ISL_Cont_1').scrollLeft-fill_1)%PageWidth_1!=0){Comp_1=fill_1-(GetObj('ISL_Cont_1').scrollLeft%PageWidth_1);CompScr_1()}else{MoveLock_1=false}
autoPlay_1()}
function ISL_ScrUp_1(){if(GetObj('ISL_Cont_1').scrollLeft<=0){GetObj('ISL_Cont_1').scrollLeft=GetObj('ISL_Cont_1').scrollLeft+GetObj('List1_1').offsetWidth}
GetObj('ISL_Cont_1').scrollLeft-=Space_1}
function ISL_GoDown_1(){clearInterval(MoveTimeObj_1);if(MoveLock_1)return;clearInterval(autoPlayObj_1);MoveLock_1=true;MoveWay_1="right";ISL_ScrDown_1();MoveTimeObj_1=setInterval('ISL_ScrDown_1()',Speed_1)}
function ISL_StopDown_1(){if(MoveWay_1 == "left"){return};clearInterval(MoveTimeObj_1);if(GetObj('ISL_Cont_1').scrollLeft%PageWidth_1-(fill_1>=0?fill_1:fill_1+1)!=0){Comp_1=PageWidth_1-GetObj('ISL_Cont_1').scrollLeft%PageWidth_1+fill_1;CompScr_1()}else{MoveLock_1=false}
autoPlay_1()}
function ISL_ScrDown_1(){if(GetObj('ISL_Cont_1').scrollLeft>=GetObj('List1_1').scrollWidth){GetObj('ISL_Cont_1').scrollLeft=GetObj('ISL_Cont_1').scrollLeft-GetObj('List1_1').scrollWidth}
GetObj('ISL_Cont_1').scrollLeft+=Space_1}
function CompScr_1(){if(Comp_1==0){MoveLock_1=false;return}
var num,TempSpeed=Speed_1,TempSpace=Space_1;if(Math.abs(Comp_1)<PageWidth_1/2){TempSpace=Math.round(Math.abs(Comp_1/Space_1));if(TempSpace<1){TempSpace=1}}
if(Comp_1<0){if(Comp_1<-TempSpace){Comp_1+=TempSpace;num=TempSpace}else{num=-Comp_1;Comp_1=0}
GetObj('ISL_Cont_1').scrollLeft-=num;setTimeout('CompScr_1()',TempSpeed)}else{if(Comp_1>TempSpace){Comp_1-=TempSpace;num=TempSpace}else{num=Comp_1;Comp_1=0}
GetObj('ISL_Cont_1').scrollLeft+=num;setTimeout('CompScr_1()',TempSpeed)}}
function picrun_ini(){
GetObj("List2_1").innerHTML=GetObj("List1_1").innerHTML;
GetObj('ISL_Cont_1').scrollLeft=fill_1>=0?fill_1:GetObj('List1_1').scrollWidth-Math.abs(fill_1);
GetObj("ISL_Cont_1").onmouseover=function(){clearInterval(autoPlayObj_1)}
GetObj("ISL_Cont_1").onmouseout=function(){autoPlay_1()}
autoPlay_1();
}
//产品展示滚动图片结束
//-->







//滚动插件
(function($){
$.fn.extend({
Scroll:function(opt,callback){
//参数初始化
if(!opt) var opt={};
var _this=this.eq(0).find("ul:first");
var        lineH=_this.find("li:first").height(), //获取行高
line=opt.line?parseInt(opt.line,10):parseInt(this.height()/lineH,10), //每次滚动的行数，默认为一屏，即父容器高度
speed=opt.speed?parseInt(opt.speed,10):500, //卷动速度，数值越大，速度越慢（毫秒）
timer=opt.timer?parseInt(opt.timer,10):3000; //滚动的时间间隔（毫秒）
if(line==0) line=1;
var upHeight=0-line*lineH;
//滚动函数
scrollUp=function(){
_this.animate({
marginTop:upHeight
},speed,function(){
for(i=1;i<=line;i++){
_this.find("li:first").appendTo(_this);
}
_this.css({marginTop:0});
});
}
//鼠标事件绑定
_this.hover(function(){
clearInterval(timerID);
},function(){
timerID=setInterval("scrollUp()",timer);
}).mouseout();
}       
})
})(jQuery);


function dMarquee(id){
 var speed=100; //速度
 var stop=1000; //停止时间 

 var ul = document.getElementById(id);
 var rows=ul.getElementsByTagName('li').length;
 var height = ul.getElementsByTagName('li')[0].offsetHeight;

 ul.innerHTML += ul.innerHTML;

 var timeID = false;
 
 var play = function() {
  ul.scrollTop++;

  if(ul.scrollTop==rows*height){
   ul.scrollTop=0;
  }

  if(ul.scrollTop%height==0) {
   timeID = setTimeout(play,stop);
  }else{
   timeID = setTimeout(play,speed);
  } 
 }

 timeID = setTimeout(play,stop);


 ul.onmouseover = function() {clearTimeout(timeID);}
 ul.onmouseout = play;
}

$(document).ready(function(){
if($("#scrollSR").length>0){dMarquee('scrollSR');}
if($("#scrollD").length>0){dMarquee('scrollD');}
if($("#scrollDiv").length>0){dMarquee('scrollDiv');}
});

//list页面切换效果

//par
//contag
//menu
//menutag
function jscityre_sortToggle(par,contag,menu,menutag){ 
var contArray=$(par+" "+contag);
var menuArray=$(menu+" "+menutag);
menuArray.each(function(i){
	$(this).mousemove(function(){
		menuArray.each(function(n){
			if(i==n){
				if($(contArray[n]).attr("style"))$(contArray[n]).removeAttr("style");
				$(this).attr("class","active");
			}else{
				$(this).removeAttr("class");
				$(contArray[n]).css("display","none");
			}
			
		})
	});
});
}


//contactlist
function contactlist(par,cont){

$(par +" "+"li").hover(
  function () {
    $(this).addClass("hover");
  },
  function () {
    $(this).removeClass("hover");
  }
);
}

//newslist
function newslist(par,cont){

$(par +" "+"li").hover(
  function () {
    $(this).addClass("hover");
  },
  function () {
    $(this).removeClass("hover");
  }
);
}



/*列表滑过*/
function ay_hover(par,cont){

$(par +" "+"li").hover(
  function () {
    $(this).addClass("hover");
  },
  function () {
    $(this).removeClass("hover");
  }
);
}

/*列表滑过*/
function cityhover(par,cont){

$(cont).hover(
  function () {
    $(this).addClass("hover");
  },
  function () {
    $(this).removeClass("hover");
  }
);
$(par).hover(
  function () {
    $(cont).addClass("hover");
  },
  function () {
    $(cont).removeClass("hover");
  }
);
}





