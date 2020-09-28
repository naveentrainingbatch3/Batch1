package module4;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	TreeSet<String> al=new TreeSet<String>();
	al.add("Vishwesh");
	al.add("Sonal");
	al.add("Shweta");
	al.add("Surabhi");
	al.add("Falak");
	al.add("Aman");
	al.add("Ghanshyam");
	al.add("Madhura");
	al.add("Vruddhi");
	al.add("Vishwesh");
	System.out.println("Collection"+al);
	Iterator it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	al.remove("Madhura");
	System.out.println("Collection"+al);
	
	
	System.out.println("Collection"+al);


}
}
