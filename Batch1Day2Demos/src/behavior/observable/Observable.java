package behavior.observable;

import behavior.observer.WeatherObserver;

public interface Observable {
void addObserver(WeatherObserver weatherObserver);
void removeObserver(WeatherObserver weatherObserver);
void doNotify();
}
