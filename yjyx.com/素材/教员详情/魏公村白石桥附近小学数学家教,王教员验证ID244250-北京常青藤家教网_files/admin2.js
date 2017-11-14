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







//页签切换
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


