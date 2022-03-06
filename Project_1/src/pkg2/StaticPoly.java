package pkg2;

public class StaticPoly 
{
public void Readdata (int a, int c)
{
System.out.println("This is for StaticPolymorphism");	
}
public void ReadDData (int r)
{
System.out.println("This is the second Method");	
}
public static void main(String[] args) {
	StaticPoly obj = new StaticPoly ();
	obj.Readdata(45, 87);
	obj.ReadDData(5);
}
}
