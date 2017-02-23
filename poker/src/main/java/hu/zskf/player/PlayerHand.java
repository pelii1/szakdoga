package hu.zskf.player;

import hu.zskf.card.Cards;
import hu.zskf.common.enums.Position;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PlayerHand {
	private Position position;
	private Cards cards;
}
