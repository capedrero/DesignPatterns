package behaviour.selection.strategyModifiedRemoveIf.actions;


public class StrategyA implements IStrategy {

	
	public StrategyA() {
		super();
	}
	@Override
	public String behaviour() {
		return "Soy la estrategia A";
	}	
	@Override
	public boolean equals(Object obj) {
		if(obj !=null && obj instanceof String){
			obj.toString().toUpperCase().contains("A");
		}
		return super.equals(obj);
	}
	

}
