package testentity;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Assert;
import org.junit.Test;

import com.lhn.tutor.dao.UserDao;
import com.lhn.tutor.dao.impl.UserDaoImpl;
import com.lhn.tutor.entity.User;
import com.lhn.tutor.tool.MyHibernateSessionFactory;

public class TestUser {

	@Test
	public void testCreateTable() {
		Configuration configuration = new Configuration().configure();
		SchemaExport schemaExport = new SchemaExport(configuration);
		schemaExport.create(true, true);
	}
/*
	@Test
	public void testquerybyMajor() {
		TeacherDao teacherdao = new TeacherDaoImpl();
		List<Teacher> list = teacherdao.querybyTeach("数学");
		for (Teacher teacher : list) {
			System.out.println(teacher);
		}
	}
*/
	@Test
	public void testadd() {
		User user=new User();
		user.setUsername("李四");
		user.setPassword("123456");
		UserDao userDao=new UserDaoImpl();
		Assert.assertEquals(true, userDao.save(user));
	}
	
	@Test
	public void testsave(){
		Session session=MyHibernateSessionFactory.getSessionFactory().getCurrentSession();
		Transaction transaction=session.beginTransaction();
		User user=new User();
		user.setUsername("lisi");
		user.setPassword("123456");
        session.save(user);
        transaction.commit();
	}
}
