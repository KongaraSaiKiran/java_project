package Wait_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Attribute {

	public static void main(String[] args)  
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		
		    //Refresh page once
		driver.navigate().refresh();
		
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try {
			Wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("notification-frame-b8a69227"))
			.findElement(By.xpath("//a[@class='close']")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		WebElement Roundtrip = driver.findElement(By.xpath("//li[@data-cy='roundTrip'][contains(.,'Round Trip')]"));
		Roundtrip.click();
		
		try 
		{
		  By Doubleseat_Fares = By.xpath("//li[contains(@class,'font12 blackText wrapFilter  isItemDisabled')]");	
		  Wait.until(ExpectedConditions.attributeContains(Doubleseat_Fares, "class", "isItemDisabled"));
		  System.out.println("Double seat fares object disable");
		} catch (Exception e) {
		  e.printStackTrace();
		
			
		}

	}

}
