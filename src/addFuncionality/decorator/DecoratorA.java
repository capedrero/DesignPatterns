package addFuncionality.decorator;

public class DecoratorA implements IOperation {
	private Component component;
	private String  propiedadA�adida;

	public DecoratorA(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void operation() {
		component.operation();
		propiedadA�adida = "Comportamiento a�adido A";
		System.out.println(propiedadA�adida);
	}
	
}
