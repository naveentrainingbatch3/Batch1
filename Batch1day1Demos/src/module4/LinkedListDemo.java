package module4;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();
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
		for(String str:al)
		{
			System.out.println("Welcome "+str);
		}
		al.remove("Madhura");
		System.out.println("Collection"+al);
		
		al.remove(3);
		System.out.println("Collection"+al);
		al.add(3, "Vitthal");
		System.out.println("Collection"+al);
		al.addFirst("Rekha");
		System.out.println("Collection"+al);
		al.addLast("Shikhar");
		System.out.println("Collection"+al);
	}
}
