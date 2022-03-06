package pkg1;

public class Employee {
	 int age;
	 int Roleno;

	public void display1 () 
	{
		System.out.println("Hello Java World");
	}
	public void display2 ()
	{
		System.out.println("Automation is very easy");
	}
	public static void main (String [] args)
	{
		Employee Sumit = new Employee ();
		Sumit.display1();
		Sumit.display2();
		Sumit.age = 29;
		System.out.println(Sumit.age);
		Sumit.Roleno = 98765;
		System.out.println(Sumit.Roleno);
	}
	}

