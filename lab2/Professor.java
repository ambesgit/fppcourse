package lab2;

public class Professor extends Course implements CourseAsInterface{
public int getCourseID(){
	return courseID;
}
public void getEnrolledStudents(){
	for(int i=0;i<numberOfRegisteredStudents;i++){
		System.out.println(enrolledStudents[i]);
	}
	
}
}
