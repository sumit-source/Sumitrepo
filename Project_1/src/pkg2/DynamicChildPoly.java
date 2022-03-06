package pkg2;

public class DynamicChildPoly extends DynamicPoly
{
	public void Shownumber ()
	{
		System.out.println("This is overiding");
	}

	public static void main(String[] args) {
		DynamicChildPoly obj = new DynamicChildPoly ();
		obj.Shownumber();
		obj.Shownumber(8);
		
	}

	
	}


