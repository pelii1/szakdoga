package hu.zskf.card;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Builder
public class Board {
	@Getter private Flop flop;
	@Getter private Turn turn;
	@Getter private River river;
	
	private List<Byte> cards = new ArrayList<Byte>();
	
	public void initCards() {
		for(byte index = 1;index <53;index++) {
			cards.add(index);
		}
	}
	
	public Card getNewCard() {
		return null;
	}
}
