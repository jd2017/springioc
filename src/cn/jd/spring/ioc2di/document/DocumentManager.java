package cn.jd.spring.ioc2di.document;

public class DocumentManager {
	public Document document;

	public DocumentManager() {
	}
	public DocumentManager(Document doc) {
		this.document = doc;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	
	public void read(){
		this.document.read();
	}
	public void write(){
		this.document.write();
	}
}
