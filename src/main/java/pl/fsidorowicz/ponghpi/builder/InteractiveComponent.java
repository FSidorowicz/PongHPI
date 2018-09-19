package pl.fsidorowicz.ponghpi.builder;

import pl.fsidorowicz.ponghpi.view.AbstractView;

public abstract class InteractiveComponent {
	public abstract void handleEvent();
	private AbstractView[] views;
}
