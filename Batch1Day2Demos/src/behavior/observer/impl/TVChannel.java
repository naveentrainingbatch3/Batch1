package behavior.observer.impl;

import behavior.observable.Observable;
import behavior.observer.WeatherObserver;

public class TVChannel implements WeatherObserver {

	@Override
	public void doUpdate(int temperature) {
		// TODO Auto-generated method stub
		System.out.println("TVChannel are updating temperature as"+temperature);	
	}

}
