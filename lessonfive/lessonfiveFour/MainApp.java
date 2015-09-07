package lessonfivefour;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Secretary s=new Secretary();
		Manager m=new Manager();
		System.out.println("Manager's salary for this month");
		Scanner in=new Scanner(System.in);
		System.out.println("enter number of hours for this months:");
		if(in.hasNext()){
			try{
				m.setNumberOfHoursPermonth(in.nextDouble());
				System.out.println(m.calculateSalary());
			}
			catch(Exception e){
				System.out.println("you need to enter numbers");
			}
		}
		System.out.println("Secretary's salary for this month");
		System.out.println("enter number of hours for this months:");
		if(in.hasNext()){			
			s.setNumberOfHoursPermonth(in.nextDouble());
			System.out.println("enter number of years of working with the company:");
			if(in.hasNext()){
			s.setNumberOfyearsOfWorking(in.nextInt());
			}
			System.out.println(s.calculateSalary());
		}
		in.close();
	}

}
