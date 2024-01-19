class A
{
	int a=100;
	A()
	{
		System.out.println("A class");
	}
}

class B extends A
{
	B()
	{
		System.out.println("B class "+a);
	}
}

public class Demo5
{
	public static void main(String arg[])
	{
		B b=new B();
	}
}