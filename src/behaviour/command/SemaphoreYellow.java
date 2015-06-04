package behaviour.command;

import java.awt.Color;

public class SemaphoreYellow implements Command{
	private Light  light;

	public SemaphoreYellow(Light  light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.setColour(Color.YELLOW);
		light.printState();
	}
	@Override
	public boolean isCorrectColour(String color) {
		return color.equalsIgnoreCase("AMBAR");
	}
	
	
}
