package pkg2;

public class Child extends Parent
{
		public  Child ()
		{
			super(3);
			System.out.println("Child Default constructor");
		}
		public  Child (int a)
		{
			this(7,8,9);
			System.out.println("Child 1 Parameterize constructor");
		}
		public  Child (int a, int b)
		{
			this(3);
			System.out.println("Child 2 Parameterize constructor");
		}
		public  Child (int a, int b, int c)
		{
			this();
			System.out.println("Child 3 Parameterize constructor");
		}
		public static void main(String[] args) 
		{
			Child obj = new Child (4, 6);
			
		}

}
