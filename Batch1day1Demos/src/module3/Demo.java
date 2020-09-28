package module3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
	int a,b,c;
	void accept()throws ArithmeticException,InputMismatchException
	{
		Scanner sc=new Scanner(System.in);
	//	try
	//	{
		System.out.println("Accept method begin");
		
		System.out.println("Enter first Number");
		a=sc.nextInt();
		System.out.println("Enter second Number");
		b=sc.nextInt();
		c=a/b;
	/*	}
		catch(ArithmeticException ex)
		{
			System.out.println("Please enter non zero integer number");		}catch(InputMismatchException ex1)
		{
			System.out.println("Please enter Positive non decimal number");
		}
		catch(Exception e)
		{
			System.out.println("Parent class exception");
		}
		finally
		{
			sc.close();
			System.out.println("Finally block");
		}*/
		System.out.println("Result"+c);
		
		System.out.println("Accept method stop");
	}
	void display()
	{
		System.out.println("Display method");
	}
	public static void main(String[] args) {
		System.out.println("Main Method started");
		Demo d=new Demo();
		try
		{
		d.accept();
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Please enter non zero integer number");		}catch(InputMismatchException ex1)
		{
			System.out.println("Please enter Positive non decimal number");
		}
		catch(Exception e)
		{
			System.out.println("Parent class exception");
		}
		d.display();
		System.out.println("Main Method ended");
	}

}
