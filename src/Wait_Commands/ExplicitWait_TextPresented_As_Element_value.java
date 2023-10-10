package Wait_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_TextPresented_As_Element_value {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
		driver.findElement(By.id("i0116")).clear();
		driver.findElement(By.id("i0116")).sendKeys("9876543210");
		
		
		 
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.textToBePresentInElementValue(By.id("i0116"), "9876543210"));
			System.out.println("Input present at editbox");
		} catch (Exception e) {
			System.out.println("Input not present at editbox");
		}

	}

}
