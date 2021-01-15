public class Area_1 {

	public static void main(String[] args) {
		test obj =new test();
		obj.area(6,4);
		obj.area(3);
		
	}
}
class test
{
	void area(int a,int b)
	{
		System.out.println("Area of rectangle ="+ a*b);
	}
	void area(int a)
	{
		System.out.println("Area of circle ="+ 3.14*(a*a));
	}
}


