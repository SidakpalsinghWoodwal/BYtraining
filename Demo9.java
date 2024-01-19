class A
{
	void A()
	{
		System.out.println("Default");
	}
	void A(int a)
	{
		System.out.println("A(int a )");
		
	}
	void A(int a,String name)
	{
		System.out.println("A(int a,string name )");		
	}
}
class Demo9
{
	public static void main(String args[])
	{
		A a=new A();
		a.A();
		a.A(7);
		a.A(8,"sjsj");
	}
}