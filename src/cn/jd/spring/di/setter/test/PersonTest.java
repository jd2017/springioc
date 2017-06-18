package cn.jd.spring.di.setter.test;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jd.spring.di.setter.Person;
import cn.jd.spring.di.setter.PersonContrSet;

public class PersonTest {
	@Test
	public void getPersonTest(){
		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.getName());
		List list = (List) person.getLists();
		System.out.println(list.size());
	}
	/**
	 * 构造器赋值
	 */
	@Test
	public void setPersonCon(){
		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonContrSet pcs = (PersonContrSet)context.getBean("personContrSet");
		System.out.println(pcs.getName());
		System.out.println(pcs.getPid());
		pcs.getStudent().save();
	}
}
