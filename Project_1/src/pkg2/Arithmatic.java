package pkg2;

import java.util.Scanner;

public class Arithmatic 
{ 
	public int sum (int a , int b)
	{
		int c;
		c= a+b;
		return c;
		
	}
	public int sub (int d , int e)
	{
		int f;
		f = d-e;
		return f;
	}
	public int multiply (int g , int h)
	{
		int i;
		i = g*h;
		return i;
	}
	public int dev (int j, int k)
	{
		int l;
		l = j/k;
		return l;
		}

	public static void main (String [] args)
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("Please enter the value of X1: ");
		int x1 = obj.nextInt();
		System.out.println("Please enter the value of X2: ");
		int x2 = obj.nextInt();
		Arithmatic s = new Arithmatic ();
		int sum = s.sum(x1, x2);
		System.out.println("Please enter the value of x3: ");
		int x3 = obj.nextInt();
		int sub = s.sub(sum, x3);
		System.out.println("Please enter the value of x4");
		int x4 = obj.nextInt();
		int sum2 = s.sum(sub, x4);
		System.out.println("Please enter the value of x5");
		int x5 = obj.nextInt();
		int multiply = s.multiply(sum2, x5);
		System.out.println("Please enter the value of x6");
		int x6 = obj.nextInt();
        int dev =  s.dev(multiply, x6);
        System.out.println("Final result is: " + dev);
		
		
}
}