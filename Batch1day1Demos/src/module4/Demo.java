package module4;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		//al.add("Naveen");
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		Demo d=new Demo();
		int p=d.sum(al);
		System.out.println("Sum"+p);


	}

	private int sum(ArrayList<Integer> al) {
		int x,y=0;
		for(Integer o:al)
		{
		//	Integer i=		(Integer)o;//Downcasting
			x=o;//AutoUnBoxing
           y+=x;
		}
		// TODO Auto-generated method stub
		return y;
	}
}
