package behaviour.command;

/**
 * Este patrón de comportamiento, se suele utilizar para lanzar varias
 * ejecuciones a la vez.
 * 
 * @author x584225
 * 
 */
public class Main {
	public static void main(String[] args) {
		new Semaphore().execute("AMBAR");
	}
}
