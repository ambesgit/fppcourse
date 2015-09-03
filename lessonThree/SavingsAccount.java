package lessonthree;

public class SavingsAccount {
	public static double annualInterestRate=0.03;
	private double savingsBalance;
	
	public void calculateMonthlyInterest(){
		this.savingsBalance=this.savingsBalance+(annualInterestRate*this.savingsBalance)/12;
	}
	public void modifyInterestRate(double newInterestRate){
		annualInterestRate=newInterestRate;
	}
public SavingsAccount(double intialBalance){
	this.savingsBalance=intialBalance;
}
public static double getAnnualInterestRate() {
	return annualInterestRate;
}
public double getSavingsBalance() {
	return savingsBalance;
}

}
