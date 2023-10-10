package Get_text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropfown_Option_Avilability {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//selecting dropdown option
		new Select(driver.findElement(By.xpath("//select[contains(@id,'customState')]")))
	    .selectByVisibleText("Andhra Pradesh");
		Thread.sleep(4000);
		
		WebElement CityDropdown=driver.findElement(By.xpath("//select[contains(@id,'customCity')]"));
		String citys=CityDropdown.getText();
		
		if (citys.contains("Guntur")) 
		{
		   System.out.println("Testpass, Entering city name");	
		}
		else 
		{
		  System.out.println("Testfail, Entering city name");	
		}
		 
		

	}

	
}
