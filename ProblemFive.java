package lessonone_two;

public class ProblemFive {
	static int countStringStartWithA=0;
	public static void countCharacters(String [] arg){
		for(String s:arg){
			if(s.charAt(0)=='A'){
				countStringStartWithA++;
			}
			System.out.println(s.length());
			
		}
		System.out.printf("count of string starts with A:%d",countStringStartWithA);
	}
}
