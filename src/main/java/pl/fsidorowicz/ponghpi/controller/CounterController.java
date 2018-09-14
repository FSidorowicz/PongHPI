package pl.fsidorowicz.ponghpi.controller;

import pl.fsidorowicz.ponghpi.model.Counter;

public class CounterController {

	Counter counter;
	
	public CounterController(Counter counter) {
		this.counter = counter;
	}
	
	public void handleEvent() {
		// OLD  counter.setCount(counter.getCount() + 1);
		counter.setCount();
	}
}
