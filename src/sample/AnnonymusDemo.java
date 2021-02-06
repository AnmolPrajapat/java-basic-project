package sample; 

abstract class A2C
{
	abstract void show();
	
}
public class AnnonymusDemo
{

	public static void main(String[] args)
	{
	  A2C ob = new A2C() 
	  {
		  public void show() {
			  System.out.println(29);
		  }
	  };
			 
	  
	  ob.show();
	  

	}

}
