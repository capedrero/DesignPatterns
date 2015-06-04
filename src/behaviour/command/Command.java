package behaviour.command;

public interface Command {
	void execute();	
	boolean isCorrectColour(String color);
}
