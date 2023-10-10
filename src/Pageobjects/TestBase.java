package Pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
	WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public void Setupchrome()
	{
		try {
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} catch (Exception e) {
			System.out.println("Browser not opened");
			
		}
	}
	
	public void static_time(long msec) 
	{
		try {
			Thread.sleep(msec);
		} catch (Exception e) {
			
		}
	}
	
	public void closebroser()
	{
		driver.close();
	}

}
