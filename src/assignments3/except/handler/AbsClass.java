package assignments3.except.handler;
abstract class Shape{
	abstract String draw(String msg);
}
class Circle extends Shape{
	String draw(String msg) {
		System.out.println("draw the shape");
		return "msg";
}}
	class Square extends Shape{
		String draw(String msg) {
			System.out.println("draw the square shape");
			return "msg";
		}}

public class AbsClass {
	public static void main(String[] args) {
		Square sq = new Square();
		Circle cr = new Circle();
		System.out.println("print:"+ cr.draw("fabulous"));
		System.out.println("print:"+ sq.draw("message"));

	}
}
