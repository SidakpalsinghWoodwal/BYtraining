import java.util.Scanner;
class Employee
{
	int id,age;
	String name,des;
	float sal;
	Employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name ");
		name=sc.nextLine();
		System.out.println("Enter ID ");
		id=sc.nextInt();
		System.out.println("Enter age ");
		age=sc.nextInt();
		System.out.println("Enter salary ");
		sal=sc.nextFloat();
		System.out.println("Enter designation ");
		des=sc.next();
	}
	void display()
	{
		System.out.println("Name is "+name);
		System.out.println("Id is "+id);
		System.out.println("Age is "+age);
		System.out.println("Salary is "+sal);
		System.out.println("Designation "+des);
	}
};
class Demo2
{
	public static void main(String args[])
	{
		
		Employee e=new Employee();
		e.display();
		// if space-> it terminates
		//String name=sc.next()
		
		
		
		
	}
}
