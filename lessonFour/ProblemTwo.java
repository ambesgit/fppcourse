package lessonfour;

public class ProblemTwo {
	public static String checkPalindrome(String str,int index){		
		String temp=str;
		String reversed="";
		if(index==1){
			reversed+=str.charAt(0);			
			return reversed;
		}
		reversed=str.charAt(index-1)+checkPalindrome(str,index-1);
		if(temp.equals(reversed)){
			System.out.println("palindrome");
		}
		
		return reversed;
	}
}