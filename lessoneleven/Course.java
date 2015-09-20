package lessoneleven;

import java.util.Arrays;

public class Course {
	private String cName;
	private String[] courseTeachBy;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String[] getCourseTeachBy() {
		return courseTeachBy;
	}
	public void setCourseTeachBy(String[] courseTeachBy) {
		this.courseTeachBy = courseTeachBy;
	}
	public Course(String cName,String[] courseTeachBy){
		this.cName=cName;
		this.courseTeachBy=courseTeachBy;
	}
	@Override
	public String toString() {
		return "Course [cName=" + cName + ", courseTeachBy=" + Arrays.toString(courseTeachBy) + "]";
	}
	
}
