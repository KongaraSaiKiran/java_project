package Wait_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_PageTitle {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		Wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
		System.out.println("Facebook title is verified");
		
		WebElement Forgotpassword = driver.findElement(By.linkText("Forgotten password?"));
		Forgotpassword.click();
		
		try {
			Wait.until(ExpectedConditions.titleContains("Forgotten Password | Can't Log In | Facebook"));
			System.out.println("Forgotpasword title is vefified");
		} catch (Exception e) {
			System.out.println("Forgotpasword title is not vefified");
		}

	}

}
