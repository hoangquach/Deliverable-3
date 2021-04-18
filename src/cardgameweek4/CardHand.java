package cardgameweek4;
/**
 * a class that models the Card Hand.
 * A Card hand has an array of cards. 
 * How can you change the size of the hand? how big is it right now?
 * @suthor dancye, 2019.
 */

public class CardHand {

        
	public Card[] cards;
        private Object suit,value;

	
        /**
         * Add comments during class to explain what this method does.
         */
        public CardHand(String cardType)
        {
            if(cardType.equals("Card"))
            {
                cards=new Card[52];//reg card
            }
            else if(cardType.equals("Uno"))
            {
                cards=new Card[60];//uno
            }    
           
        }
        public void generateHand()
        {
           try{
                int length=cards.length;
                int countCards = 0;
                if(length==52){//reg card
		for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                        cards[countCards] = (new Card(s,v));
                        countCards++;
                    }
                }//end outter for
                }
                else if(length==60){//uno card
                    for (Card.UnoSuit s:Card.UnoSuit.values())
                    {
                        for(Card.UnoValue v:Card.UnoValue.values())
                        {
                            cards[countCards]=(new Card(s,v));
                            countCards++;
                        }
                    }
                }}
           catch (NullPointerException e)
           {
               
           }
        }//end method

}