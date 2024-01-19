class Emp
{
	byte a=127;
	short s=32766;
	long i=923567890L;
	float f=10/3f;
	double d=10/3d;
	int b=100;
	void display()
	{
		System.out.println("Byte "+a);
		System.out.println("Short "+s);
		System.out.println("Long "+i);
		System.out.println("Double "+d);
		System.out.println("Float "+f);
		System.out.println("Int "+b);
	}
}
class Demo3
{
	public static void main(String args[])
	{
		Emp e=new Emp();
		e.display();
	}
	
}