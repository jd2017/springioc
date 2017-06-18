package cn.jd.spring.di.setter;

public class PersonContrSet {
	private Long pid;        //基本类型
	private String name;     //基本类型
	private Student student;
	public PersonContrSet(){
	}
	public PersonContrSet(Long pid){
		this.pid =pid;
	}
	public PersonContrSet(Long pid, String name){
		this.name = name;
	}
	public PersonContrSet(String name, Student student){
		this.name = name;
		this.student = student;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
