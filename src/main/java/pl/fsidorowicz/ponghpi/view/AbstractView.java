package pl.fsidorowicz.ponghpi.view;

import processing.core.PApplet;

public abstract class AbstractView {
	PApplet display;

	AbstractView(PApplet display) {
		this.display = display;
	}
	
	public abstract void update();
}
