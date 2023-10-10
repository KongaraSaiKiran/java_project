package Get_text;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_text_OrangeHRM {

	public static void main(String[] args) throws Exception 
	{ 
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		Boolean flag=false;
		try {
			WebElement Email=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
			Email.sendKeys("Admin");
			WebElement Password=driver.findElement(By.xpath("//input[contains(@type,'password')]"));
			Password.sendKeys("admin123");
			WebElement Signin=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
			Signin.click();
			WebElement Myinfo=driver.findElement(By.xpath("//span[contains(.,'My Info')]"));
			Myinfo.click();
			WebElement ContactDetails=driver.findElement(By.xpath("//a[contains(.,'Contact Details')]"));
			ContactDetails.click();
			WebElement Mobilenumber=driver.findElement(By.xpath("(//input[contains(@modelmodifiers,'[object Object]')])[2]"));
			Mobilenumber.sendKeys("9845666432");
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (flag) 
		{
			System.out.println("Match");
		}
		else 
		{
			System.out.println("Mismatch");
		}
	}
}
