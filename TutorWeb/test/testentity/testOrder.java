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
		order.setStatus("δ�ӵ�");
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		order.setNowdate(sdf.format(new Date()));
		order.setTargetname("������");
		order.setGrade("�����");
		order.setLearning("ѧϰ��������,ע����������,С����");
		order.setDirection("��ѧ��Ӣ��");
		order.setTeachdate("����������һСʱ������������һСʱ");
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
	     System.out.println("��ʽ��������ڣ�" + dateNowStr);  
	}
	
	public String cRandom(int n) { // ����1������Ϊmֻ������ĸ������ַ���
        char[] chs = new char[n];
        for (int i = 0; i < n; i++) {
            chs[i] = cNumOrCharRandom();
        }
        return new String(chs);
    }
	
	public static char cNumOrCharRandom() { // ����һ��������ֻ���ĸ
        String temp = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        return (char) temp.charAt(iRandom(0, 61));
    }
	
	public static int iRandom(int m, int n) { // ����һ��[m,n)֮����������
        Random random = new Random();
        int small = m > n ? n : m;
        int big = m <= n ? n : m;
        return small + random.nextInt(big - small);
    }
}
