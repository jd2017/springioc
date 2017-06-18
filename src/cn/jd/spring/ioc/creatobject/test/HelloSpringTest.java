package cn.jd.spring.ioc.creatobject.test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Vector;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jd.spring.ioc.creatobject.HelloSpring;
import cn.jd.spring.ioc.creatobject.InitDestoryHello;

public class HelloSpringTest {
	/**
	 * 利用默认的构造器产生对象；
	 */
	@Test
	public void test(){
		ApplicationContext ctx=  new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring hs= (HelloSpring)ctx.getBean("p");
		hs.hello();
	}
	/**
	 * 通过静态工厂创建对象
	 */
	@Test
	public void test2(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring hs = (HelloSpring)ctx.getBean("hello2");
		hs.hello();
	}
	/**
	 * 通过实例工厂创建对象
	 */
	@Test
	public void test3(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring hs = (HelloSpring)ctx.getBean("hello3");
		hs.hello();
	}
	/**
	 * 默认情况下对象是单例的，配置prototype时，变成多例；
	 */
	@Test
	public void deafault_scope(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring hs = (HelloSpring)ctx.getBean("hello");
		HelloSpring hs1 = (HelloSpring)ctx.getBean("hello");
		System.out.println(hs);
		System.out.println(hs1);
	}
	/**
	 * init destory 对象的生命周期；
	 */
	@Test
	public void initDestoryTest(){
		ApplicationContext content = new ClassPathXmlApplicationContext("applicationContext.xml");
		InitDestoryHello hello = (InitDestoryHello) content.getBean("init_destory");
		hello.hello();
		ClassPathXmlApplicationContext application = (ClassPathXmlApplicationContext)content;
		application.close();
	}
}