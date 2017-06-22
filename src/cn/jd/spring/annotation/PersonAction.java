package cn.jd.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.management.DescriptorKey;

import org.springframework.stereotype.Controller;

@Controller(value = "personAction1")
public class PersonAction {
	@Resource(name="personService1")
	private PersonService personService;
	
	@PostConstruct
	public void init(){
		System.out.println("init");
	}
	@PreDestroy
	public void Destroy(){
		System.out.println("destroy");
	}
	public void savePerson(){
		this.personService.savePerson();
	}
	
}
