package com.lhn.tutor.entityTest;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.Test;

public class Test1 {

	@Test
	public void testCreateTable(){
		Configuration configuration=new Configuration().configure();
		SchemaExport schemaExport=new SchemaExport(configuration);
		schemaExport.create(true, true);
	}
}

