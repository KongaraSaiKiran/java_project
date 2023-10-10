package oops.Encapsulation;

import java.util.Date;

public class Encapsulation 
{
	private String Name;
	private String Email;
	public String Email_ID = "Admin007";
	
	
	public String getName() 
	{
		return Name;
	}
	
	public void setName(String name) 
	{
		this.Name = name;
		System.out.println(new Date().toString());
	}
	
	public String getEmail() 
	{
		return Email;
	}
	
	public void setEmail(String email) 
	{
		this.Email = email;
	}
	
	
	

}
