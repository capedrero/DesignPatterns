package behaviour.selection.strategyModifiedRemoveIf;

import behaviour.selection.strategyModifiedRemoveIf.actions.FactoryStrategies;


public class Main {

	public static void main(String[] args) {
		
		// Asignamos la estrategia aunque esto debería de hacerse por Factoría.				
		System.out.println(new FactoryStrategies().execute(args[0].toUpperCase()));
		
	}

}
