package hu.zskf.card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import hu.zskf.common.Log;
import hu.zskf.common.LogData;
import hu.zskf.common.messages.Message;

public class Dealer {
    public static final int CARD_COUNT = 52;

    private Card[] cards;
    private int cardIndexPointer;

    static Logger logger = Logger.getLogger(Dealer.class);

    public void initCards() {
	cards = mixCards();
	cardIndexPointer = 0;
    }

    protected Card[] mixCards() {
	Card[] result = new Card[CARD_COUNT];

	List<Integer> numbers = new ArrayList<Integer>();
	Random random = new Random();

	for (int index = 0; index < CARD_COUNT; index++) {
	    numbers.add(index);
	}

	int idx = 0;
	while (numbers.isEmpty()) {
	    int number = random.nextInt(numbers.size());
	    result[idx] = Card.createInstance(numbers.get(number));
	    idx++;

	    numbers.remove(number);
	}

	return result;
    }

    public Card getNextCard() {
	if (cardIndexPointer >= cards.length) {
	    Log.saveLog(LogData.builder().level(Level.WARN)
		    .message(Message.INVALID_CARD_INDEX_POINTER.getMessageString()).build());

	    return Card.getEmptyCard();
	}
	return cards[cardIndexPointer++];
    }

    public int getCardCount() {
	return cards.length;
    }

    public Cards getCards() {
	return Cards.builder().card1(getNextCard()).card2(getNextCard()).build();
    }

    public Flop getFlop() {
	return Flop.builder().card1(getNextCard()).card2(getNextCard()).card3(getNextCard()).build();
    }

    public Turn getTurn() {
	return Turn.builder().card(getNextCard()).build();
    }

    public River getRiver() {
	return River.builder().card(getNextCard()).build();
    }
}
