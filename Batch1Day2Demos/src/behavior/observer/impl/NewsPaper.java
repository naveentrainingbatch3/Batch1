package behavior.observer.impl;

import behavior.observer.WeatherObserver;

public class NewsPaper implements WeatherObserver {

	@Override
	public void doUpdate(int temperature) {
		// TODO Auto-generated method stub
System.out.println("NewsPaper are updating temperature as"+temperature);
	}

}
