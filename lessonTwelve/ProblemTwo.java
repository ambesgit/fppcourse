package lessontwelve;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProblemTwo {
	ProblemTwo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter any number from 0 to 100:");
		if(sc.hasNext()){
			
			try{
				int x=sc.nextInt();
				if(x<0 || x>100){
					new ProblemTwo();
				};
			}		
			catch(InputMismatchException e){
				System.out.println("only numbers are supported");
				new ProblemTwo();
			}
			
		}
	}
}
