package pkg1;

public class Sunday 
{
	public void Funday1 ()
	{
		this.Funday4();
		System.out.println("This is Default Parameterized");
	}
	public void Funday2 ()
	{
		this.Funday1();
		System.out.println("This is one Parameterized");
	}
	public void Funday3 ()
	{
		this.Funday2();
		System.out.println("This is two Parameterized");
	}
	public void Funday4 ()
	{
		System.out.println("This is three Parameterized");
	}
	public void Funday5 ()
	{
		this.Funday3();
		System.out.println("This is four Parameterized");
	}
	public void Funday6 ()
	{
		this.Funday5();
		System.out.println("This is Five Parameterized");
	}
	public static void main(String[] args) {
		Sunday Sumit = new Sunday ();
		Sumit.Funday6();
	}

}
