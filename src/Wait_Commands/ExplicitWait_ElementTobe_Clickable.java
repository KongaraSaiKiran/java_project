package Wait_Commands;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_ElementTobe_Clickable {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		  //Enable Explicitwait at automation driver
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		  //Wait Until Email Visable at webpage
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("8374770418");
		Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("Admin@123");
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@type,'submit')]"))).click();
        System.out.println("Element is avilable at clickable state");
	}

}
