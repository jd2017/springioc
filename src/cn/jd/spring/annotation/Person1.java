package cn.jd.spring.annotation;

import javax.annotation.Resource;

import cn.jd.spring.di.setter.Student;

public class Person1 {
	@Resource
    private Student1 studen; //引用类型
	private Long pid;        //基本类型
    
	public Long getPid() {
		return pid;
	}
	public Student1 getStudent1() {
		return studen;
	}
	
}
