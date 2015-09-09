package lessonfivetwosix;

public class Computer {
	private String serialNumber;
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;
	//getters 
	
	public String getManufacturer() {
		return manufacturer;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
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
	
	//Override
	public boolean equals(Object c){
		try{
		if(c.equals(null)){return false;}
		if(!((Computer)c instanceof Computer)){return false;}
		}
		catch(Exception e){}
		if(this.getSerialNumber()==((Computer)c).getSerialNumber()&& this.getManufacturer()==((Computer)c).manufacturer){
			return true;
		}
		return false;
	}
	@Override
	public int hashCode(){
		int hash=5;
		return 17*hash*this.serialNumber.hashCode()*this.manufacturer.hashCode();
	}
	
	public double computePower(){
		return getRamSize()*getProcessorSpeed();
	}
	
	public Computer(String manufacturer,String processor,int ramSize,
			int diskSize,double processorSpeed,String serialNumber){
		this.manufacturer=manufacturer;
		this.processor=processor;
		this.ramSize=ramSize;
		this.diskSize=diskSize;
		this.processorSpeed=processorSpeed;
		this.serialNumber=serialNumber;
		
	}
	
}
