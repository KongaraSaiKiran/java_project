package Wait_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Long Starttime = System.currentTimeMillis();
		
		try {
			driver.findElement(By.id("email"));
			System.out.println("Object is found");
			System.out.println(System.currentTimeMillis()-Starttime);
		} catch (Exception e) {
			System.out.println("Object is not found");
			System.out.println(System.currentTimeMillis()-Starttime);
		}
			try {
				driver.findElement(By.id("pass@0000"));
				System.out.println("Password is found");
				System.out.println(System.currentTimeMillis()-Starttime);
			} catch (Exception e) {
				System.out.println("Password is not found");
				System.out.println(System.currentTimeMillis()-Starttime);	
			
			//Page Load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
		
		   //Script load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		
		}

	}

}
