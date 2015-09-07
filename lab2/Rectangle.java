package lessonfivefive;

import java.util.Scanner;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public String toString(){
		return shapeName;}
	public double computeArea(){
		return getWidth()*getHeight();
		}
	public double computePerimeter(){
		return 2*(getWidth()+getHeight());
		}
	public void readShapeData(){
		System.out.println("Enter width: \n");
		Scanner in=new Scanner(System.in);
		if(in.hasNext()){
			setWidth(in.nextDouble());
		}
		System.out.println("Enter height: \n");
		in=new Scanner(System.in);
		if(in.hasNext()){
			setHeight(in.nextDouble());
		}
	}
	public void getShapeName(){
		System.out.println(toString());
	}
public Rectangle(String shapeName){
	this.shapeName=shapeName;
}
}
