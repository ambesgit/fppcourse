package lessonfour;

public class LessonFourApp {

	public static void main(String[] args) {
		System.out.println("--------------------------------222222222222222------------------");
		String palindrome="madam";
		ProblemTwo.checkPalindrome(palindrome,palindrome.length());
		System.out.println("-----------------------3333333333333333333--------------------");
		double [] search={1,2,3,4,5,6,7,8,8};
		ProblemThree.binarySearch(search, 8, search.length/2);
		System.out.println("-----------------------44444444444444444444--------------------");
		System.out.println(ProblemFour.sumMembers(new double[]{1.0, 2.0,3,4,5,6,7},0));
		String s="ambes";
		String s1="ambes";
		System.out.println(8.1/0);
		System.out.println(ProblemOne.linearSort("def", "bcdeft", 0, 0));
	}

}
