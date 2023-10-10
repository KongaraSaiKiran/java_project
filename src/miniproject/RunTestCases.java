package miniproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RunTestCases extends TestBase
{
	public RunTestCases() 
	{
	   setupchrome();
	   ValidLogin();
	}

	@Test
	public void ChangeInfo_contactNo()
	{
		ClickonElement(MyInfo);
		ClickonElement(Contact_details);
		//sendkeystoTextbox(Home, home);
		//Cleartext(Home);
		//typetext(Home, home);
		//Cleartext(MobileNumber);
		//typetext(MobileNumber, mobileNo);
		sendkeystoTextbox(MobileNumber, mobileNo);
	}

}
