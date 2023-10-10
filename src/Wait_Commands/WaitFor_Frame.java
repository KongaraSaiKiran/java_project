package Wait_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Frame {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips");
	    driver.manage().window().maximize();
	    
	    try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
			System.out.println("Expected frame loaded and applied switch to It");
		} catch (Exception e) {
			System.out.println("Expected frame Not loaded");
		}
	    
	    /*WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
	    Email.clear();
	    Email.sendKeys("Darshan@gmail.com");*/
	    		

	}

}
