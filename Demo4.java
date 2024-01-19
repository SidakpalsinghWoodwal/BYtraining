import java.util.Scanner;
class Developer
{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int age;
	int salary=50000;
	String desig="Developer";
	Developer()
	{

	}
	void assign()
	{
		System.out.println("Enter id ");
		id=sc.nextInt();
		System.out.println("Enter name ");
		name=sc.next();
		System.out.println("Enter age ");
		age=sc.nextInt();
	}
	void display()
	{
		if(name==null)
		{
			System.out.println("No record yet");
			return;
		}
		else
		{
			System.out.println("ID is "+id);
			System.out.println("Name is "+name);
			System.out.println("Age is "+age);
			System.out.println("Salary is "+salary);
			System.out.println("Designation is "+desig);
		}
	}
}
class Manager
{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int age;
	int salary=40000;
	String desig="Manager";
	Manager()
	{

	}
	void assign()
	{
		System.out.println("Enter id ");
		id=sc.nextInt();
		System.out.println("Enter name ");
		name=sc.next();
		System.out.println("Enter age ");
		age=sc.nextInt();
	}
	
	void display()
	{
		if(name==null)
		{
			System.out.println("No record yet");
			return;
		}
		else
		{
			System.out.println("ID is "+id);
			System.out.println("Name is "+name);
			System.out.println("Age is "+age);
			System.out.println("Salary is "+salary);
			System.out.println("Designation is "+desig);
		}
	}
}
class Clerk
{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int age;
	int salary=10000;
	String desig="Clerk";
	Clerk()
	{

	}
	void assign()
	{
		System.out.println("Enter id ");
		id=sc.nextInt();
		System.out.println("Enter name ");
		name=sc.next();
		System.out.println("Enter age ");
		age=sc.nextInt();
	}
	void display()
	{
		if(name==null)
		{
			System.out.println("No record yet");
			return;
		}
		else
		{
			System.out.println("ID is "+id);
			System.out.println("Name is "+name);
			System.out.println("Age is "+age);
			System.out.println("Salary is "+salary);
			System.out.println("Designation is "+desig);
		}
	}
}
class Tester
{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int age;
	int salary=30000;
	String desig="Tester";
	Tester()
	{

	}
	void assign()
	{
		System.out.println("Enter id ");
		id=sc.nextInt();
		System.out.println("Enter name ");
		name=sc.next();
		System.out.println("Enter age ");
		age=sc.nextInt();
	}
	void display()
	{
		if(name==null)
		{
			System.out.println("No record yet");
			return;
		}
		else
		{
			System.out.println("ID is "+id);
			System.out.println("Name is "+name);
			System.out.println("Age is "+age);
			System.out.println("Salary is "+salary);
			System.out.println("Designation is "+desig);
		}
	}
}

class Demo4
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int ch=0,choice=0;
		Developer d=new Developer();
		Manager m=new Manager();
		Clerk c=new Clerk();
		Tester t= new Tester();

		while(choice!=3)
		{
			System.out.println("HERE");
			choice=0;
			System.out.println("1--->Create");
			System.out.println("2--->Display");
			System.out.println("3--->Exit");
			System.out.println("Enter out of 3");
			System.out.println("Choice value is "+choice);
			choice=s1.nextInt();
			
			if(choice==1)
			{
				ch=0;
				while(ch!=5)
				{
					System.out.println("1----->Developer");
					System.out.println("2----->Manager");
					System.out.println("3----->Clerk");
					System.out.println("4----->Tester");
					System.out.println("5----->Exit");
					System.out.println("Enter choice ");
					ch=s1.nextInt();
					if(ch==1)
					{
						
						d.assign();
					}
					else if(ch==2)
					{
						m.assign();
					}
					else if(ch==3)
					{
						c.assign();
					}
					else if(ch==4)
					{
						t.assign();
					}			
					else if(ch==5)
					{
						break;
					}
				}
			}
			else if(choice==2)
			{
				ch=0;
				while(ch!=5)
				{
					System.out.println("1----->Developer");
					System.out.println("2----->Manager");
					System.out.println("3----->Clerk");
					System.out.println("4----->Tester");
					System.out.println("5----->Exit");
					System.out.println("Enter choice ");
					ch=s1.nextInt();
					if(ch==1)
					{
						
						d.display();
					}
					else if(ch==2)
					{
						m.display();
					}
					else if(ch==3)
					{
						c.display();
					}
					else if(ch==4)
					{
						t.display();
					}			
					else if(ch==5)
					{
						break;
					}
				}
			}
			else if(choice==3)
			{
				System.exit(0);
			}
		}
	}
}