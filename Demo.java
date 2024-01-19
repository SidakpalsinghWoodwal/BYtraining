class A{
	A()
	{
		System.out.println("Constructor");
	}
	void display()
	{
		System.out.println("Method");
	}
}
class Demo
{
	public static void main(String args[])
	{
		System.out.println("Hi welcome to java");
		A a=new A();
		a.display();
	}
}