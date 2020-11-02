abstract class Shape{
	protected int a;
	protected int b;
	public Shape(int a,int b){
		this.a=a;
		this.b=b;
	}
	public abstract void printArea();
}
class Rectangle extends Shape{
	public Rectangle(int a,int b){
		super(a,b);
	}
	@Override
	public void printArea(){
		System.out.println("area of rectangle is: "+(a*b));
	}
}
class Triangle extends Shape{
	public Triangle(int a,int b){
		super(a,b);
	}
	@Override
	public void printArea(){
		System.out.println("area of Triangle is: "+(0.5*a*b));
	}
}
class Circle extends Shape{
	public Circle(int a,int b){
		super(a,b);
	}
	@Override
	public void printArea(){
		System.out.println("area of circle with radius a is: "+(3.14*a*a)+" and area of circle with radius b is: "+(3.14*b*b));
	}
}
public class Experiment11{
	public static void main(String args[]){
		Rectangle R=new Rectangle(10,20);
		Triangle T=new Triangle(2,4);
		Circle C=new Circle(1,2);
		R.printArea();
		T.printArea();
		C.printArea();
	}
}