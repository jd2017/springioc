package cn.jd.spring.ioc.creatobject;
/**
 * @author jd
 * @date 2016-12-25下午10:36:12
 * 通过实例工厂来创建对象
 */
public class HelloFactory2 {
	public HelloSpring getInstance(){
		return new HelloSpring();
	}
}
