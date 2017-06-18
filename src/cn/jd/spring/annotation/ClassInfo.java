package cn.jd.spring.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//标记在类或者接口上
@Target(ElementType.TYPE)
//在java,class,runtime中都可以使用
@Retention(RetentionPolicy.RUNTIME) 
//该注解可出现帮助文档上
@Documented 
public @interface ClassInfo {
	//给该注解声明了一个属性为value,并且默认值为""
	String value() default "";
}
