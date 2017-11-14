package testentity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import com.lhn.tutor.dao.OrderDao;
import com.lhn.tutor.dao.impl.OrderDaoImpl;
import com.lhn.tutor.entity.Order;
import com.lhn.tutor.tool.MyRandom;

public class testOrder {

	@Test
	public void querydetail(){
		OrderDao orderDao=new OrderDaoImpl();
		List<Object> oList=orderDao.querydetail("J0000000001");
		System.out.println(oList.size());
	}
	
	@Test
	public void add(){
		Order order=new Order();
		order.setStatus("未接单");
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		order.setNowdate(sdf.format(new Date()));
		order.setTargetname("张晓华");
		order.setGrade("三年家");
		order.setLearning("学习情绪不高,注意力不集中,小聪明");
		order.setDirection("数学、英语");
		order.setTeachdate("星期六下午一小时或星期日上午一小时");
		order.setTeacher_id("J0000000001");
		order.setUser_id("J0000000005");
		OrderDao orderDao=new OrderDaoImpl();
		Assert.assertEquals(true, orderDao.add(order));
	}
	
	@Test
	public void createNum(){
		 Date d = new Date();  
	     System.out.println(d);  
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	     String dateNowStr = sdf.format(d);  
	     System.out.println("格式化后的日期：" + dateNowStr);  
	}
	
	public String cRandom(int n) { // 产生1个长度为m只含有字母的随机字符串
        char[] chs = new char[n];
        for (int i = 0; i < n; i++) {
            chs[i] = cNumOrCharRandom();
        }
        return new String(chs);
    }
	
	public static char cNumOrCharRandom() { // 产生一个随机数字或字母
        String temp = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        return (char) temp.charAt(iRandom(0, 61));
    }
	
	public static int iRandom(int m, int n) { // 产生一个[m,n)之间的随机整数
        Random random = new Random();
        int small = m > n ? n : m;
        int big = m <= n ? n : m;
        return small + random.nextInt(big - small);
    }
}
