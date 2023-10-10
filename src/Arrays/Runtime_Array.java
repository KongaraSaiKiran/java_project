package Arrays;

public class Runtime_Array 
{

	public static void main(String[] args) 
	{
		String name[] = {"chrome","firefox","edge","ie","safari"};
		String ff = name[1];
		String ch = name[0];
		String ed = name[2];
		System.out.println(ff);
		System.out.println(ch);
		System.out.println(ed);
		
		 for (int i = 0; i < name.length; i++) 
		 {
			 System.out.println(name[i]); 
		}
		 
		 int num[] = {200,400,600,800};
		 int val_1= num[1];
		 System.out.println(val_1);
		 int val_2 = num[2];
		 System.out.println(val_2);
		 
		 Object obj[] = {"Samsung","25000.00","true"};
		 String mobile = (String) obj[0];
		 System.out.println(mobile);
		 
		 String mobile_price = (String) obj[1];
		 System.out.println(mobile_price);
		 
		 String True = (String) obj[2];
		 System.out.println(True);

	}

}
