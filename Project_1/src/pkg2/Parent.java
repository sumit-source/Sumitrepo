package pkg2;

public class Parent 
{
	public  Parent ()
	{
		System.out.println("Parent Default constructor");
	}
	public  Parent (int a)
	{
		this(5,6,7);
		System.out.println("Parent 1 Parameterize constructor");
	}
	public  Parent (int a, int b)
	{
		this();
		System.out.println("Parent 2 Parameterize constructor");
	}
	public  Parent (int a, int b, int c)
	{
		this(43,54);
		System.out.println("Parent 3 Parameterize constructor");
	}

}
