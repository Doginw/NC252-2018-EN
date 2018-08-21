package LAB_I;

public class Subject {	
	private String Course_Code;
	private String Course_Title;
	private double Course_Unit;
	private String Course_Grade;
	
	public Subject(){}
	
	public Subject(String Code,String Title,double Unit,String Grade){
		Course_Code = Code;
		Course_Title = Title ;
		Course_Unit = Unit;
		Course_Grade= Grade;
	}

	public String getCourse_Code() {
		return Course_Code;
	}

	public void setCourse_Code(String course_Code) {
		Course_Code = course_Code;
	}

	public String getCourse_Title() {
		return Course_Title;
	}

	public void setCourse_Title(String course_Title) {
		Course_Title = course_Title;
	}

	public double getCourse_Unit() {
		return Course_Unit;
	}

	public void setCourse_Unit(double course_Unit) {
		Course_Unit = course_Unit;
	}

	public String getCourse_Grade() {
		return Course_Grade;
	}

	public void setCourse_Grade(String course_Grade) {
		Course_Grade = course_Grade;
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

