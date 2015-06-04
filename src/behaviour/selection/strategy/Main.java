package behaviour.selection.strategy;

import org.junit.Test;

public class Main {
	@Test
	public void testSelection() {
	
		Context context = new Context();
		// Asignamos la estrategia aunque esto debería de hacerse por Factoría.
		context.setStrategy(new StrategyA());

		context.execute();
	}

}
