package pkg1;

public class Thar extends Mahindra
{
 public void Color ()
 {
	 System.out.println("Thar Color is Black");
 }
 public void Model ()
 {
	 System.out.println("Model number is 987656");
 }
 public static void main(String[] args) {
	Thar sm = new Thar ();
	sm.BasePrice();
	sm.Color();
	sm.Model();
	sm.Category();
}
}
