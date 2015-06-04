package behaviour.command;

import java.awt.Color;

public class SemaphoreGreen implements Command{
	private Light  light;

	public SemaphoreGreen(Light  light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.setColour(Color.GREEN);
		light.printState();
	}
	@Override
	public boolean isCorrectColour(String color) {
		return color.equalsIgnoreCase("VERDE");
	}
}
