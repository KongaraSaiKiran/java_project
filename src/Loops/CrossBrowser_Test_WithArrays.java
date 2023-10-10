package Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser_Test_WithArrays 
{
	public static void main(String[] args) 
	{
		String Browsers[] = {"chrome", "firefox", "edge", "safari"};
		WebDriver driver = null;
		
		for (String EachBrowsers : Browsers) 
		{
			if (EachBrowsers.equals("chrome"))
			{
				driver = new ChromeDriver();
			}
			else if (EachBrowsers.equals("firefox"))
			{
				driver = new FirefoxDriver();
			}
			
			driver.get("https://www.instagram.com/");
			driver.manage().window().maximize();
			
			String Footerlinks[][]= 
			{
					{"Meta", "Meta | Social Metaverse Company"},
					{"About", "About Instagram | Capture, Create & Share What You Love"},
					{"Blog", "Instagram Blog | About Instagram"},
					{"Jobs", "Instagram Careers & Jobs | Official Site"},
					{"Help", "Help Center"},
			};
			
			for (int i = 0; i < Footerlinks.length; i++) 
			{
				String[] strings = Footerlinks[i];
				String linkname = strings[0];
				String pagetitle = strings[1];
				driver.findElement(By.linkText(linkname)).click();
				
				if (driver.getTitle().contains(pagetitle))
				{
					System.out.println("Testpass:--> Title Verified");
				}
				else
				{
					System.out.println("Testfail:--> Title Not Verified");
				}
				
				driver.navigate().back();
			}
		}
	}

}
