package hu.zskf.strategy;

import hu.zskf.common.enums.Action;

public interface Strategy {
	Action calculate(StrategyItem strategyItem);
}
