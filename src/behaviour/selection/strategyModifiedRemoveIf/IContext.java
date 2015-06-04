package behaviour.selection.strategyModifiedRemoveIf;

import behaviour.selection.strategyModifiedRemoveIf.actions.IStrategy;

public interface IContext {
	void execute(String tipeStrategy);
	void addStrategy(String tipeStrategy, IStrategy strategy);
}
