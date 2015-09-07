package lessonfivefive;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=getShape();
		System.out.println(s.toString());
		s.readShapeData();
		System.out.println(s.computeArea());
		System.out.println(s.computePerimeter());
	}
	public static Shape getShape(){
		String x;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter C for circle\nEnter R for Rectangle\nEnter T for Triangle");
		if(in.hasNext()){
			x=in.next();
			//in.close();
			if(x.toLowerCase().equals("c")){
				return new Circle("circle");
			}
			else if(x.toLowerCase().equals("r")){
				return new Rectangle("Rectangle");
			}
			else if(x.toLowerCase().equals("t")){
				return new RtTriangle("Triangle");
			}
			
		}
		
		return null;
	}

}
