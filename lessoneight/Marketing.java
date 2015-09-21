package lessoneight;

public class Marketing {
	private String employeeName;
	private String productName;
	private double salesAmount;
	Marketing(String employeeName,	String productName,	double salesAmount){
		this.employeeName=employeeName;
		this.productName=productName;
		this.salesAmount=salesAmount;
	}
	//overriding the toString method to display the arrayList contents
	public String toString(){
	
			return "."+this.employeeName+", "+this.productName+" ,"+this.salesAmount+" \n";
		
		
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getSalesAmount() {
		return salesAmount;
	}
	
}
