package testentity;

import java.util.List;

import org.junit.Test;

import com.lhn.tutor.dao.TaughtDao;
import com.lhn.tutor.dao.impl.TaughtDaoImpl;
import com.lhn.tutor.entity.Taught;

public class TestTaught {

	@Test
	public void testquerybyid(){
		TaughtDaoImpl teacherDao=new TaughtDaoImpl();
		List<Object> olist=teacherDao.querybyid("J0000000009");
//		System.out.println(olist.size());
		for (int i = 0; i < olist.size(); i++) {
			Object[] obj =(Object[])olist.get(i);
            String id = String.valueOf(obj[0]);
            String name = String.valueOf(obj[1]);
            String profile = String.valueOf(obj[2]);
            String price = String.valueOf(obj[3]);
            String imgpath = String.valueOf(obj[4]);
            obj[5]="I love U";
            String tel=String.valueOf(obj[5]);
            //System.out.println(id+"--"+name+"--"+profile+"--"+price+"--"+imgpath+"--"+obj[7]);
		}
	}
	
	@Test
	public void testquerybyoth(){
		TaughtDao teacherDao=new TaughtDaoImpl();
		List<Object> list=teacherDao.querybyoth();
		System.out.println(list.size());
	}
	
	@Test
	public void testqueryfirsthometeachershow(){
		TaughtDaoImpl teacherDaoImpl=new TaughtDaoImpl();
		List<Object> list=teacherDaoImpl.querybysub("»¯Ñ§");
		System.out.println(list.size());
	}
	
	@Test
	public void age(){
		String birthday="1995-11";
		int age=Integer.parseInt(birthday.substring(0, 4));
		System.out.println(2017-age);
	}
}
