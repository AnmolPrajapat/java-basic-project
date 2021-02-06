package sample;
interface II1
{
	public abstract void ase(int i);
	void lea();
	default void add()
	{
		System.out.println(1);
		
	}
}
interface II2
{
	void tea();
}

class ABC1 implements II1,II2
{
	public void ase(int i)
	{
		System.out.println(i);
	}
	public void lea()
	{
		System.out.println(1);
	}
	public void tea()
	{
		System.out.println(2);
	}
}



public class InterfaceDemo
{

	public static void main(String[] args) 
	{
		ABC1 ob = new ABC1();
		ob.tea();
		ob.lea();
		ob.ase(66);
		ob.add();
		

	}

}
