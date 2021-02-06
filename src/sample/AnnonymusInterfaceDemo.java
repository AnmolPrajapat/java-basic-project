package sample;

interface I1
{
	void show();
	
}


public class AnnonymusInterfaceDemo 
{

	public static void main(String[] args) 
	{
		I1 ob =()->System.out.println(23); //lambda expression
		ob.show();

	}

}
