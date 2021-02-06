package sample;

class A
{
	public A()
	{
		System.out.println("in A");
	}
	public A(String b)
	{
		System.out.println("its string method");
	}
}
class B extends  A
{
	public B()
	{
		super();
		System.out.println("in B");
	}
}

public class SuperDemo
{

	public static void main(String[] args)
	{
	 B obj = new B();
	 A4 ob=new A4();
		
		ob.shw();
		System.out.println(ob.PI=8.89);
	 
	}

}
