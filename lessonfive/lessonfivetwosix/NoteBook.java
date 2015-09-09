package lessonfivetwosix;

public class NoteBook extends Computer implements Cloneable{
	String uniqueID;
	double height;
	double width;
	double weight;
	public double screenSize(){
		return height*width;
	}
	@Override
	public boolean equals(Object n){
		try{
			if(n.equals(null)){return false;}
			if(!((NoteBook)n instanceof NoteBook)){return false;}
			}
			catch(Exception e){}
		
		if(this.height*this.width*this.weight==((NoteBook)n).width*((NoteBook)n).height*((NoteBook)n).weight){
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		int hash=7;//always has to be primitive number to avoid collision , this is size of the table
		
		return 11*hash*uniqueID.hashCode();
		
		
	}
	
	public NoteBook clone()throws CloneNotSupportedException{
		NoteBook obj=new NoteBook(this.height,this.weight,this.weight,this.getManufacturer(),this.getProcessor(),this.getRamSize(),this.getDiskSize(),this.getProcessorSpeed(),this.getSerialNumber(),this.uniqueID);
		return obj;
	}
	
	public NoteBook(double height,double width,double weight,String manufacturer,
			String processor,int ramSize,int diskSize,	double processorSpeed,String serialNumber,String uniqueID){
		super(manufacturer,processor,ramSize,diskSize, processorSpeed,serialNumber);
		this.height=height;
		this.width=width;
		this.weight=weight;
		this.uniqueID=uniqueID;
	}
}
