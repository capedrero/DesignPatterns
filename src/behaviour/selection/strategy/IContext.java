package behaviour.selection.strategy;

public interface IContext {
	void execute();
	void setStrategy(IStrategy strategy);
}
