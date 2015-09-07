package lessonfivetwo;

public class Computer {
	private int serialNumber;
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;
	//getters 
	
	public String getManufacturer() {
		return manufacturer;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getProcessor() {
		return processor;
	}
	public int getRamSize() {
		return ramSize;
	}
	public int getDiskSize() {
		return diskSize;
	}
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	//end of getters
	public boolean equals(Computer c){
		if(this.getSerialNumber()==c.getSerialNumber()&& this.getManufacturer()==c.manufacturer){
			return true;
		}
		return false;
	}
	public int hashCode(){
		return (int)getSerialNumber()+
				hashFunction(this.getManufacturer(),this.getManufacturer().length());
	}
	private int hashFunction(String str,int n){
		if(n==0)
			return str.charAt(0);
		return str.charAt(n-1)+hashFunction(str,n-1);
	}
	public double computePower(){
		return getRamSize()*getProcessorSpeed();
	}
	
	public Computer(String manufacturer,String processor,int ramSize,
			int diskSize,double processorSpeed,int serialNumber){
		this.manufacturer=manufacturer;
		this.processor=processor;
		this.ramSize=ramSize;
		this.diskSize=diskSize;
		this.processorSpeed=processorSpeed;
		this.serialNumber=serialNumber;
		
	}
	
}
