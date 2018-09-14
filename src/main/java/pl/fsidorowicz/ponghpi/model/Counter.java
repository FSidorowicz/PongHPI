package pl.fsidorowicz.ponghpi.model;

import pl.fsidorowicz.ponghpi.view.Observer;

import java.util.ArrayList;
import java.util.List;


public class Counter implements Subject {

	private int count = 0;
	private int countY = 10;
	private List<Observer> observers = new ArrayList<Observer>();

	public int getCount() {
		return count;
	}
	
	public int getYCount() {
		if ( count >= 200 ) {
			countY = countY + 10;
			count = 0;
		}
		return countY;
	}
	
	public void setCount() {
		this.count = count + 20;
		notifyAllObservers();
	}
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);	
	}
	
	@Override
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
