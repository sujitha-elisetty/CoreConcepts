package assignments3.except.handler;

interface Playable{
	 public String play( String msg);
}
class Guiter implements Playable{
	public String play( String msg) {
		System.out.println("play the guiter");	
		return msg;
	}
}
class Piano implements Playable{
	public String play( String msg) {
		System.out.println("play the piano");	
		return msg;
	}
}
public class InterClass {
public static void main(String[] args) {
	Piano pi = new Piano();
	Guiter gt = new Guiter();
	System.out.println(pi.play("piano"));
	System.out.println(gt.play("guiter"));
	
}
}
