package pkg1;

public class pkg2   //(((((10+2)+2)-2)*2)/2)
{
public int sum (int a, int b)
{
	int c;
	c= a+b;
	//System.out.println("Sum Result is" +c);
	return c;
}
public int Sub (int a1, int a2)
{
	int a3;
	a3 = a1-a2;
	//System.out.println("Sub Result is "+a3);
	return a3;
}
public int Multi (int x, int y)
{
	int z;
	z = x*y;
	//System.out.println("Multi Result is " +z);
	return z;
}
public void dev (int x1, int x2)
{
	int x3;
	x3 = x1/x2;
	//System.out.println("Final Result is " +x3);
}
public static void main(String[] args)
{
	pkg2 Sumit = new pkg2 ();
	int sumresult = Sumit.sum(10, 2);
	System.out.println("Sum Result is " +sumresult);
	int sumresult2 = Sumit.sum(sumresult, 2);
	System.out.println("Sum2 Result is " +sumresult2);
	int subresult = Sumit.Sub(sumresult2, 2);
	System.out.println("Sub Result is " +subresult);
	int multiresult = Sumit.Multi(subresult, 2);
	System.out.println("Multi Result is " +multiresult);
	 Sumit.dev(sumresult, 2);
	 System.out.println("Final Result is " +sumresult);
	
			
	
			
}
}
