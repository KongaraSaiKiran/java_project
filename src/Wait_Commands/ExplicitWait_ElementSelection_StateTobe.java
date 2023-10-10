package Wait_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_ElementSelection_StateTobe {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		By Male_Radio_buttion = By.xpath("//label[@class='_58mt'][contains(.,'Male')]");
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
		    .until(ExpectedConditions.elementSelectionStateToBe(Male_Radio_buttion, true));
			System.out.println("Male radio buttion is selected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
		    .until(ExpectedConditions.elementSelectionStateToBe(Male_Radio_buttion, false));
			System.out.println("Male radio buttion is not selected");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
