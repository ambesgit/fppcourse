package lessontwelve;

public class ProblemOne {
int[] numer={4,8,16,32,64,128,256,512};
int[] denom={2,0,4,4,0,8};
public void numerBydenom(){
	for(int x=0; x<numer.length;x++){
		try{
			System.out.println(numer[x]/denom[x]);
		}
		catch(ArithmeticException e){
			System.out.println("division by zero will make Math angry: "+numer[x]+"/"+denom[x]);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("the denom array size is:"+denom.length+" "+"wrong access "+"denom["+x+"]");
		}
	}
}
}
