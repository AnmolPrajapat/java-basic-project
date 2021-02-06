package sample;

abstract class Abc
{
	abstract void show(Number b);
}
 class Printer extends Abc
{
	
	public void show(Number b)
	{
		System.out.println(12);
	}
	public int add(int i,int j)
	{
		return i+j;
	}
}

public class AbstractDemo1 {

	public static void main(String[] args)
	{
		Printer obj = new Printer();
			
				
		obj.show(5);
		System.out.println(obj.add(9,10));
		

	}

}
