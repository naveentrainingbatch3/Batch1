package creational.factory;

import creational.factory.impl.AmdocsCar;
import creational.factory.impl.EdurekaCar;

public class CarFactory {

	public Car getCar(String carName)
	{
		if(carName==null)
		{
			return null;
		}
		else if(carName.equalsIgnoreCase("EdurekaCar"))
		{
			return new EdurekaCar();
		}
		else if(carName.equalsIgnoreCase("AmdocsCar"))
		{
			return new AmdocsCar();
		}
		else
		{
		return null;
		}
	}
}
