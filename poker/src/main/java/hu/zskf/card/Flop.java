package hu.zskf.card;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Flop {
	private Card card1;
	private Card card2;
	private Card card3;
}
