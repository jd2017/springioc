package cn.jd.spring.ioc.creatobject;

public class InitDestoryHello {
	public InitDestoryHello(){
		System.out.println("initDestoryHello");
	}
	public void init(){
		System.out.println("init");
	}
	public void destory(){
		System.out.println("destory");
	}
	public void hello(){
		System.out.println("hello");
	}
}
