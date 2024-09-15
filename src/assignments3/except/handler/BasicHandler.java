package assignments3.except.handler;
class BaseClass{
	void display() throws Exception {
		System.out.println("great");
		throw new Exception("greatest");
	}
}
class SubClass  extends BaseClass{
	void display() throws Exception{
		System.out.println("hello");
		throw new Exception("Hello everyone");
	}
}
public class BasicHandler {

	public static void main(String[] args) {
		SubClass sub = new SubClass();
		BaseClass base = new BaseClass();
		try {
		sub.display(); 
		}
		catch(Exception e) {
			System.out.println("Print sub exception"+e.toString());

		}
		
		try {
		base.display();
	}catch(Exception f ) {
		System.out.println("Print base exception" +f.toString());
	}}
}
