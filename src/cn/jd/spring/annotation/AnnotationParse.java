package cn.jd.spring.annotation;

import java.lang.reflect.Method;

import org.junit.Test;

public class AnnotationParse {
	public static void parse(){
		Class clazz = AnnotationTest.class;
		//判断该类上面是否存在ClassInfo注解
		if(clazz.isAnnotationPresent(ClassInfo.class)){
			ClassInfo classInfo =(ClassInfo) clazz.getAnnotation(ClassInfo.class);
			System.out.println(classInfo.value());
		}
		Method[] methods =clazz.getMethods();
		for(Method method:methods){
			if(method.isAnnotationPresent(MethodInfo.class)){
				MethodInfo methodInfo =method.getAnnotation(MethodInfo.class); 
				System.out.println(methodInfo.name());
			}
		}
	}
	@Test
	public void test(){
		AnnotationParse.parse();
	}
}
