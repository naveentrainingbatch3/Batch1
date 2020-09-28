package module4;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> al=new PriorityQueue<String>();
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
		al.poll();
		
		System.out.println("Collection"+al);
al.peek();
		
		System.out.println("Collection"+al);
		
}
}
