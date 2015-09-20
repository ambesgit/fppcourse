package lessontwelve;

public class CustomerAccount {
	private String cus_name;
	private long acc_number;
	private double balance;
	
	public boolean deposit(double amount)throws DepositException{
		if(amount<0){
			throw new DepositException();
			
		}
		this.balance+=amount;
		return true;
	}
	public boolean withDraw(double amount)throws MinBalanceException{
		if(balance-amount<100){
			throw new MinBalanceException();
		}
		balance=balance-amount;
		return true;
	}
	CustomerAccount(String name,long accNumber,double initialBalance)throws InitialBalanceException{
		this.cus_name=name;
		this.acc_number=accNumber;
		if(initialBalance<100){
			throw new InitialBalanceException();
		}
		this.balance=initialBalance;
	}
}
class DepositException extends Exception{
	String e;
	DepositException(){
		e="deposit amount shold be positive";
	}
}
class MinBalanceException extends Exception{
	String e;
	MinBalanceException(){
		e="minimum balance after withdraw must be 100 dollars";
	}
}
class InitialBalanceException extends Exception{
	String e;
	InitialBalanceException(){
		e="minimum initial deposit must be 100 dollars";
	}
}