package assignments3.except.handler;

class Employee{
	void getSalary() {
		System.out.println("will get salary");
	}
}
class Manager extends Employee{
	void getSalary() {
		super.getSalary();
		System.out.println("will be Manager");
	}
}
class Developer extends Employee{
	void getSalary() {
		super.getSalary();
		System.out.println("will be Developer");
	}

}
public class PolyClass {

	public static void main(String[] args) {
		Developer  de = new Developer();
		de.getSalary();
	}

}
