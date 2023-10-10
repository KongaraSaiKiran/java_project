package Get_Attribute_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Run_Time_ptoperties {

	public static void main(String[] args) throws Exception 
	{
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement roundtrip= driver.findElement(By.xpath("//li[@data-cy='roundTrip'][contains(.,'Round Trip')]"));
		roundtrip.click();
		
		if(roundtrip.getAttribute("class").contains("selected"))
		{
			System.out.println("selected");	
			WebElement doubleseatelement=driver.findElement(By.xpath("//li[contains(.,'Double Seat  FaresFly Safer with Double SeatDouble Seat service is available only for domestic one-way economy flights. You can continue to book at the regular fare or change your search parameter(s) to avail of this service.')]"));
		    if(doubleseatelement.getAttribute("class").contains("disabled"));{
		    System.out.println("Is disabled");
		    }
		    //else {
		    //System.out.println("Is Enabled");
		    //}
		    WebElement flight=driver.findElement(By.xpath("(//span[contains(.,'Flights')])[5]"));
		    if (flight.getAttribute("class").contains("active latoBlack")) 
		    {
			System.out.println("Flight Selected");	
			}
		    else 
		    {
			System.out.println("Flight not selected");	
			}
		}
		else
		{
			System.out.println("not selected");
		}

	}

}
