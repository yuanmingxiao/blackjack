package uk.ac.brighton.uni.ab607.blackjack;

import uk.ac.brighton.uni.ab607.blackjack.Card.Rank;
import uk.ac.brighton.uni.ab607.blackjack.Card.Suit;

/**
 * Standard 52 card deck
 * 
 * @author Almas
 * @version 1.0
 */
public class Deck {

    private Card[] cards = new Card[52];
    
    public Deck() {
        refill();
    }
    
    public final void refill() {
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i++] = new Card(suit, rank);
            }
        }
    }
    
    public Card drawCard() {
        Card card = null;
        while (card == null) {
            int index = (int)(Math.random()*53);
            card = cards[index];
            cards[index] = null;
        }
        return card;
    }
}
