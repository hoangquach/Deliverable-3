package cardgameweek4;
/**
 * A class to handle the user interaction for the Card
 * project. Contains a main method that generates a card hand
 * and then iterates over it to print its contents to the console.
 * @author dancye, 2019
 */
import java.util.Scanner;
public class GamePlayer {

	public static void main(String[] args) {
                Scanner scan=new Scanner(System.in);
                System.out.print("Which card do you want to create(Card or Uno): ");
                String choice=scan.nextLine();
                
                try{
                CardHand card=new CardHand(choice);
                card.generateHand();
                //generate the card
                if (choice.equals("Card")){
                
                for(Card c: card.cards)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }}
                else
                {
                for(Card c: card.cards)
                {
                    System.out.println(c.getUnoValue() + " of " + c.getUnoSuit());
                }
                }
                }
                catch (NullPointerException e)//avoid crash in program
                {System.out.println("Error!\nWrong choice");}
              
	}

}