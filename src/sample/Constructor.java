package sample;

import java.util.Scanner;

public class Constructor {
    public int result;
    public int num1=4;
    public int num2=3;
     /*
   	Scanner Scan=new Scanner(System.in);
	System.out.println("eneter first no.");
    int num1=Scan.nextInt();
    System.out.println("eneter second no.");
    int num2=Scan.nextInt();
    		*/
	public Constructor(String b) {
		
		// TODO Auto-generated constructor stub
		System.out.println("im using whatsapp");
		result=num1+num2;
		System.out.println(result);
	}
    public Constructor(int n) {
    	
    	System.out.println("i m using insta");
    	result= num1-num2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Constructor ob = new Constructor("anmol");
		//System.out.println(ob.result);
	
		
		

	}

}
