public class Triangle {
	public Triangle() {
		double perimeter;
		double area;
		int a=3,b=4,c=5;
		perimeter=a+b+c;
		double phalf=perimeter/2;
		area=Math.sqrt(phalf*(phalf-a)*(phalf-b)*(phalf-c));
		System.out.println("Perimeter of triangle="+perimeter);
		System.out.println("Area of triangle="+area);
	
	}
	public static void main(String[] args) {
		Triangle obj =new Triangle();
		
	}
