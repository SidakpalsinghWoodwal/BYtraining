Class parent
{
	int money=500000;
	String car="BMW";
	int site=5;
	Parent()
	{
		System.out.println("Car "+car);
		System.out.println("Money "+money);
	}
}
class Child extends Parent
{
	int money=2000;
	int site=2;
	Child
	{
		System.out.println("Car "+car);
		System.out.println("parent Money "+super.money);
		System.out.println("child site "+site);
		System.out.println(" child Money "+money);		
	}
}