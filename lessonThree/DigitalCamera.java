package lessonthree;

public class DigitalCamera {
	private String barnd;
	private int resolution;
	private double price;
	public DigitalCamera(String brand, int resolution){
		if(resolution>10){
			this.resolution=10;
		}
		else if(resolution>0 && resolution<=10){
			this.resolution=resolution;
			}		
		this.barnd=brand;
	}
	public double getPrice() {
		setPrice();
		return price;
	}
	private void setPrice() {
		if(this.resolution<=6){
			this.price = 99;
		}
		else{
			this.price =129;
		}
	}
	private String getBarnd() {
		return barnd;
	}
	
	private int getResolution() {
		return resolution;
	}
	
	public String cameraDetails(){
		return "    Camera brand: "+getBarnd()+"\n"+"    megapixel: "+getResolution()+"\n"+"    price of camera: "+getPrice();
	}

}
