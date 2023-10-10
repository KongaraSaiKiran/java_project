package String;

import org.openqa.selenium.devtools.v114.systeminfo.SystemInfo;

public class String_Methods {

	public static void main(String[] args)
	{
		    //String Equals method
		String Act_Res="Accont Number";
		String Ext_Res="accont number";
		
		boolean flag1=Act_Res.equals(Ext_Res);
		System.out.println("Equal compresion is-->" +flag1);
		
		String actRes="Account Created";
		String extRes="Account Created";
		
		Boolean flag2=actRes.contains(extRes);
		System.out.println("\nEqual compresion is-->" +flag2);
		
		   //String Equal Method
		Boolean flag3=Act_Res.equalsIgnoreCase(Ext_Res);
		System.out.println("\nEqual ignore compresion is-->" +flag3);
		
		    //Contains Method
		String status="Account 10000 Created";
		System.out.println("Compresion 1 is-->" +status.contains("Account"));
		System.out.println("Compresion 2 is-->" +status.contains("Account created"));
		System.out.println("Compresion 2 is-->" +status.contains("ount"));
		
		    //length Method
		String MobileNumber="8374770418";
		int length = MobileNumber.length();
		System.out.println("Mobile number length-->" +MobileNumber.length());
		
		if (length==10) 
		{
			System.out.println("lenght match");
		}
		else
		{
		    System.out.println("lenght mismatch");	
		}
		
		    //Trim Method
		String Pincode="    500070     ";
		System.out.println("trim value is-->" +Pincode.trim());
		System.out.println("Trim pincode lenght is-->" +Pincode.length());
        if (Pincode.length()==15)
        { 
			System.out.println("valide Pincode");
		}
        else
        {
		    System.out.println("Invalide Pincode");	
		}
        
            //Trimming extra space character
        String Newpincode=Pincode.trim();
        System.out.println("After Trim pincode length is-->" +Newpincode.length());
        if (Newpincode.length() == 5) 
        {
			System.out.println("valide pincode");
		}
        else
        {
        	System.out.println("Invalide pincode");
	     }
        
             //Substring Method
        String AccontNumber="2468135792468";
        String lastDigits=AccontNumber.substring(7);
        System.out.println("Last Digits are-->" +lastDigits);
        
        String FirstDigits=AccontNumber.substring(5);
        System.out.println("First Digits are-->" +FirstDigits);
        
        String MiddleDigits=AccontNumber.substring(8);
        System.out.println("Middle Digits are-->" +MiddleDigits);
        
        String ProductPrice="Rs.80000";
        System.out.println(ProductPrice.substring(3));
        
           //isEmpty Method
        String value1="";
        String value2="Hello";
        System.out.println("Value1 empty status-->" +value1.isEmpty());
        System.out.println("Value2 empty status-->" +value2.isEmpty());
        if(!value2.isEmpty())
        {
        	System.out.println("character avilable");
        }
        else
        {
		    System.out.println("character not avilable");	
		}
        
           //Startswith Method
        
        String AccountNumber1="1234567890";
        Boolean flag4=AccountNumber1.startsWith("1234");
        System.out.println("AN stars with-->" +flag4);
        
           //endswith Method
        Boolean flag5=AccountNumber1.endsWith("7890");
        System.out.println("AN starts with-->" +flag4);
        
            //charAt Method
        String Name="SaiKiran";
        char NewName=Name.charAt(0);
        System.out.println("Character avilabe at zero index number-->" +NewName);
        
           //ToLower case Method
        String Toolname="Web Driver";
        System.out.println(Toolname.toLowerCase());
        
           //ToUpper case Mehtod
        System.out.println(Toolname.toUpperCase());
        
           //concat Method
        String firstname="Sai";
        String lastname="Kiran";
        String fullname=firstname.concat(lastname);
        System.out.println(fullname);
          //It works for all dataypes to Concat
		System.out.println(firstname+lastname);
		
		  //replace Method
		String Price="$20,000.0";
		String NewPrice=Price.replace("$", "").replace(",", "").replace(".", "");
		System.out.println(NewPrice);
	
		  //replaceall method
		System.out.println(Price.replaceAll("0", "5"));
		
	//Print only numeric characters with in String using Regular expression
		String str="abcdef9080efghijkl6878hjyldk9865";
		String Numberonly=str.replaceAll("[^0-9]", "");
		String CharactersOnly=str.replaceAll("[^a-z]" , "");
		System.out.println(Numberonly);
		System.out.println(CharactersOnly);
		
		   //Example
		String sent="money 2000 recived";
		String Info=sent.replaceAll("[^0-9]", "");
		System.out.println(Info);

	}

}
