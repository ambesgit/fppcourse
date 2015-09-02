package lessonone_two;

public class ProblemThree {
	public static String createUserName(String fName, String lName){
		String userName;
		userName=fName.charAt(0)+lName.substring(0,5)+(int)(Math.random()*1000);
		return userName;
	}

}
