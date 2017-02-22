package hu.zskf.common;

import hu.zskf.common.enums.CardColor;
import hu.zskf.common.enums.CardValue;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Builder
@EqualsAndHashCode
public class Card {
	private CardColor cardColor;
	private CardValue cardValue;
	
	public static Card createInstance(String card) {
		if (card != null && card.length() == 2) {
			return Card.builder()
					.cardValue(CardValue.decodeByCode(card.charAt(0) + ""))
					.cardColor(CardColor.decodeByCode(card.charAt(1) + ""))
					.build();
		}
		 
		return getEmptyCard();
	}
	
	public static Card getEmptyCard() {
		return Card.builder()
				.cardColor(CardColor.UNKNOWN)
				.cardValue(CardValue.UNKNOWN)
				.build();
	}

	@Override
	public String toString() {
		return cardValue.getCode().toUpperCase() + cardColor.getCode().toLowerCase();
	}
}
