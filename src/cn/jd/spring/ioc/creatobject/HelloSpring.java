package cn.jd.spring.ioc.creatobject;
/**
 * 
 * @author jd
 * @date 2016-12-25下午09:54:28
 * 默认的构造函数创建对象；
 */
public class HelloSpring {
	//默认的构造器
	public HelloSpring(){
		System.out.println("creat Object");
	}
	public void hello(){
		System.out.println("helloSpring");
	}
}
