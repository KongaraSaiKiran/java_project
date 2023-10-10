package Wait_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Alert {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement Alert_Box = driver.findElement(By.xpath("//button[contains(.,'click the button to display an  alert box:')]"));
		Alert_Box.click();
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.alertIsPresent()).accept();
			System.out.println("Alert Present");
			} catch (Exception e) {
			System.out.println("Alert not Present");
		}

	}

}
