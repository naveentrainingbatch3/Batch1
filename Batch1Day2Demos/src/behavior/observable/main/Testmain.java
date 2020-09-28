package behavior.observable.main;

import behavior.observable.impl.WeatherStation;
import behavior.observer.impl.NewsPaper;
import behavior.observer.impl.TVChannel;

public class Testmain {
public static void main(String[] args) {
	TVChannel observer1=new TVChannel();
	NewsPaper observer2=new NewsPaper();
	WeatherStation weatherStation=new WeatherStation(32);
	weatherStation.addObserver(observer1);
	weatherStation.addObserver(observer2);
	weatherStation.setTemperature(28);
	weatherStation.removeObserver(observer1);
	weatherStation.setTemperature(40);
}
}
