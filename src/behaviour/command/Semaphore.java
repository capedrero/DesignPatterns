package behaviour.command;

import java.util.ArrayList;
import java.util.List;



public class Semaphore{

	List<Command> lSemaphores = null;
		
	public Semaphore() {
		super();
		final Light light = new Light();
		lSemaphores = new ArrayList<Command>(){{add(new SemaphoreGreen(light));add(new SemaphoreRed(light));add(new SemaphoreYellow(light));}};
	}
	public void execute(String color){
		for (Command sem : lSemaphores) {
			if(sem.isCorrectColour(color)){
				sem.execute();
				return;
			}
		}
		System.out.println("Color no implementado");
		
	}		
	

}
