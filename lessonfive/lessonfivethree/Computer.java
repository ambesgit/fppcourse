package lessonfivethree;

public abstract class Computer {
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
	//getters 
	public String getManufacturer() {
		return manufacturer;
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
	
	public double computePower(){
		return getRamSize()*getProcessorSpeed();
	}
	public abstract double costProduct();
}
