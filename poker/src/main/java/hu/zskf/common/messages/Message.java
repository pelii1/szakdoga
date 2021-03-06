package hu.zskf.common.messages;

import lombok.Getter;

@Getter
public enum Message {
    INVALID_CARD_INDEX_POINTER("The pointer value is invalid!"),
    INVALID_CARD_VALUE_MODULO("The CardValue modulo is invalid (modulo = %s)!"),
    INVALID_CARD_COLOR_DIV("The CardColor div is invalid (div = %s)!"),
    INVALID_CARD_COLOR_CODE("The CardColor code is invalid (code = '%s')!"),
    INVALID_CARD_VALUE_CODE("The CardValue code is invalid (code = '%s')!");

    String code;

    Message(String code) {
	this.code = code;
    }

    public String getMessageString(Object[] params) {
	return String.format(getCode(), params);
    }

    public String getMessageString() {
	return getCode();
    }
}
