package behaviour.templateMethod;

public abstract class AbstractFather {
	/**
	 * Este metodo sirve como plantilla para la ejecución particular de las hijas.
	 * Pudiendo situar métodos comunes.
	 */
	void templateMethod() {
		operation1();
		operation2();
		operationComun();
	}

	void operationComun() {
		System.out.println("Esta operación es común a todos");
	}

	abstract void operation1();

	abstract void operation2();
}
