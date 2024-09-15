package assignments3.except.handler;
class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
public String toString() {
	return "person{person name = '"+name +"', person age ='"+age+"'}";
}
}
public class StRepresent {
	public static void main(String args[]) {
		Person p1 = new Person("devi", 1234);
		Person p2 = new Person("suji",1254);
		Person p3 = new Person("deeps", 1238);
	   System.out.println(p1);
	   System.out.println(p2);
	   System.out.println(p3);
	   
		
	}

}
