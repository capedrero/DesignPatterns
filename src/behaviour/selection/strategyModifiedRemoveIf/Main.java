package behaviour.selection.strategyModifiedRemoveIf;

import behaviour.selection.strategyModifiedRemoveIf.actions.FactoryStrategies;


public class Main {

	public static void main(String[] args) {
		
		// Asignamos la estrategia aunque esto deber�a de hacerse por Factor�a.				
		System.out.println(new FactoryStrategies().execute(args[0].toUpperCase()));
		
	}

}
