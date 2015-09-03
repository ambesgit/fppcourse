package lessonthree;

public class Billing {	
	public double computeBill(double price){
		if(price>0){
		return 0.08+price;
		}
		else{
			return 0.0;
		}
	}
	public double computeBill(double price,int qauntity){
		if(price>0 && qauntity>0){
		return (qauntity*price)+0.08;
		}
		else{
			return 0.0;
		}
	}
	public double computeBill(double price,int qauntity,double coupon){	
		if((0<coupon && coupon<100) &&(price!=0 &&qauntity!=0)){
		return ((qauntity*price)-(qauntity*price*coupon/100))+0.08;
		}
		else{
			return ((qauntity*price)-0)+0.08;
		}
	}

}
