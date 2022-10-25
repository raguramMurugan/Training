package runtimeexception;

import java.util.Scanner;

public class IllegalArgue {

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Kindly Enter a Number");
		compare(s.nextInt());
	}
	public static void compare(int x)
	{
		if(x<100 && x>0)
		{
		System.out.println("Number found between 0 to 100");
			
		}
		else
		{
			throw new IllegalArgumentException("Kindly enter the Value between 0 too 100");
		}
		
		
	}
}
 