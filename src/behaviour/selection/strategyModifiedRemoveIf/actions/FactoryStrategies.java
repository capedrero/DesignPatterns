package behaviour.selection.strategyModifiedRemoveIf.actions;




public class FactoryStrategies{// implements IContext {	
	
	/**
	 * Este método ejecuta la estrategia adecuada.	
	 */
	
	public String execute(String key){
		IStrategy actionClass;
		try {			
			actionClass = (IStrategy) Class.forName(FactoryStrategies.this.getClass().getPackage().getName()+".Strategy"+ key).newInstance();
			return actionClass.behaviour();
		} catch (Exception e) {
			return "Invalid command: {0} "+key;
		}				
		
				
	}		


}
