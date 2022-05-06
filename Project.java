import java.util.*;
abstract class A
{
	String name;
	int age;
	int salary;
	String designation;
	Scanner sc=new Scanner(System.in);
	A()
	{
		System.out.println("Enter Name:");
		name=sc.next();
		System.out.println("Enter Age:");
		age=sc.nextInt();
	}
 	public void display()
	{	
		System.out.println("\nNAME:"+name);	
 		System.out.println("AGE:" +age);
		System.out.println("SALARY:" +salary);	
		System.out.println("DESIGNATION:"+designation);	
 		
	}
	public abstract void riseSalary();
}
final class Clerk extends A
	{
	public Clerk(){
		salary=10000;
		designation="Clerk";
	}
	public void riseSalary(){
		salary=salary+5000;
		System.out.println("incremented Salary for clerk:"+salary);
		
		
	}
}
final class Programmer extends A
{
	public Programmer(){
		salary=15000;
		designation="Programmer";
	}
	public void riseSalary(){
		salary=salary+10000;
		System.out.println("incremented Salary for Programmer:"+salary);	
	}
}
final class Manager extends A
	{
	public Manager(){
		salary=20000;
		designation="Manager";
	}
	public void riseSalary(){
		salary=salary+15000;
		System.out.println("incremented Salary for Manager:"+salary);
		
		
	}
}

class Project
{
	public static void main(String args[])
	{	
		int ch1=0,ch2=0;
		Clerk c=null;
		Programmer p=null;
		Manager m=null;
		
		do{
		System.out.println("--------------------------------");
		System.out.println("1.creat");
		System.out.println("2.Display");
		System.out.println("3.RiseSalary");
		System.out.println("4.Exit");
		System.out.println("--------------------------------");
		System.out.println("Enter your Choice: ");
		Scanner sc1=new Scanner(System.in);	
		ch1=sc1.nextInt();
		if(ch1==1){
			 do{
				System.out.println("--------------------------------");
				System.out.println("1.Clerk");
				System.out.println("2.Programer");
				System.out.println("3.Manager");
				System.out.println("4.Exit");
				System.out.println("--------------------------------");
				System.out.println("Enter your Choice: ");
				Scanner sc2=new Scanner(System.in);
				ch2=sc2.nextInt();
				switch(ch2){
						case 1:
							c=new Clerk();
							break;
						case 2:
							 p= new Programmer();
							break;
						case 3:
							m=new Manager();	
							break;
					   }
				}while(ch2!=4);
			}
			if(ch1==2){
				c.display();
				p.display();
				m.display();
				}
			if(ch1==3){
				c.riseSalary();
				p.riseSalary();
				m.riseSalary();
				}
				
			}while(ch1!=4);
	}
}