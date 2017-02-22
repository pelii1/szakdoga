package hu.zskf.common.enums;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardColorTest {

	private static final String UNKNOW_CODE = "x";
	
	@Test
	public void testDecodebyCode() {
		CardColor underTest = CardColor.decodeByCode(CardColor.CLUB_CARD_COLOR);
		
		assertEquals(underTest,CardColor.CLUB);
	}
	
	@Test
	public void testUnknowCode() {
		CardColor underTest = CardColor.decodeByCode(UNKNOW_CODE);
		
		assertEquals(underTest,CardColor.UNKNOWN);
	}

}
