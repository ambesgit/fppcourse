package lessonfivefive;

import java.util.Scanner;

public class Circle extends Shape{
	private double radius;	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String toString(){
		return shapeName;}
	public double computeArea(){
		return Math.PI*Math.pow(getRadius(),2);
		}
	public double computePerimeter(){
		return 2*(Math.PI*getRadius());
		}
	public void readShapeData(){
		System.out.println("Enter radius: \n");
		Scanner in=new Scanner(System.in);
		if(in.hasNext()){
			setRadius(in.nextDouble());
		}
		
	}
	public void getShapeName(){
		System.out.println(toString());
	}
public Circle(String shapeName){
	this.shapeName=shapeName;
}
	
}
