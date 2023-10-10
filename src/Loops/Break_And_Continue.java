package Loops;

import java.util.Scanner;

public class Break_And_Continue {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any between 10 to 30 :---->");
		int num = sc.nextInt();
		
		for (int i = 10; i <= 30; i++) 
		{
			if (i==num) 
			{
               break;
			}
			System.out.println(i);
		}
		
		for (int i = 10; i <= 30; i++) 
		{
			if (i==num)
			{
				continue;
			}
			System.out.println(i);
	 
	}

	}
}
