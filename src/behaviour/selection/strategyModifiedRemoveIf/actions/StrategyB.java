package behaviour.selection.strategyModifiedRemoveIf.actions;


public class StrategyB implements IStrategy{

	public StrategyB() {
		super();
	}
	@Override
	public String behaviour() {
		return "Soy la estrategia B";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj !=null && obj instanceof String){
			obj.toString().toUpperCase().contains("B");
		}
		return super.equals(obj);
	}

}
