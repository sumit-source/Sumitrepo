package pkg1;

import java.util.Scanner;

public class ukr {
	public static void main(String[] args) 
	{
		System.out.println("Please Enter a value of a ");
		Scanner obj = new Scanner (System.in);
		int a = obj.nextInt();
		System.out.println("Value of a is " +a);
		System.out.println("Please Enter a value of b ");
		Float b = obj.nextFloat();
		System.out.println("Value of b is " +b);
	}

}
