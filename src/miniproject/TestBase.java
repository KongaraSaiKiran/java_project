package miniproject;

public class TestBase extends CommonActions implements CommonObjects,CommonInputs
{
	public void ValidLogin()
	{
		if (VerifyPageTitle(INpagetitle)) 
		{
			typetext(loginEmail, UserName);
			typetext(loginPassword, Password);
			ClickonElement(SiginIn);
		}
		else {
			System.out.println("HRM page title not verified");
			Waitforvisible(Dashbord);
			System.out.println("Object visible at webpage");
		}
	}

	
}
