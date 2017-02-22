package hu.zskf.common.enums;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardValueTest {

	private static final String INVALID_CARD_CODE = "r";
	
	@Test
	public void testDecodeByCode() {
		CardValue underTest = CardValue.decodeByCode(CardValue.EIGHT_CARD_VALUE);
		
		assertEquals(underTest,CardValue.EIGHT);
	}
	
	@Test
	public void testUnknownCode() {
		CardValue underTest = CardValue.decodeByCode(INVALID_CARD_CODE);
		
		assertEquals(underTest,CardValue.UNKNOWN);
	}

}
