package sample;

class A2
{
	 public void show()
	{
		System.out.println("hey i m anmol");
	}
}
class B2 extends A2
{
	public void show()
	{
		super.show();
		System.out.println("hey i m aman");
		
	}
}

public class OverRideMethod
{

	public static void main(String[] args) 
	{
		A2 ob = new B2();
	//	A2 obj=new A2();
	//	obj.show();
		ob.show();
	}

}
