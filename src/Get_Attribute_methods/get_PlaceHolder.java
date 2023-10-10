package Get_Attribute_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class get_PlaceHolder {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement Email=driver.findElement(By.id("email"));
		String email_placeholderText=Email.getAttribute("placeholder");
		if (email_placeholderText.equals("Email address or phone number")) 
	    {
		 	System.out.println("Palceholder text present for email");
		}
		else {
			System.out.println("Palceholder text not present for email");
		}

		
		
		

	}

}
