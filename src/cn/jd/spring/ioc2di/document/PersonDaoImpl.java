package cn.jd.spring.ioc2di.document;

public class PersonDaoImpl implements PersonDao {

	@Override
	public void savePerson() {
		System.out.println("savePerson");
	}

}
