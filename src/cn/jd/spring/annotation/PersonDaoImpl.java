package cn.jd.spring.annotation;

import org.springframework.stereotype.Repository;

@Repository(value="personDao1")
public class PersonDaoImpl implements PersonDao {

	@Override
	public void savePerson() {
		System.out.println("savePerson");
	}

}
