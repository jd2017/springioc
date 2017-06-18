package cn.jd.spring.annotation;
//如果注解的属性的名称为value,可写可不写
@ClassInfo(value="注解测试类")
public class AnnotationTest {
	@MethodInfo(name="注解方法")
	public void test(){
	}
}
