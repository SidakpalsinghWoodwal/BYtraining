import java.util.Scanner;

interface Company
{
	void access();
	String companyName="Blueyonder";
	default void advSal()
	{
		System.out.println("In java 8 we can write default method belonging to object");
	}

	static void cab()
	{
		System.out.println("In java 8 we can write static method independent to object");		
	}
}

abstract class Employee
{
	public int id,age;
	int raise=0;
	protected float sal;
	String name,des;
	Employee()
	{
		
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
			System.out.println("Salary is "+sal);
			System.out.println("Designation is "+des);
			System.out.println("Company name is "+Company.companyName);
		}
	}
	void assign()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID ");
		id=sc.nextInt();	
		System.out.println("Enter name ");
		name=sc.next();
		System.out.println("Enter age ");
		age=sc.nextInt();
	}
	
	abstract void update();
	abstract void pf();
}

final class Developer extends Employee implements Company
{
	
	Developer()
	{
		sal=50000;
		des="Developer";
	}

	void update()
	{
		if(raise==1)
		{
			return;
		}
		//System.out.println("Updating ");
		sal= sal + (15*sal)/100;
		//System.out.println("salary is "+ sal);
		raise=1;
	}
	void pf()
	{
		System.out.println("Provident fund is "+(0.1*(float)(sal)));
	}
	public void access()
	{
		System.out.println("Access to tower A");
	}
}

final class Manager extends Employee implements Company
{
	Manager()
	{
		sal=40000;
		des="Manager";
	}

	void update()
	{
		sal=sal+(sal*20)/100;
		raise=1;
	}
	void pf()
	{
		System.out.println("Provident fund is "+(0.1*(float)(sal)));
	}
	public void access()
	{
		System.out.println("Access to tower B");
	}
}

final class Clerk extends Employee implements Company
{
	int sal;
	String des;
	Clerk()
	{
		this.sal=20000;
		this.des="Clerk";
	}

	void update()
	{
		sal=sal+(5*sal)/100;
		raise=1;
	}
	void pf()
	{
		System.out.println("Provident fund is "+(0.1*(float)(sal)));
	}
	public void access()
	{
		System.out.println("Access to tower C");
	}
}

final class Tester extends Employee implements Company
{
	int sal;
	String des;
	Tester()
	{
		this.sal=30000;
		this.des="Tester";
	}

	void update()
	{
		sal=sal+(10*sal)/100;
		raise=1;
	}
	void pf()
	{
		System.out.println("Provident fund is "+(0.1*(float)(sal)));
	}
	public void access()
	{
		System.out.println("Access to tower D");
	}
}

public class Demo6
{
	public static void main(String args[])
	{
		Developer d=new Developer();
		Manager m=new Manager();
		Tester t=new Tester();
		Clerk c=new Clerk();
		Scanner scr=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		System.out.println("1: Add record");
		System.out.println("2: View record");
		System.out.println("3: Update record");
		System.out.println("4: View provident fund");
		System.out.println("5: View access");
		System.out.println("6: Exit");
		int choice=0,ch=0;
		try {
			while (choice != 6) {
				choice = 0;
				choice = scr.nextInt();
				if (choice == 1) {
					ch = 0;
					while (ch != 5) {
						System.out.println("1----->Developer");
						System.out.println("2----->Manager");
						System.out.println("3----->Clerk");
						System.out.println("4----->Tester");
						System.out.println("5----->Exit");
						System.out.println("Enter choice ");
						ch = s1.nextInt();
						if (ch == 1) {

							d.assign();
						} else if (ch == 2) {
							m.assign();
						} else if (ch == 3) {
							c.assign();
						} else if (ch == 4) {
							t.assign();
						} else if (ch == 5) {
							break;
						}
					}
				} else if (choice == 2) {
					ch = 0;
					while (ch != 5) {
						System.out.println("1----->Developer");
						System.out.println("2----->Manager");
						System.out.println("3----->Clerk");
						System.out.println("4----->Tester");
						System.out.println("5----->Exit");
						System.out.println("Enter choice ");
						ch = s1.nextInt();
						if (ch == 1) {

							d.display();
						} else if (ch == 2) {
							m.display();
						} else if (ch == 3) {
							c.display();
						} else if (ch == 4) {
							t.display();
						} else if (ch == 5) {
							break;
						}
					}
				} else if (choice == 3) {
					ch = 0;

					while (ch != 5) {
						System.out.println("1----->Developer");
						System.out.println("2----->Manager");
						System.out.println("3----->Clerk");
						System.out.println("4----->Tester");
						System.out.println("5----->Exit");
						System.out.println("Enter choice ");
						ch = s1.nextInt();
						if (ch == 1) {

							d.update();
						} else if (ch == 2) {
							m.update();
						} else if (ch == 3) {
							c.update();
						} else if (ch == 4) {
							t.update();
						} else if (ch == 5) {
							break;
						}
					}
				} else if (choice == 4) {
					ch = 0;

					while (ch != 5) {
						System.out.println("1----->Developer");
						System.out.println("2----->Manager");
						System.out.println("3----->Clerk");
						System.out.println("4----->Tester");
						System.out.println("5----->Exit");
						System.out.println("Enter choice ");
						ch = s1.nextInt();
						if (ch == 1) {

							d.pf();
						} else if (ch == 2) {
							m.pf();
						} else if (ch == 3) {
							c.pf();
						} else if (ch == 4) {
							t.pf();
						} else if (ch == 5) {
							break;
						}
					}
				} else if (choice == 5) {
					ch = 0;

					while (ch != 5) {
						System.out.println("1----->Developer");
						System.out.println("2----->Manager");
						System.out.println("3----->Clerk");
						System.out.println("4----->Tester");
						System.out.println("5----->Exit");
						System.out.println("Enter choice ");
						ch = s1.nextInt();
						if (ch == 1) {

							d.access();
						} else if (ch == 2) {
							m.access();
						} else if (ch == 3) {
							c.access();
						} else if (ch == 4) {
							t.access();
						} else if (ch == 5) {
							break;
						}
					}
				} else if (choice == 6) {
					System.exit(0);
				}
			}
		}
		catch (Exception e)
		{
			System.out.println("An Exception has occured");
		}
		finally {
			System.out.println("Thankyou for using the program");
		}
	} 
}