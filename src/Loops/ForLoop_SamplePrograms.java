package Loops;

import com.google.common.collect.ImmutableBiMap.Builder;

public class ForLoop_SamplePrograms {

	public static void main(String[] args) 
	{
		int sum = 0;
		for (int i = 1; i <=40; i++)
		{
			sum = sum+i;
		}
		System.out.println("total value is :--->" +sum);
		
		String name = "Saikiran";
		
		char ch[] = name .toCharArray();
		System.out.println(ch.length);
		
		String str="";
		for (int i = ch.length-1; i >= 0; i--) 
		{
		   str = str+ch[i];	
		}
		System.out.println(str);
		
		StringBuilder builder = new StringBuilder("kiran");
		String rname = builder.reverse().toString();
		System.out.println(rname);
         
		String browser[]= {"Chrome","firefox","edge","safari"};
		for (int i = 0; i < browser.length; i++) 
		{
			String browsrname = browser[i];
			if (browsrname.equals("Chrome")) 
			{
				System.out.println(browsrname);
				break;
			}
			else 
			{
				System.out.println("Browser name not printed");
			}
			
		}
		
	}

}
