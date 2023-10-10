package oops_Abstract_method;

public abstract class Shape 
{
	static String name = "MQ";
	
	abstract void draw();  //Abstract method
	
	void corners()         //Default method 
	{
		System.out.println("corners --> 10meters");
	}
	
	  //Static method 
	static void capture()
	{
		System.out.println("captured");
	}
}
