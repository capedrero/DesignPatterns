package behaviour.command;

import java.awt.Color;

public class SemaphoreRed implements Command {
	private Light  light;

	public SemaphoreRed(Light  light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.setColour(Color.RED);
		light.printState();
	}

	@Override
	public boolean isCorrectColour(String color) {
		return color.equalsIgnoreCase("RED");
	}
	
}
