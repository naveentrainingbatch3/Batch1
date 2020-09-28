package module4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> al=new HashSet<String>();
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
		
		al.remove(3);
		System.out.println("Collection"+al);
	
	}
}