import java.util.Scanner;
public class Area {
	int a;
	Area(int l,int b){
		a =l*b;
		}

	public static void main(String[] args) {
		int l,b;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle");
		l=sc.nextInt();
		b=sc.nextInt();
		Area obj= new Area(l,b);
		obj.returnarea();
	}
void returnarea() {
	System.out.println("Area of the rectangle =" + a  );
}

}
