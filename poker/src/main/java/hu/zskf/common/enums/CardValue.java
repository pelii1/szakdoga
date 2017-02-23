package hu.zskf.common.enums;

import org.apache.log4j.Logger;

import hu.zskf.common.messages.Message;
import lombok.Getter;

@Getter
public enum CardValue {
	UNKNOWN(CardValue.UNKNOWN_CARD_VALUE,-1),
	TWO(CardValue.TWO_CARD_VALUE,1),
	THREE(CardValue.THREE_CARD_VALUE,2),
	FOUR(CardValue.FOUR_CARD_VALUE,3),
	FIVE(CardValue.FIVE_CARD_VALUE,4),
	SIX(CardValue.SIX_CARD_VALUE,5),
	SEVEN(CardValue.SEVEN_CARD_VALUE,6),
	EIGHT(CardValue.EIGHT_CARD_VALUE,7),
	NINE(CardValue.NINE_CARD_VALUE,8),
	TEN(CardValue.TEN_CARD_VALUE,9),
	JACK(CardValue.JACK_CARD_VALUE,10),
	QUEEN(CardValue.QUEEN_CARD_VALUE,11),
	KING(CardValue.KING_CARD_VALUE,12),
	ACE(CardValue.ACE_CARD_VALUE,0);
	
	public static final String UNKNOWN_CARD_VALUE = "?";
	public static final String TWO_CARD_VALUE = "2";
	public static final String THREE_CARD_VALUE = "3";
	public static final String FOUR_CARD_VALUE = "4";
	public static final String FIVE_CARD_VALUE = "5";
	public static final String SIX_CARD_VALUE = "6";
	public static final String SEVEN_CARD_VALUE = "7";
	public static final String EIGHT_CARD_VALUE = "8";
	public static final String NINE_CARD_VALUE = "9";
	public static final String TEN_CARD_VALUE = "T";
	public static final String JACK_CARD_VALUE = "J";
	public static final String QUEEN_CARD_VALUE = "Q";
	public static final String KING_CARD_VALUE = "K";
	public static final String ACE_CARD_VALUE = "A";
	
	
	private static Logger logger = Logger.getLogger(CardValue.class);
	private String code;
	private int modulo;
	
	CardValue(String code,int modulo) {
		this.code = code;
		this.modulo = modulo;
	}
	
	public static CardValue decodeByCode(String code) {
		for (CardValue cardValue : CardValue.values()) {
			if (cardValue.getCode().equalsIgnoreCase(code)) {
				return cardValue;
			}
		}
		
		logger.warn(Message.INVALID_CARD_VALUE_CODE.getMessageString(new Object[] { code }));
		return CardValue.UNKNOWN;
	}
	
	public static CardValue decodeByModulo(int modulo) {
		for (CardValue cardValue : CardValue.values()) {
			if (cardValue.getModulo() == modulo) {
				return cardValue;
			}
		}
		
		logger.warn(Message.INVALID_CARD_VALUE_CODE.getMessageString(new Object[] { modulo }));
		return CardValue.UNKNOWN;		
	}
}
