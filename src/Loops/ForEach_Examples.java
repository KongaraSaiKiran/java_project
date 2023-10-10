package Loops;

public class ForEach_Examples {

	public static void main(String[] args) 
	{
		String browser[] = {"chrome", "firefox", "edge", "safari"};
		for (String eachbrowser : browser)
		{
			System.out.println(eachbrowser);
		}
				
		int values[] = {2000, 4000, 6000, 8000};
		for (int eachvalue : values)
		{
			System.out.println(eachvalue);
		}
		
		
		int num[] = {10, 20, 30, 40, 50, 60};
		for (int i : num) 
		{
		    System.out.println(i);	
		}
		
		String info[][] = 
			{
					{"samsung", "128gb"},
					{"iphone", "64gb"},
					{"oppo", "32gb"}
			};
		for (String[] strings : info)
		{
			System.out.println(strings[0]+"---->"+strings[1]);
		}
	}
	
      
	

 
}