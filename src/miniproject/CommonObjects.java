package miniproject;

public interface CommonObjects 
{
	public String loginEmail = "//input[@name='username']";
	public String loginPassword = "//input[@name='password']";
	public String SiginIn = "//button[contains(.,'Login')]";
	public String Dashbord = "//a[contains(.,'Dashboard')]";
	
	public String MyInfo = "//span[contains(.,'My Info')]";
	public String Contact_details = "//a[contains(.,'Contact Details')]";
	public String Home = "(//input[@modelmodifiers='[object Object]'])[1]";
	public String MobileNumber = "//input[contains(@class,'oxd-input oxd-input--focus')]";
}
