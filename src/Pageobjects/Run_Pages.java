package Pageobjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Run_Pages extends TestBase
{
	WebDriver driver;
	
	@Test
	public void test() 
	{
		Setupchrome();
		TestCase1 Tests = new TestCase1(driver);
		Tests.VerifyInvalidlogin();
		//Tests.VerifyValidLogin();
		
	}

}
