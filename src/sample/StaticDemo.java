package sample;

class Emp
{
	int eid;
	int salary;
	static String company;
	
	static
	{
		company="apple";
	}
	public Emp()
	{
		eid=1;
		salary=60000;
	}

    public void empdet()
  {
    	System.out.println(eid +":"+ salary + ":"+company);
  }
}
public class StaticDemo {

	public static void main(String[] args) {
		Emp Anmol = new Emp();
		// Anmol.eid=3;
		// Anmol.salary=70000;
		// Emp.company="microsoft";
		Anmol.empdet();
		 
		Emp Aman = new Emp();
		// Aman.eid=4;
		// Aman.salary=80000;
		// Emp.company="microsoft";
		
	
		Aman.empdet();

	}

}
