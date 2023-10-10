package oops_Abstract_method;

public class Circle extends Shape
{

	@Override
	void draw() 
	{
		System.out.println("Drawing circle");
	}
	
	public static void main(String[] args) 
	{
		Shape obj = new Circle();
		obj.draw();
		obj.corners();
		
		System.out.println(Shape.name);
		
	}
	

}
