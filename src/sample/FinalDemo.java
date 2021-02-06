package sample;
class A3
{
    /*final*/ double PI=3.14;
	public void display()
	{
		System.out.println("i m in display");
	}
}
class A4 extends A3
{
	public void shw()
	{
		System.out.println("i m in show");
	}
}

public class FinalDemo {

	public static void main(String[] args)
	{
		A4 ob=new A4();
		
		ob.shw();
		ob.display();
        //System.out.println(ob.PI=3.44);
	}

}
