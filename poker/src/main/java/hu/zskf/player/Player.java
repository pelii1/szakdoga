package hu.zskf.player;

import hu.zskf.strategy.Strategy;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Player {
	private Strategy strategy;
	private PlayerHand playerHand;
}
