package Library;

import org.openqa.selenium.WebDriver;

public class RunMainTest {

	public static void main(String[] args) 
	{
		CommonActions action = new CommonActions();
		action.setupchrome();
		
		//Get BrowserControl From Repository class to current Class
		WebDriver driver;
		driver = action.getDriver();
		
		if (driver!=null) 
		{
		  System.out.println(driver.getTitle());	
		}
		
		String ExpTitle = "Facebook";
		if (action.VerifyPageTitle(ExpTitle))
		{
		   System.out.println("Title verified");
		   action.typetext("//input[contains(@id,'email')]", "admin");
		   action.typetext("//input[contains(@id,'pass')]", "hello");
		   action.ClickonElement("//button[contains(.,'Log in')]");
		   System.out.println("Email Entred");
		   System.out.println("Password Entred");
		   System.out.println("Clicked on Login");
		}
		else {
			System.out.println("Title Not verified");
			System.out.println("Email Not Entred");
			System.out.println("Password Not Entred");
			System.out.println("Not Clicked on Login");
			
		}
		
		
	}

}
