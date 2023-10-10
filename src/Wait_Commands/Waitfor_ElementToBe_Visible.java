package Wait_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_ElementToBe_Visible {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'username')]")))
			.sendKeys("9876543210");
			System.out.println("Mobile number is visible");
		} catch (Exception e) {
			System.out.println("Mobile number is Not visible");

		}

	}

}
