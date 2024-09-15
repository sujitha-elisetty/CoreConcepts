package assignments3.except.handler;
class Tree{
	 void branch() {
		System.out.println("trees are in green colors");
	}
}
class pineApple extends Tree{
      void branch() {
		System.out.println("trees are in green ");
	}
}
public class FinaMethods {
	public static void main(String[] args) {
		
		pineApple pn = new pineApple();
		pn.branch();
	}

}
