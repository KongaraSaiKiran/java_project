package Library;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class JUnit extends CommonActions
{
     
	@Test
	public void test() 
	{
		setupchrome();
		System.out.println(driver.getTitle());
		typetext(CommonObjects.email, "Admin");
		sendkeystoTextbox(CommonObjects.password, "admin@123");
		
		
	}

}
