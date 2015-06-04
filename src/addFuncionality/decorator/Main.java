package addFuncionality.decorator;

import org.junit.Test;

public class Main {
	/**
	 * A�adimos la funcionalidad pasandolo por composici�n a otras clases 
	 * que a�aden la funcionalidad, bien sea por atributo o por m�todo.
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
