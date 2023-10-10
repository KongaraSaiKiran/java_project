package Ui_ValidationCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Or_Disabled {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement Signup = driver.findElement(By.xpath("(//div[contains(@class,'x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1')])[2]"));
		//Signup.click();
		if (Signup.isEnabled())
		{
		   System.out.println("Testpass, Button is displayed before entry of name and email");	
		}
		else 
		{
			System.out.println("Testfail, Button is displayed before entry of name and email");
		}
	}

}
