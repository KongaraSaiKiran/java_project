package Loops;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForLoop_WebDriver_Example {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		String footerlinks[][]= 
		{
				{"Sign Up","Sign up for Facebook | Facebook"},
				{"Log in","Log in to Facebook"},
				{"Messenger","Messenger"},
				{"Facebook Lite","Facebook Lite APK for Android"},
				{"Video","Facebook video | Facebook"},
				{"Places","Discover great places in every city | Facebook"},
				{"Games","Facebook"},
				
		};
		
		for (int i = 0; i < footerlinks.length; i++) 
		{
			String[] Strings = footerlinks[i];
			String linkname = Strings[0];
			String pagetitle = Strings[1];
			driver.findElement(By.linkText(linkname)).click();
	        
			if (driver.getTitle().contains(pagetitle))
			{
				System.out.println("Test pass:--> Title verified");
			}
			else
			{
				System.out.println("Test fail:--> Title not verified");
			}
			
			driver.navigate().back();
			
		}

	}

}
