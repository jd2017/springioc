package cn.jd.spring.ioc2di.document;

public class ExcelDocument implements Document {

	@Override
	public void read() {
		System.out.println("read Excel");
	}
	@Override
	public void write() {
		System.out.println("write Excel");
	}
}
