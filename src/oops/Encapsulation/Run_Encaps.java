package oops.Encapsulation;

public class Run_Encaps {

	public static void main(String[] args) 
	{
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.Email_ID);
		
		String newID = obj.Email_ID = "admin007";
		System.out.println(newID);
        
		obj.setName("sai");
		String MyName = obj.getName();
		System.out.println(MyName);
		
		obj.setEmail("sai@gmail.com");
		//String Myemail = obj.getEmail();
		System.out.println(obj.getEmail());
	}

}
