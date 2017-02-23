package hu.zskf.common.enums;

import org.apache.log4j.Logger;

import hu.zskf.common.messages.Message;
import lombok.Getter;

@Getter
public enum CardColor {
	UNKNOWN(CardColor.UNKNOWN_CARD_COLOR,-1),
	HEART(CardColor.HEART_CARD_COLOR,0),
	SPADE(CardColor.SPADE_CARD_COLOR,1),
	DIAMOND(CardColor.DIAMOND_CARD_COLOR,2),
	CLUB(CardColor.CLUB_CARD_COLOR,3);
	
	static Logger logger = Logger.getLogger(CardColor.class);
	
	public static final String HEART_CARD_COLOR = "h";
	public static final String SPADE_CARD_COLOR = "s";
	public static final String DIAMOND_CARD_COLOR = "d";
	public static final String CLUB_CARD_COLOR = "c";
	public static final String UNKNOWN_CARD_COLOR = "?";
	
	private String code;
	private int div;
	
	CardColor(String code,int div) {
		this.code = code;
		this.div = div;
	}
	
	public static CardColor decodeByCode(String code) {
		for(CardColor cardColor : CardColor.values()) {
			if (cardColor.getCode().equalsIgnoreCase(code)) {
				return cardColor;
			}
		}
		
		logger.warn(Message.INVALID_CARD_COLOR_CODE.getMessageString(new Object[] {code}));
		return CardColor.UNKNOWN;
	}
	
	public static CardColor decodeByDiv(int div) {
		for(CardColor cardColor : CardColor.values()) {
			if (cardColor.getDiv() == div) {
				return cardColor;
			}
		}
		
		logger.warn(Message.INVALID_CARD_COLOR_CODE.getMessageString(new Object[] {div}));
		return CardColor.UNKNOWN;
	}
	
}
