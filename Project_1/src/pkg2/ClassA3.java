package pkg2;

public class ClassA3 extends ClassA2
{
public void m8 ()

{
	super.m4();
	super.m1();
	super.m3();
	super.m2();
	
System.out.println("Child default parameterized method");	
}

 public void m5 ()
 {
	 this.m7();
	 System.out.println("Child one parameterized method");
 }
 public void m6 ()
 {
	 this.m5();
	 System.out.println("Child two parameterized method");
 }
 public void m7 ()
 {
	this.m8();
	 System.out.println("Child three parameterized method" );
 }
 public static void main(String[] args) {
	ClassA3 obj = new ClassA3();
	obj.m6();
}
}


