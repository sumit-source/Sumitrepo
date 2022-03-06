package pkg1;

public class Calculation 
{
	public int Multi (int a, int b)    //(((((10*2)-2)*2)+2)/2)
	{
		int c;
		c = a*b;
		System.out.println("Multiplication Result is " +c);
		return c;
	}
    public int Sub (int a1 , int a2)
    {
    	int b1;
    	b1 = a1-a2;
    	System.out.println("Substraction Result is the here " +b1);
    	return b1;
    }
    public int Sum (int x , int y)
    {
    	int z;
    	z = x +y;
    	System.out.println("Sum Result is " +z);
    	return z;
    }
    public void dev (int x1 , int y1)
    {
    	int z1;
    	z1 = x1/y1;
    	System.out.println("Final Result is " +z1);
    }
    public static void main(String[] args) 
    {
    	Calculation Sumit = new Calculation();
    	int Multiresult = Sumit.Multi(10, 2);
    	int Subresult = Sumit.Sub(Multiresult, 2);
    	int Multiresult2 = Sumit.Multi(Subresult, 2);
    	int Sumresult = Sumit.Sum(Multiresult2, 2);
        Sumit.dev(Sumresult, 2);
        }
    }
