package creational.factory.impl;

import creational.factory.Car;

public class EdurekaCar implements Car {

	public void start() {
		System.out.println("EdurekaCar Started");

	}

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Edureka Car is running");
	}

	public void applyBreak() {
		// TODO Auto-generated method stub
		System.out.println("Edureka Car applied breaks ");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Edureka Car Stopped");
	}

}
