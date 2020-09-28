package creational.factory.impl;

import creational.factory.Car;

public class AmdocsCar implements Car {

	public void start() {
		System.out.println("AmdocsCar Started");

	}

	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("AmdocsCar is running");
	}

	public void applyBreak() {
		// TODO Auto-generated method stub
		System.out.println("AmdocsCar applied breaks ");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("AmdocsCar Stopped");
	}

}
