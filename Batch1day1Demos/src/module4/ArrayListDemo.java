package module4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	List<String> al=new ArrayList<String>();
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
}
}