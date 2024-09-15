package assignments3.except.handler;

class Base{
	public Object getObject() {
		System.out.println(" Creating covariant");
		return new Object();
	}
}
class Derived extends Base{
	public String getObject() {
		super.getObject();
		return "this is a covariant string";
		
	}
}

public class Covant {
	public static void main(String[] args) {
		Derived de = new Derived();    
		System.out.println(	de.getObject());
		
	}

}
