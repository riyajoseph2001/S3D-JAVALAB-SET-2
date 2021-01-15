class Parent{
void display1() {
	System.out.println("This is parent class");
}
}
class Child extends Parent{
	void display2() {
		System.out.println("This is child class");
	}
}
public class Testclass {

	public static void main(String[] args) {
		Parent p =new Parent();
		Child c =new Child();
		p.display1();
		c.display2();
		c.display1();
		}
 }
