package addFuncionality.decorator;

public class DecoratorA implements IOperation {
	private Component component;
	private String  propiedadAñadida;

	public DecoratorA(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void operation() {
		component.operation();
		propiedadAñadida = "Comportamiento añadido A";
		System.out.println(propiedadAñadida);
	}
	
}
