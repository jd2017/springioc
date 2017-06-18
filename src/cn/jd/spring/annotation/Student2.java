package cn.jd.spring.annotation;
import org.springframework.stereotype.Component;
@Component("student2")
public class Student2 {
	public void save(){
		System.out.println("save Student2");
	}
}
