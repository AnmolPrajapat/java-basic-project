package sample;

import java.util.Scanner;

public class PatternRect {
	
	public static void main(String[] args) {
		int rows, colom;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no. of rows");
		rows=scan.nextInt();
		
		System.out.println("enter the no. of colom ");
		colom=scan.nextInt();
		 for(int i=1;i<=rows;i++)
		 {
			 for(int j=1;j<=colom;j++)
			 {
				 if(i==1 || i==rows ||j==1 || j==colom)
				 {
					 System.out.print("$");
				 }
				 else
				 {
					 System.out.print(" "); 
				 }
			 }
			 System.out.print("\n");
		 }

	}

}
