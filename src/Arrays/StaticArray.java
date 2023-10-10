package Arrays;

public class StaticArray {

	public static void main(String[] args)
	{
		String Name[] = new String[5];
		 Name[0] = "Chrome";
		 Name[1] = "Firefox";
		 Name[2] = "Edge";
		 Name[3] = "Safari";
		 Name[4] ="Opera";
		 
         String ch = Name[0];
         String Ff = Name[1];
         String Op = Name[4];
         System.out.println(ch);
         System.out.println(Ff);
         System.out.println(Op);
         
         //Group of integer value 
         int num[] = new int[4];
         num[0] = 200;
         num[1] = 400;
         num[2] = 600;
         num[3] = 800;
         
         int val=num[3];
         System.out.println(val);
         int Val = num[0];
         System.out.println(Val);
         
         //Different types of value into Array
         Object obj[] = new Object[6];
         obj[0] = "Samsung";
         obj[1] = "128Gb Memory";
         obj[2] = "8Gb Ram";
         obj[3] = "Price 20000.00/-";
         obj[4] = "True";
         
         System.out.println(obj[0]);
         System.out.println(obj[2]);
         
         String mobile = (String) obj[1];
         System.out.println(mobile);
         
         boolean flag = (boolean) obj[1];
 		System.out.println(flag);
         
         
         
	}

}
