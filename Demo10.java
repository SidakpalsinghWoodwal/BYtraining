abstract class Bank
{
	abstract void loan();
}
class B extends Bank
{
	public void loan()
	{
		System.out.println("Implementation of B class");
	}
}
class Demo10
{
	public static void main(String args[])
	{
		B b=new B();
		b.loan();
	}
}