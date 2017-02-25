package hu.zskf.card;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DealerTest {
    final static String card1 = "Tc";
    final static String card2 = "2h";
    final static String card3 = "Kc";
    final static String card4 = "4d";
    final static String card5 = "As";
    final static String card6 = "4h";
    final static String card7 = "9s";
    final static String card8 = "Jh";
    final static String card9 = "3c";
    final static String card10 = "8s";

    @InjectMocks
    private Dealer underTest;

    private Card[] cards;

    @Before
    public void setUp() {
	initCards();

	// underTest = new Dealer();
	Dealer underTest = Mockito.spy(new Dealer());
	when(underTest.mixCards()).thenReturn(cards);
    }

    private void initCards() {
	cards = new Card[10];

	cards[0] = Card.createInstance(card1);
	cards[1] = Card.createInstance(card2);
	cards[2] = Card.createInstance(card3);
	cards[3] = Card.createInstance(card4);
	cards[4] = Card.createInstance(card5);
	cards[5] = Card.createInstance(card6);
	cards[6] = Card.createInstance(card7);
	cards[7] = Card.createInstance(card8);
	cards[8] = Card.createInstance(card9);
	cards[9] = Card.createInstance(card10);
    }

    @Test
    public void testCards() {

	underTest.initCards();

	assertEquals(underTest.getCardCount(), 10);
    }

}
