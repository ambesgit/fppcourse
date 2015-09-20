package lessonnine;

import java.util.ArrayList;
import java.util.Iterator;

public class MainApp {

	public static void main(String[] args) {
		PriorityQueue q=new PriorityQueue();
		System.out.println(q.isEmpty());
		System.out.println("--------------------Problem 111111111-----------");
		System.out.println("order of insertion:[apple, orange, banana, pinable,lemmon]");
		q.insert("apple");
		q.insert("orange");
		q.insert("banana");
		q.insert("pinable");
		q.insert("lemmon");				
		
		System.out.println("after inserted in to preriouty queue----:");		
		System.out.println(q.displayAll());
		System.out.println("Size of elements in preriouty queue:");
		System.out.println(q.size());
		System.out.println("is queue is empty or not:");
		System.out.println(q.isEmpty());
		System.out.println("peek the first element in the queue:");
		System.out.println(q.peek());
		System.out.println("check size after the queue:");
		System.out.println(q.size());
		System.out.println("remove the first element from the queue:");
		q.remove();
		System.out.println("check size after remove:");
		System.out.println("---------------------Problem 22222222222--------------");
		ProblemTwo tw=new ProblemTwo();	
		System.out.println("reverse the order of the input number:123456");
		System.out.println(tw.reverseNumber(123456));
		ProblemThree p=new ProblemThree();
		System.out.println("--------------------Problem 3333333--------------");
		System.out.println("is this palindrome:smadams");
		System.out.println(p.isPalindrome("smadams"));
		System.out.println("is this palindrome:smadam");
		System.out.println(p.isPalindrome("smadam"));
		

}
}
