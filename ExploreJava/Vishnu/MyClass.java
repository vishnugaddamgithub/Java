package Vishnu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class MyClass {
	int id;
	String naem;
	int age;
public static void main(String[] args) {
	//Hello hello=new Hello();
	
	Rectangle rec = new Rectangle();
	Triangle tri = new Triangle();
	rec.set_values(10,10);
	tri.set_values(10,10);
	
	System.out.println("Rectangle area is "+ rec.area());
	System.out.println("Rectangle area is "+ tri.area());
	
	LinkedList<String> name=new LinkedList<String>();
	
	name.add("Vishnu");
	name.add("Vishnu2");
	name.add("Vishnu3");
	name.add("Vishnu4");
	name.addFirst("Vishnu5");
	name.addLast("Vishnu6");
	for(String x: name) {
		System.out.println(x);
		
	}
	HashSet<String> name2=new HashSet<String>();
	name2.add("vish");
	name2.add("vish2");
	name2.add("vish3");
	name2.add("vish4");
	name2.add("vish5");
	Iterator<String> itr=name2.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
