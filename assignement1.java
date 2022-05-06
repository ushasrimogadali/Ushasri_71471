import java.util.*;
class assignement
{
	public static void main(String args[])
{
		System.out.println("enter choice:");
		System.out.println("1.create");
		System.out.println("2.display");
		System.out.println("3.raise salary");
		System.out.println("4.Exit");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		if (ch==1)
		{
			create c =new create();
			c.display();
		}
		else if(ch==2)
		{
			display d =new display();
			d.dis();
		}
		else if(ch==3)
		{
			raise_salary r=new raise_salary();
			r.inc();
		}	
		else
		{
			exit e=new exit();
			e.nul();
		}

	}
}
class create
{
	void display()
	{
		System.out.println("Enter choice");
		System.out.println("1.clerk");
		System.out.println("2.dev");
		System.out.println("3.manager");
		System.out.println("4.Tester");
		System.out.println("5.Exit");	
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		if(c==1)
		{
			clerk();	
		}
		else if(c==2)
		{
			dev();
		}
		else if(c==3)
		{
			manager();
		}
		else if(c==4)
		{
			tester();
		}
		else
		{
			nul();
		}
	}
	void clerk()
		{
			System.out.println("salary:15000");
		}
		void dev()
		{
			System.out.println("salary:25000");	
		}
		
		void manager()
		{
			System.out.println("salary:50000");	
		}
		void tester()
		{
			System.out.println("salary:20000");	
		}
		void nul()
		{
			return;
		}	
}
class display
{
	void dis()
	{
		System.out.println("1.clerk:15000");
		System.out.println("2.dev:25000");
		System.out.println("3.manager:50000");
		System.out.println("4.Tester:20000");
		System.out.println("5.Exit");
	}
}
class raise_salary
{
	void inc()
	{
		int d;
		System.out.println("Present salary");
		Scanner sc=new Scanner(System.in);
		int sal=sc.nextInt();
		d=sal+5000;
		System.out.println("Incremented salary:"+d);
		
	}
}
class exit
{
	void nul()
	{
		return;
	}
}