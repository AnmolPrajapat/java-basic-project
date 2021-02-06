package sample;

public class ArraySample
{

	public static void main(String[] args) 
	{
		int a[][]= {
				{1,4,7,4,2},
				{3,4,66,66,43}
				};
		
		for(int k[] : a)
		{
			for(int l:k)
			{
				
			System.out.println(" "+ l+ " ");
			
			}
			System.out.print("\n");
			
		}
	}
}
