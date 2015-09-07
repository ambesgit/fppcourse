package lab2;

public class MainApp {
	public static void main(String [] args){
	Course s=new Student();
	s.registered("stduent1",1);
	s.getEnrolledStudents();
	System.out.println(s.getCourseID());
	s.registered("stduent2",1);
	Course p=new Professor();
	p.registered("professor1", 0);
	p.getEnrolledStudents();
	((Student)s).getInstructorName();
	
	}
}
//