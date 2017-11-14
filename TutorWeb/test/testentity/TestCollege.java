package testentity;

import junit.framework.Assert;

import org.junit.Test;

import com.lhn.tutor.dao.CollegeDao;
import com.lhn.tutor.dao.impl.CollegeDaoImpl;
import com.lhn.tutor.entity.College;

public class TestCollege {

	@Test
	public void testdd(){
		College college=new College();
		college.setId("J0000000001");
		college.setCity("¡˙—“");
		college.setSchool("¡˙—“—ß‘∫");
		college.setMajor("…˘¿÷");
		college.setYear("2014");
		college.setYears("4");
		college.setIsschool("true");
		CollegeDao collegeDao=new CollegeDaoImpl();
		Assert.assertEquals(true, collegeDao.addCollege(college));
	}
}
