package Pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HRM_Loginpage
{
	WebDriver driver;
	
	public HRM_Loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public static By username = By.xpath("//input[@name='username']");
	public static By password = By.xpath("//input[@name='password']");
	public static By login = By.xpath("//button[contains(.,'Login')]");
	public static By forget_password = By.xpath("//p[contains(.,'Forgot your password?')]");
	public static By Invalid_credentials = By.xpath("//p[contains(.,'Invalid credentials')]");
	public static By header = By.xpath("//h5[contains(.,'Login')]");
	
	public void userlogin(String username, String password)
	{
		driver.findElement(HRM_Loginpage.username).sendKeys("Admin");
		driver.findElement(HRM_Loginpage.password).sendKeys("admin123");
		driver.findElement(login).click();	
	}
	
	public Boolean VerifyloginPageDisplayed()
	{
		Boolean flag = false;
		try {
			new WebDriverWait(driver,Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(username));
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean verifyErrorDisplayed()
	{
		boolean flag = false;
		try {
			new WebDriverWait(driver,Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOfElementLocated(Invalid_credentials));
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean verifyloginSuccessfull()
	{
		boolean flag = false;
		try {
			new WebDriverWait(driver,Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOfElementLocated(Invalid_credentials));
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public String Read_username()
	{
		return driver.findElement(username).getAttribute("value");
	}
	
}
