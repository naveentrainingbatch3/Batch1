package creational.factory.main;

import creational.factory.Car;
import creational.factory.CarFactory;

public class FactoryMain {
public static void main(String[] args) {
	CarFactory carfactory=new CarFactory();
	Car c1=carfactory.getCar("Edurekacar");
	c1.start();
	c1.drive();
	c1.applyBreak();
	c1.stop();
	Car c2=carfactory.getCar("AmdocsCar");
	c2.start();
	c2.drive();
	c2.applyBreak();
	c2.stop();
	
}
}
