package sample;

class Outer
{
	
	public void show()
	{
		System.out.println("i m in outer class");
		
	}
	
	class Inner  // Outer$Inner..class
	{
		
		public void display()
		{
			System.out.println("i m in inner class");
			show();
		}
		
	}
}


public class InnerClassDemo
{

	public static void main(String[] args)
	{
		
      Outer obj = new Outer();
      obj.show();
      Outer.Inner obj1 =obj.new Inner();
      obj1.display();
      
      
	}

}
