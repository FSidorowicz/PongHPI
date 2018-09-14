package pl.fsidorowicz.ponghpi.starter;


import pl.fsidorowicz.ponghpi.controller.CounterController;
import pl.fsidorowicz.ponghpi.model.Counter;
import pl.fsidorowicz.ponghpi.view.CounterView;
import pl.fsidorowicz.ponghpi.view.Observer;
import processing.core.PApplet;

public class TheApp extends PApplet {

	private Observer counterView;
	private CounterController counterController;
	private Counter counter;

	@Override
	public void settings() {
		size(200, 200);
	}

	@Override
	public void setup() {  // setup() runs once
		frameRate(30);
		counter = new Counter();
		counterController = new CounterController(counter);
		counterView = new CounterView(this, counter);
	}

	@Override
	public void draw() {
	}  // draw() loops forever, until stopped
	
	@Override
	public void mouseClicked() {
		counterController.handleEvent();
	}
}
