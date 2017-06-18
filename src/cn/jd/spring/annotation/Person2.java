package cn.jd.spring.annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import cn.jd.spring.di.setter.Student;
@Component("person2")
public class Person2 {
	//@Autowired//按照类型进行匹配
	//@Qualifier("student2")
	@Resource(name="student2")
    private Student2 student2; //引用类型
	private Long pid;        //基本类型
    
	public Long getPid() {
		return pid;
	}
	public Student2 getStudent2() {
		return student2;
	}
	
}
