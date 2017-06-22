package cn.jd.spring.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service(value="personService1")
public class PersonServiceImpl implements PersonService {
	@Resource(name="personDao1")
	private PersonDao personDao;
	@Override
	public void savePerson() {
		this.personDao.savePerson();
	}

}
