package lessonfivefive;

import java.util.Scanner;

public class RtTriangle extends Shape{
	private double base;
	private double height;	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
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
		return (getBase()*getHeight())/2;
		}
	public double computePerimeter(){
		return getBase()+getHeight()+(Math.sqrt(Math.pow(getBase(),2)+Math.pow(getHeight(),2)));
		}
	public void readShapeData(){
		System.out.println("Enter base: \n");
		Scanner in=new Scanner(System.in);
		if(in.hasNext()){
			setBase(in.nextDouble());
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
	public RtTriangle(String shapeName){
		this.shapeName=shapeName;
	}
}
