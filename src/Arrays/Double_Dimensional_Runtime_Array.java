package Arrays;

public class Double_Dimensional_Runtime_Array
{

	public static void main(String[] args) 
	{
		String info[][] = 
		{
				{"Samsung", "128"},
				{"Iphone", "64"},
				{"Vivo", "32"}
		};
		
		String Mobile1 = info[0][0];
		System.out.println(Mobile1);
		
		String mobile1 = info[0][1];
		System.out.println(mobile1);
		
		String Mobile2 = info[1][0];
		System.out.println(Mobile2);
		
		String mobile2 = info[1][1];
		System.out.println(mobile2);
		
		String Mobile3 = info[2][0];
		System.out.println(Mobile3);
		
		String mobile3 = info[2][1];
		System.out.println(mobile3);
		
		for (int i = 0; i < info.length; i++) 
		{
			System.out.println(info[i][0]);
			
		}
		
		Object products[][] = 
		{
			new Object[] {"Iphone",true},
			new Object[] {"Samsung",false}
		};
		System.out.println(products[0][0]);
		System.err.println(products[0][1]);
		System.err.println(products[1][0]);
		System.err.println(products[1][1]);
		
		String FristProduct = (String)products[0][0];
		System.out.println(FristProduct);
		
	}

}
