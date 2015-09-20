package lessonnine;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//using queue to check if a given string is Palindrome
public class ProblemThree {
	Queue<Character> queue=new LinkedList<Character>();	
	Stack<Character> stack=new Stack<Character>();
	//this method extracts the characters from the input string and returns boolean to check the input is the right type 
	private boolean getCharacter(String s){
		if(s!=" "|| s!=null){		
				
			if(s.length()==1){
				queue.add(s.charAt(0));
				stack.push(s.charAt(0));
				return true;
			}
			else{
				queue.add(s.charAt(0));
				stack.push(s.charAt(0));
				getCharacter(s.substring(1));
				return true;
			}
			
			}
		else{
			return false;
		}
	}
	public boolean isPalindrome(String s){
		
		if(this.getCharacter(s)){
			while(this.queue.size()>0){
				if(this.queue.poll()!=this.stack.pop()){
					return false;
				}
			
			}
			return true;
		}
		else{
			return false;
		}
	}
}
