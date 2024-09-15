//basic method
/*package methover;
class calcul{
	int add(int x, int y) {
	System.out.println("addition of 2 int numbers:"+(x+y));
	return x+y;
	}
	int add(int x, int y, int f) {
		System.out.println("addition of 3 int numbers:"+(x+y+f));
		return x+y+f;
	}
	int add( double x , double y) {
		return (int) (x+y);
	}
	
}
public class Calculator {
	public static void main(String[] args) {
		calcul cal = new calcul();
	cal.add(10, 19);
	cal.add(11,12,40);
	System.out.println("additon of 2 int:"+cal.add(14.8,20.9));

	}


}*/
/*//Overloading with Different Data Types:

  package methover;

class calcul{
	String add(String msg) {
		System.out.println("print message:"+msg);	
		return msg;
	}
	int add(int x, int y) {
		return x+y;
	}
	void add(double x, double y) {
		System.out.println("print double:"+(x+y));
	}
}
public class Calculator {
	public static void main(String[] args) {
		calcul cal = new calcul();
	cal.add("everything works fine");
	System.out.println("print sum"+cal.add(10,20));
	cal.add(10.0, 15.0);

	}

}*/

/*package methover;
//Overloading with Type Promotion
 class multiply{
  void multi(int x, int y) {
	  System.out.println("multiply int:"+(x*y));
  }
  void multi(long x, long y) {
	  System.out.println("multiply double:"+(x*y));
  }
  void multi(double x, float y) {
	  System.out.println("multiply diff two values:"+(x*y)); 
  }
  
}

public class Calculator {	
public static void main(String[] args) {
	multiply cal = new multiply();
	cal.multi(10, 20);
	cal.multi(20, 20);
	cal.multi(10, 20);
}
} */ 

/*package methover;
//overloading constructors
class Person{
	int id; String name;
	Person(){
		System.out.println("print without constructor:");	
	}
	Person(String name){
		System.out.println("print without constructor:"+ name);
	}
	Person(int id, String name){
		System.out.println("print with constructor:"+name +" "+id);
	}
	
}
public class Calculator {
	public static void main(String[] args) {
		Person per = new Person();
		Person per1 = new Person("devi");
		Person per2 = new Person(14,"durga");
		
	}
  	
}*/
/*package methover;
 //Method Overloading with Varargs
class SumCalculator{
	int i, total;
	void sum(int a, int b) {
		System.out.println("print 2 numbers:"+(a+b));
	}
	void sum(int a, int b, int c) {
		System.out.println("print 2 numbers:"+(a+b+c));
	}
	
	void sum(int... numbers) {
		for( int number :numbers) {
		 total= total+number;
		}
	
		System.out.println(total);
	}
}
public class Calculator {
	public static void main(String[] args) {
		SumCalculator sum1 = new SumCalculator();
		sum1.sum(10, 20);
		sum1.sum(10, 20, 30);
		sum1.sum(10, 20, 30, 40, 50);
	}
}*/

/*
package methover;
//6. Overloading with Different Return Types
class Converter {
	int convert(int x, int y) {
		return x+y;		
	}
	double convert(double x, double y) {
		return x-y;	
	}
	String convert(String msg) {
		return msg;
	}
}
public class Calculator {
	public static void main(String[] args) {
		Converter  c = new Converter();
		System.out.println(" print integer:"+c.convert(10, 20));
		System.out.println(" print integer:"+c.convert(20.0, 10.0));
		System.out.println(" print integer:"+c.convert("devi"));
}} */
/*package methover;
//7. Overloading in Subclasses
class Shape{
	void draw() {
		System.out.println("Draw square");
		
	}
	void rectange() {
		System.out.println("Draw rectangle");
	}
}
	class Circle extends Shape{
		
		void draw() {
			super.draw();
			System.out.println("Draw cubic");
		}
	void rectange() {
		super.rectange();
		System.out.println("Draw down rhombus");
	}}
public class Calculator {
	public static void main(String[] args) {
		Circle sc =new Circle();
		sc.draw();
		sc.rectange();
	}}*/

/*package methover;
class Ambi{
	void box(int x, int y) {
		System.out.println("add:"+(x+y));
	}
	void box(long x, String c) {
		System.out.println("add:"+(x+ c));
	}
}
public class Calculator {
	public static void main(String[] args) {
		Ambi am = new Ambi();
		am.box(10, 20);
		am.box(10L, "Hello");
		am.box(10, "Hel");
}}*/
/*
package methover;
//Overloading with Static Methods

class StaticDemo{
	static int calculate(int x, int y) {
		return x+y;
	}
	static long calculate(long x, long y) {
		return x+y;
	}
	static String calculate(String x) {
		return x;
	}

}
public class Calculator {
	public static void main(String[] args) {
		StaticDemo s = new StaticDemo();
		System.out.println(s.calculate(10,20));
		System.out.println(s.calculate(10L,20L));
		System.out.println(s.calculate("Devi"));
}}*/
