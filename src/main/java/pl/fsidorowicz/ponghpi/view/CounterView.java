package pl.fsidorowicz.ponghpi.view;

import pl.fsidorowicz.ponghpi.model.Counter;
import processing.core.PApplet;

public class CounterView extends Observer {

	Counter counter;

	public CounterView(PApplet display, Counter subject) {
		super(display, subject);
		this.counter = subject;
		update();
	}

	public void update() {
		display.background(204);
		display.fill(0);
		// display.rect(counter.getCount(), 10, 10, 10);
		display.rect(counter.getCount(), counter.getYCount(), 10, 10);
		display.redraw();
	}

}
