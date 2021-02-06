package sample;
abstract class Human
{
	 abstract void run();
	 abstract void gender();
	 public int add(int i, int j)
	 {
		 return i+j;
	 }
	 
}
class Men extends Human
{
	public void run()
	{
		System.out.println("its a common properties");
	}
	public void gender()
	{
		System.out.println("male");
	}
}

class Women extends Human
{
	public void run()
	{
		System.out.println("its a common properties");
	}
	public void gender()
	{
		System.out.println("female");
	}
}




public class AbstractDemo 
{

	public static void main(String[] args)
	{
		Human obj = new Men();
		obj.run();
		Human ob = new Women();
		ob.run();
		obj.gender();
		ob.gender();
		System.out.println(ob.add(45, 45));

	}

}
