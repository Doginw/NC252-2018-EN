package LAB_I;

public class Student {
	private String Study;
	private String Name;
	private String ID;
	
	private Subject[] Sub ;
	
	public Student() {
		Sub =  new Subject[10];
	}
	public Student(int num) {
		Sub = new Subject[10];
	}
	

	public String getStudy() {
		return Study;
	}

	public void setStudy(String study) {
		Study = study;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	
	
	
}
