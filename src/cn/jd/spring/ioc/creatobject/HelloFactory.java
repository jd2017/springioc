package cn.jd.spring.ioc.creatobject;
/**
 * @author jd
 * @date 2016-12-25下午10:31:37
 * 静态工厂类
 */
public class HelloFactory {
	public static HelloSpring getInstance(){
		return new HelloSpring();
	}
}
