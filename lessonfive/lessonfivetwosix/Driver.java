package lessonfivetwo;

public class Driver {

	public static void main(String[] args) {
		//(String manufacturer,String processor,int ramSize,int diskSize,	double processorSpeed)
		NoteBook n=new NoteBook(7,15,5,"Dell","intel",4,500,2.1,1234567,"abcdefxwei");
		System.out.println(n.computePower());
		System.out.println(n.screenSize());
		System.out.println(n.hashCode());
		System.out.println(n.equals(n));
		NoteBook m=n.clone();
		System.out.println(m.computePower());

	}

}
