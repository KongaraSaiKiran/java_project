package Pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v114.fedcm.model.Account;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage 
{
	WebDriver driver;
	String Expheader = "Drashboard";
	
	public AccountPage(WebDriver driver)
	{
	this.driver = driver;	
	}
	
	public static By AccountImage = By.xpath("//img[@class='oxd-userdropdown-img']");
	public static By login = By.xpath("//a[contains(.,'Logout')]");
	public static By DrashboardImage = By.xpath("//h6[contains(.,'Dashboard')]");


   public boolean verifyAccontImage()
   {
	   boolean flag = false;
	   try {
	   new WebDriverWait(driver, Duration.ofSeconds(30))
	   .until(ExpectedConditions.visibilityOfElementLocated(AccountImage));
	   flag = true;
	} catch (Exception e) {
		e.printStackTrace();
	}
	return false;
   }
   
   public boolean verifyHeaderPresent()
   {
	   boolean flag = false;
	   try {
		new WebDriverWait(driver, Duration.ofSeconds(30))
		.until(ExpectedConditions.textToBePresentInElementLocated(DrashboardImage, Expheader));
		flag = true;
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return false;
   }
}