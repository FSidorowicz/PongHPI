package pl.fsidorowicz.ponghpi.builder;

import pl.fsidorowicz.ponghpi.view.AbstractView;

public abstract class InteractiveComponent {
	public abstract void handleEvent();
	protected AbstractView[] views;
	
	public void update() {
		for (AbstractView view : views) {
			view.update(); 
		}
	}
}
