package lessonthree;

public class LessonThreeApp {

	public static void main(String[] args) {		
		DigitalCamera[] cameras={
								new DigitalCamera("Sony",8),
								new DigitalCamera("Samseng",4),
								new DigitalCamera("Canon",14),
								new DigitalCamera("Casio",6),
								new DigitalCamera("Panasonic",5),
								new DigitalCamera("Olympus",9),
								new DigitalCamera("Alpa",7),
								new DigitalCamera("Leica",6),
								new DigitalCamera("Kodak",10)
								};
		System.out.println("---------11111111111111111111111111--------------");
		for(int i=0; i<cameras.length; i++){
			
			System.out.println(i+"."+cameras[i].cameraDetails());
			
		}
		System.out.println("---------222222222222222222222222222-----------------");
		System.out.println(" "+BMICalculator.calculateBMI('f',157, 5.4));
		Person sd=new Person("ambasager","tetemke",33);
		sd.displayPerson();
		System.out.println("---------33333333333333333333333333333------------------");
		PersonArrayOpe pArray=new PersonArrayOpe(10);
		pArray.insert("ambes", "tetemke", 33);
		pArray.insert("adane", "tetemke", 27);
		pArray.insert("tesfay", "tetemke", 43);
		pArray.insert("ezan", "tesfay", 3);
		pArray.insert("ab","tt",87);
		System.out.println(pArray.size());
		pArray.find("ab").displayPerson();
		pArray.delete("ab");
		System.out.println(pArray.size());
		pArray.displayAll();
		//------------------------------------44444444444444444444-------------------
		Billing bl=new Billing();
		System.out.println(bl.computeBill(0));
		System.out.println(bl.computeBill(2.00,0));
		System.out.println(bl.computeBill(2.00,20,50));
		//--------------------------------5555555555555555555-------------------------
		SavingsAccount saver1=new SavingsAccount(20000.00);
		SavingsAccount saver2=new SavingsAccount(30000.00);
		System.out.println("current balance: $"+saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		System.out.println("updated after monthly interest: $"+saver1.getSavingsBalance());
		System.out.println("current balance"+saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.println("updated after monthly interest: $"+saver2.getSavingsBalance());
		saver1.modifyInterestRate(0.6);
		System.out.println("after interestrate is modified********************************");
		System.out.println("current balance: $"+saver1.getSavingsBalance());
		saver1.calculateMonthlyInterest();
		System.out.println("updated after monthly interest: $"+saver1.getSavingsBalance());
		System.out.println("current balance: $"+saver2.getSavingsBalance());
		saver2.calculateMonthlyInterest();
		System.out.println("updated after monthly interest: $"+saver2.getSavingsBalance());
		
	}

}
