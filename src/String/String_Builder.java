package String;

public class String_Builder {

	public static void main(String[] args) 
	{
		String Firstname = "sai";
		StringBuilder Fullname = new StringBuilder(Firstname).append("").append("kiran");
		System.out.println(Fullname);
		
		//reverse a string using a string builder
		StringBuilder builder= new StringBuilder("Webdriver");
		StringBuilder Reverse=builder.reverse();
		System.out.println("Webdriver in reverese-->" +Reverse);
		
	}

}
