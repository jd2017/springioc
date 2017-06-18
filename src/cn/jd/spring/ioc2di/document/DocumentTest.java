package cn.jd.spring.ioc2di.document;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DocumentTest {
	@Test
	public void noSpring(){
		Document doc =new ExcelDocument();
		DocumentManager docM = new DocumentManager(doc);
		docM.read();
		doc.write();
	}
	@Test
	public void springTest(){
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		DocumentManager docM =(DocumentManager) context.getBean("documentManager");
		docM.read();
		docM.write();
	}
	@Test
	public void mvcTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonAction person = (PersonAction) context.getBean("personAction");
		person.savePerson();
	}
}
