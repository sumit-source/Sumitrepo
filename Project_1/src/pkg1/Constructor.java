package pkg1;

public class Constructor 
{
public Constructor()
{
	this(87,87,98);
	System.out.println("This is a Default Parameterize");
	}
public Constructor (int a)
{
	this(67,8,9,6);
	System.out.println("This is one Parameterize");
	}
public Constructor (int a , int b )
{
	this();
	System.out.println("This is two Parameterize");
	}
public Constructor (int a, int b, int c)
{

System.out.println("This is three Parameterize");	
}
public Constructor (int a, int b , int c , int d)
{
	this(76,8);
System.out.println("This is four Parameterize");	
}

public static void main(String[] args) {
	Constructor Sumit = new Constructor (23);
}
}


