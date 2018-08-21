package LAB_I.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import LAB_I.Subject;

public class SubjectTest {

	@Test
	public void testCourse_Codes() {
		Subject s = new Subject();
		String Course_Codes = "NC";
		
		s.setCourse_Code(Course_Codes);
		assertEquals("NC",s.getCourse_Code());
	}

	@Test
	public void testCourse_Name() {
		Subject s = new Subject();
		String Course_Title = "NC";
		
		s.setCourse_Code(Course_Title);
		assertEquals("NC",s.getCourse_Title());
	}
}
