package lab2;

public abstract class Course {
	int courseID=987654321;	
	static int numberOfRegisteredStudents;
	static String nameOfInstructor;
	static String enrolledStudents[]=new String[40];	
	public abstract int getCourseID();//comment out this 
	public abstract void getEnrolledStudents();//comment out this
	//implemented method
	public void registered(String name,int flag){
		//1 for student  0 for professor
		if(flag==1 &&numberOfRegisteredStudents<40){
		enrolledStudents[numberOfRegisteredStudents]=name;
		numberOfRegisteredStudents++;
		}
		else if(flag==0){
			nameOfInstructor=name;
		}
		
		
	}
}
