package creational;

public class Singleton {
	//As your JVM does the static first so its eager way
	private static Singleton instance1=new Singleton();
	//Have a private static instance variable
	private static Singleton instance;
	//Make Your constructor private
	private Singleton()
	{
		
	}
	//Have a method which will create one instance and share to various objects 
	public static Singleton getInstance()
	{
		synchronized (Singleton.class) {
			
	
		if(instance==null)
		{
		instance=new Singleton();
		}
		}
		return instance;
	}

}
