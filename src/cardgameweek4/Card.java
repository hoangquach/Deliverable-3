package cardgameweek4;
/**
 * Starter code for the Card class.
 * To be used in Week 4.
 * @author dancye, 2019
 */

/**
 * OO Principle
 * Delegation is used to make the code reusable. In the CardHand class, there is an instance of Card.
 * The CardHand class will make the card according to the user choice. For each choice, the CardHand class will call the Card constructor responding to that card.
 */
/**
 * One feature of the code
 * By having an abstract class enum, it helps to reuse the code. 
 * It provides the ability to extend the code which gives the flexibility for the program to upgrade easily in the future.
 * Programmer does not need to override or delete the code to meet their requirement, whereas they only need to add on the new cards.
 */

public class Card {
    
        public enum Suit {HEARTS, CLUBS,SPADES,DIAMONDS};
        public enum Value{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};
        public enum UnoSuit{RED,YELLOW,GREEN,BLUE};
        public enum UnoValue{ZERO,ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,SKIP,DRAW2,DRAW4,WILDCARD,REVERSE};
        private final Object suit;
        private final Object value;
    
        
        public Card(Suit s, Value gVal)//reg card
        {
            suit =(Suit)s;
            value= (Value)gVal;
        }
        
        public Card (UnoSuit s, UnoValue v)//uno card
        {
            suit=(UnoSuit)s;
            value=(UnoValue)v;
        }
        
        public UnoValue getUnoValue() {
		return (UnoValue)this.value;
	}

	public UnoSuit getUnoSuit() {
		return (UnoSuit)this.suit;
        }
        
	public Value getValue() {
                return (Value)this.value;
	}

	
	public Suit getSuit() {
		return (Suit)this.suit;
        }
}