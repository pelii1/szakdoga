package hu.zskf.card;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardsTest {
	@Test
	public void testShortString() {
		String[][] items = {{"th","2h","T2h"},{"2h","TH","T2h"},{"as","7d","As7d"},{"6c","Ks","Ks6c"}};
		
		for(String[] item : items) {
			Cards underTest = Cards.builder()
					.card1(Card.createInstance(item[0]))
					.card2(Card.createInstance(item[1]))
					.build();
			
			assertEquals(underTest.getShortString(),item[2]);
		}
	}
}
