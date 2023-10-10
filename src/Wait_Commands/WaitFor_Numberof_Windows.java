package Wait_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Numberof_Windows {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		WebElement Instagram_Link = driver.findElement(By.linkText("Instagram"));
		Instagram_Link.click();
		
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		try {
			Wait.until(ExpectedConditions.numberOfWindowsToBe(2));
			System.out.println("Secondwindow is opened");
		} catch (Exception e) {
			System.out.println("Secondwindow is not opened");
		}

	}

}
