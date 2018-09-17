package pl.fsidorowicz.ponghpi.view;

import pl.fsidorowicz.ponghpi.controller.PlayerController;
import pl.fsidorowicz.ponghpi.model.PlayerModel;
import processing.core.PApplet;

public abstract class AbstractView {
	protected PApplet display;

	public AbstractView(PApplet display) {
		this.display = display;
	}
	
	public abstract void update();
}
