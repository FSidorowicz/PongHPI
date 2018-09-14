package pl.fsidorowicz.ponghpi.model;

import pl.fsidorowicz.ponghpi.view.Observer;

public interface Subject {
	void attach(Observer observer);
	void notifyAllObservers();
}
