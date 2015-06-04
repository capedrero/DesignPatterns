package addFuncionality.decorator;

public class Component implements IOperation{

	public Component() {
		super();
	}

	@Override
	public void operation() {
		  System.out.println("Component.operacion()");
	}
	

}
