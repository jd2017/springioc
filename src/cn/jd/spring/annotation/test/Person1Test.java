package cn.jd.spring.annotation.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jd.spring.annotation.Person1;
import cn.jd.spring.annotation.Person2;
import cn.jd.spring.annotation.PersonAction;

public class Person1Test {
	@Test
	public void annotationTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person1 person = (Person1)context.getBean("person1");
		person.getStudent1().save();
	}
	//scan 类扫描
	@Test
	public void annotationTest2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person2 person = (Person2)context.getBean("person2");
		person.getStudent2().save();
	}
	//scan 类扫描
	@Test
	public void personMVCTest3(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonAction person = (PersonAction)context.getBean("personAction1");
		person.savePerson();
	}
}
