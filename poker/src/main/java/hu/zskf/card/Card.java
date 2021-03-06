package hu.zskf.card;

import hu.zskf.common.enums.CardColor;
import hu.zskf.common.enums.CardValue;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Builder
@EqualsAndHashCode
public class Card implements Comparable<Card> {
    private CardColor cardColor;
    private CardValue cardValue;

    public static Card createInstance(String card) {
	if (card != null && card.length() == 2) {
	    return Card.builder().cardValue(CardValue.decodeByCode(Character.toString(card.charAt(0))))
		    .cardColor(CardColor.decodeByCode(Character.toString(card.charAt(1)))).build();
	}

	return getEmptyCard();
    }

    public static Card createInstance(int cardId) {
	return Card.builder().cardColor(CardColor.getColorFromCardId(cardId))
		.cardValue(CardValue.getValueFromCardId(cardId)).build();
    }

    public static Card getEmptyCard() {
	return Card.builder().cardColor(CardColor.UNKNOWN).cardValue(CardValue.UNKNOWN).build();
    }

    @Override
    public String toString() {
	return cardValue.getCode().toUpperCase() + cardColor.getCode().toLowerCase();
    }

    public int compareTo(Card otherCard) {
	int result = getCardValue().compareTo(otherCard.getCardValue());
	if (result == 0) {
	    return getCardColor().compareTo(otherCard.getCardColor());
	}
	return result;
    }
}
