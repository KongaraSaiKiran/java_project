package Wait_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_TextPresentedAt_Location {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.outlook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		try {
			Wait.until(ExpectedConditions.textToBePresentInElementLocated(By
					.xpath("//div[@role='heading'][contains(.,'Sign in')]"), "Sign in"));
			System.out.println("Test present at location");
		} catch (Exception e) {
		    //e.printStackTrace();
			System.out.println("Test not present at location");
		}
	}

}
