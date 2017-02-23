package hu.zskf.card;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Cards {
	private Card card1;
	private Card card2;
	
	public String getShortString() {
		Card lessCard;
		Card biggerCard;
		
		if (card1.compareTo(card2) > 0) {
			biggerCard = card1;
			lessCard = card2;
		} else {
			biggerCard = card2;
			lessCard = card1;
		}
		
		if (biggerCard.getCardColor().equals(lessCard.getCardColor())) {
			return biggerCard.getCardValue().getCode() + lessCard.getCardValue().getCode() + biggerCard.getCardColor().getCode();
		}
		
		return biggerCard.toString() + lessCard.toString();
	}
}
