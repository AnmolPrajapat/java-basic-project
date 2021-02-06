package sample;

class A1
{
	
	public int add(int i, int j)
	{
		return i+j;
	}
}
class B1 extends A1
{
	public int sub(int i, int j)
	{
	return i-j;
	}
}


public class Inheritance 
{             
	public static void main(String[] args1)
	{
		B1 ob = new B1();
		int result = ob.add(6, 7);
		System.out.println("result for add is" +  result);
		System.out.println( "result for sub is " +ob.sub(23,46));

	}

}
