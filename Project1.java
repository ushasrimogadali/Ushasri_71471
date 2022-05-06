package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.sql.*;

//import sun.jdbc.odbc.PreparedStatement;
abstract class Employee
{
	String name;
	int age;
	int salary;
	String designation;
	static int count=0;
	Employee()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // oracle
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System","sri");
			PreparedStatement stmt= con.prepareStatement("insert into employee values(?,?,?,?)");
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter Name : ");
			String name=sc.next();
		
			
			System.out.print("Enter Age    : ");
			int age=sc.nextInt();
			
			stmt.setString(1, name);
			stmt.setInt(2, age);
			stmt.setInt(3, salary );
			stmt.setString(4, designation);
			
			stmt.execute();
			
			
			
			stmt.close();
			System.out.println("Data Inserted ....! ");
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public static  void display()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); // mysql 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","System","sri");

	
			Statement stmt=con.createStatement();
			ResultSet rs =stmt.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getString(1) + " : "+rs.getInt(2)+ " : "+rs.getInt(3)+ " : "+rs.getString(4));
			}
			stmt.close();

		}
		catch (Exception e) {
			System.out.println(e);
		}

	}
	public static  void riseSalary()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); // mysql 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","System","sri");
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement("update emp set name  = ? where name =? ");
			Scanner sc=new Scanner(System.in);
			

			
			System.out.print("Enter old Name  ");
			String name=sc.next();
			
			System.out.print("Enter new  Name  ");
			String name1=sc.next();
			
			stmt.setString(1,name  );
			stmt.setString(2, name1 );
			
			stmt.execute();
			stmt.close();
			System.out.println("Data Updated  ....! ");
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}
	public static  void deleteemp()
	{

		try
		{
			Class.forName("com.mysql.jdbc.Driver"); // mysql 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","System","sri");
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement("delete from emp where name =? ");
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter Name : ");
			String name=sc.next();
		
			stmt.setString(1, name );
			
			System.out.print("DO you really want to delete ? yes / no  : ");
			String ch=sc.next ();	
			if(ch.equalsIgnoreCase("yes"))
			{
				stmt.execute();
				System.out.println("Data Deleted   ....! ");
			}
			else
			{
				System.out.println("Data not Deleted ...! ");
			}
		
		
			
			stmt.close();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}

final class Clerk extends Employee{
	public Clerk(){
		salary=10000;
		designation="Clerk";
	}
	}

 final class Programmer extends Employee{
	public Programmer(){
		salary=20000;
		designation="Programmer";
	}
	
}
final class Manager extends Employee{
	public Manager(){
		salary=70000;
		designation="Manager";
	}
	
}

public class Project1 {
	public static void main(String[] args)
	{
		int ch1=0,ch2=0;
	Clerk c;
		//Emp e[]=new Emp[100];
		ArrayList<Employee> list=new ArrayList<Employee>();
		//LinkedList<Emp> list=new LinkedList<Emp>();
		//Vector list=new Vector();
		//HashSet<Emp> list=new HashSet<Emp>();
		//LinkedHashSet list= new LinkedHashSet();
		//TreeSet list=new TreeSet();
	
		do{
		System.out.println("--------------------------------");
		System.out.println("1.CREATE");
		System.out.println("2.DISPLAY");
		System.out.println("3.UPDATE");
		System.out.println("4.DELETE");
		System.out.println("5.EXIT");
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
						//e[Emp.count++]=new Clerk();
						//list.add(new Clerk());
						Clerk cc=new Clerk();
						
						break;
						
					case 2:
						//list.add(new Programmer());
						//e[Emp.count++]=new Programmer();
						Programmer pp=new Programmer();
						break;
					
					case 3:
//						list.add(new Manager());
						//e[Emp.count++]=new Manager();
						Manager mm=new Manager();
						break;
					}
			}while(ch2!=4);
		}
		if(ch1==2)
		{
			Employee.display();
			
		}
		if(ch1==3)
		{
			Employee.riseSalary();
		}
		if(ch1==4)
		{
			Employee.deleteemp();
		}
		}while(ch1!=5);
		System.out.println("Total no. of Employees Created:"+Employee.count);
	}
}