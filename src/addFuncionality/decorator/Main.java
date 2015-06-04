package addFuncionality.decorator;

import org.junit.Test;

public class Main {
	/**
	 * Añadimos la funcionalidad pasandolo por composición a otras clases 
	 * que añaden la funcionalidad, bien sea por atributo o por método.
	 * Todos implementan la interfaz operacion.
	 */
	@Test
	public void testMain() {
		Component c = new Component();
		DecoratorA da = new DecoratorA(c);
		DecoratorB db = new DecoratorB(c);
		da.operation();
		db.operation();
	}
}
