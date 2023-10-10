package Pageobjects;

import org.openqa.selenium.WebDriver;

public class TestCase1 extends TestBase
{
	WebDriver driver;
	HRM_Loginpage login;
	AccountPage account;
	
	public TestCase1(WebDriver driver) 
	{
	    this.driver = driver;
	    login=new HRM_Loginpage(driver);
		account=new AccountPage(driver);
	}
	/*public void TestCase1(WebDriver driver) 
	{
		this.driver=driver;
		login=new HRM_Loginpage(driver);
		account=new AccountPage(driver);
	}*/
	
	String ValidUID="Admin";
	String InvalidPWD="admin345";
	public void VerifyInvalidlogin()
	{
		if(login.VerifyloginPageDisplayed())
		{
			login.userlogin(ValidUID, InvalidPWD);
			if(login.verifyErrorDisplayed())
			{
				System.out.println("Testpass, Error displayed");
			}
			else
				System.out.println("Testfail Error not displayed");
		}
	}
	
	String ValidPWD="admin123";
	public void VerifyValidLogin()
	{
		if(login.VerifyloginPageDisplayed())
		{
			login.userlogin(ValidPWD, InvalidPWD);
			if(login.verifyloginSuccessfull())
			{
				System.out.println("Testpass, login successful");
			}
			else
				System.out.println("Testfail, Login failed");
		}
	}

}
