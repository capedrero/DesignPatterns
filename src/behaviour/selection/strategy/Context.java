package behaviour.selection.strategy;

public class Context implements IContext {
	private IStrategy strategy;

	public IStrategy getStrategy() {
		return strategy;
	}

	@Override
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	/**
	 * Este método ejecuta la estrategia adecuada.
	 */
	@Override
	public void execute() {
		strategy.behaviour();
	}

}
