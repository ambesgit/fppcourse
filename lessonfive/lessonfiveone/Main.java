package lessonfiveone;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			DepEmployee []emp={	new Professor("xProfessor",LocalDate.parse("20051101",DateTimeFormatter.BASIC_ISO_DATE),7000),
							new Professor("yProfessor",LocalDate.parse("20110315",DateTimeFormatter.BASIC_ISO_DATE),6000),
							new Professor("zProfessor",LocalDate.parse("20140120",DateTimeFormatter.BASIC_ISO_DATE),5000),
							new Secretary("xSecretary",LocalDate.parse("20050110",DateTimeFormatter.BASIC_ISO_DATE),2000),
							new Secretary("ySecretary",LocalDate.parse("20140110",DateTimeFormatter.BASIC_ISO_DATE),1500)
							};
			//the dot operator works from right to left so cast first then try to access the method
			((Secretary)emp[3]).setOverTimeHours(20.5);//set over time to xSecretary only 
			Scanner in=new Scanner(System.in);			
			System.out.print("Do you want to see the sum of salary?y   ");
			System.out.println();
			
			if(in.hasNext()){				
				if(in.next().toLowerCase().equals("y")){					
					System.out.print("P for Professor's salary sum, S for secretary's salary sum A for all employ's salary sum:   ");
					System.out.println();
					if(in.hasNext()){
						String input=in.next();
						double sum=0;
						if(input.toLowerCase().equals("p")){							
							for(int i=0; i<emp.length;i++){
								if(emp[i] instanceof Professor){
									sum+=emp[i].computeSalary();
								}
							}
							System.out.println("The salary sum of all professors: $"+sum);
							}
						else if(input.toLowerCase().equals("s")){
							for(int i=0; i<emp.length;i++){
								if(emp[i] instanceof Secretary){
									sum+=emp[i].computeSalary();
								}
							}
							System.out.println("The salary sum of all Secretarys: $"+sum);
						}
						else if(input.toLowerCase().equals("a")){
							for(int i=0; i<emp.length;i++){								
									sum+=emp[i].computeSalary();
								}
							System.out.println("The salary sum of all employees: $"+sum);
							}
						
						}
					}
				}
			in.close();
			}
	}
