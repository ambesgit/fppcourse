package lessontwelve;

public class MainApp {

	public static void main(String[] args) throws DepositException{
		ProblemOne one=new ProblemOne();
		one.numerBydenom();
		ProblemTwo two=new ProblemTwo();
		CustomerAccount ac=null;
		//initial deposit exception
		try{
			ac=new CustomerAccount("ambes",1004578L,100);			
		
		}
		catch(InitialBalanceException e){
			System.out.println(e.e);
		}
		//deposit exception , any way this is not necessary because the main method can also throw this exception 
		try{
			
			ac.deposit(-200);
		}
		catch(DepositException e){
			System.out.println(e.e);
		}
		catch(NullPointerException e){
			System.out.println("you don't have account with us dud");
		}
		//withdraw exception
		try{
			
			ac.withDraw(200);
		}
		catch(MinBalanceException e){
			System.out.println(e.e);
		}
		catch(NullPointerException e){
			System.out.println("you don't have account with us dud");
		}
	}

}
