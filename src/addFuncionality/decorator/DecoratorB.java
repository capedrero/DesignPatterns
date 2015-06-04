package addFuncionality.decorator;

public class DecoratorB implements IOperation {
	private Component component;

	public DecoratorB(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void operation() {
		component.operation();
		otherOperation();
	}

	private void otherOperation() {
		System.out.println("Comportamiento añadido B");
	}
	
}
