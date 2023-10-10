package Arrays;

public class Double_Dimensional_StaticArray 
{

	public static void main(String[] args) 
	{
		//Declaration of double dimensional array
		String data[][]=new String[3][2];
				
		//Storing first row data 
		data[0][0]="OnePlus";
		data[0][1]="45000.00";
				
		//Storing Second row data 
		data[1][0]="Samsung";
		data[1][1]="25000.00";
			
		//Storing Second row data 
		data[2][0]="Iphone";
		data[2][1]="55000.00";
				
	    System.out.println(data[1][0]+"--->"+data[1][1]);
	    
	    int Length = data.length;
	    System.out.print(Length);
	}

}
