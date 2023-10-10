package Loops;

import java.util.Scanner;

public class ForLoop_Examples {

	public static void main(String[] args) 
	{
		for (int i = 1; i < 20; i++) 
		{
			System.out.println(i);
		}
		
		for (int i = 20; i > 0 ; i--)
		{
			System.out.println(i);
		}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Start number:---->");
		int StartNum = sc.nextInt();
		
		System.out.println("Enter End number:---->");
		int EndNum = sc.nextInt();
		
		for (int i = StartNum; i <= EndNum; i++) 
		{
		    System.out.println(i);
		}
		

	}

}
