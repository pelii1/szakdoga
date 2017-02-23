package card;

import static org.junit.Assert.*;

import org.junit.Test;

import hu.zskf.card.Card;
import hu.zskf.common.enums.CardColor;
import hu.zskf.common.enums.CardValue;

public class CardTest {

	private final static String INVALID_CARD = "xy";
	@Test
	public void testCreateFromString() {
		CardValue cardValue = CardValue.ACE;
		CardColor cardColor = CardColor.CLUB;
		
		Card underTest = Card.createInstance(cardValue.getCode() + cardColor.getCode());
		
		Card expected = Card.builder()
				.cardColor(cardColor)
				.cardValue(cardValue)
				.build();
		
		assertEquals(underTest,expected);
	}
	
	@Test
	public void testToString() {
		CardValue cardValue = CardValue.THREE;
		CardColor cardColor = CardColor.DIAMOND;
		
		Card underTest = Card.createInstance(cardValue.getCode() + cardColor.getCode());
		String expected = cardValue.getCode() + cardColor.getCode();
		
		assertEquals(underTest.toString(),expected);
	}
	
	@Test
	public void testEmptyCard() {
		Card underTest = Card.createInstance(INVALID_CARD);
		assertEquals(underTest,Card.getEmptyCard());
		
		underTest = Card.createInstance(null);
		assertEquals(underTest,Card.getEmptyCard());
		
		System.out.println(Card.builder());
	}
	
	@Test
	public void testCompare() {
		Card underTest = Card.createInstance("Td");
		
		Card lessCard = Card.createInstance("4s");
		Card biggerCard = Card.createInstance("Jc");
		
		
		assertTrue(underTest.compareTo(lessCard) > 0);
		assertTrue(underTest.compareTo(biggerCard) < 0);
		assertEquals(underTest.compareTo(underTest),0);
	}
}
