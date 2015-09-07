package lessonfivetwo;

public class NoteBook extends Computer{
	String uniqueID;
	double height;
	double width;
	double weight;
	public double screenSize(){
		return height*width;
	}
	public boolean equals(NoteBook n){
		if(this.height*this.width*this.weight==n.width*n.height*n.weight){
			return true;
		}
		return false;
	}
	public int hashCode(){
		if(this.uniqueID!=null && this.uniqueID!=""){
		return hashFunction(this.uniqueID,this.uniqueID.length());
		}
		return -1;
	}
	private int hashFunction(String uniqueID,int n){
		if(uniqueID!=null && uniqueID!=""){
		if(n==0){
			return uniqueID.charAt(0);
		}
		return 7+uniqueID.charAt(n-1)+hashFunction(uniqueID,n-1);
		}
		else{
			return -1;
		}
	}
	public NoteBook clone(){
		NoteBook obj=new NoteBook(this.height,this.weight,this.weight,this.getManufacturer(),this.getProcessor(),this.getRamSize(),this.getDiskSize(),this.getProcessorSpeed(),this.getSerialNumber(),this.uniqueID);
		return obj;
	}
	
	public NoteBook(double height,double width,double weight,String manufacturer,
			String processor,int ramSize,int diskSize,	double processorSpeed,int serialNumber,String uniqueID){
		super(manufacturer,processor,ramSize,diskSize, processorSpeed,serialNumber);
		this.height=height;
		this.width=width;
		this.weight=weight;
		this.uniqueID=uniqueID;
	}
}
