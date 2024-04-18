//classes:

//  Player
//  * Card
//  *    StashableCard
//  * TokenCollection
//  * Token
//  * Die
//  * Deck
//  DiscardPile

import javax.print.attribute.standard.MediaSize;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        StashableCard Nanners = new StashableCard("Nanners", 7, "Bannana is the origin", 7, 0, 0);
        Die myDie = new Die();
        TokenCollection tokens = new TokenCollection();
        System.out.println(tokens.toString());
        for(int i = 0; i < 3; i++)
        {
            String RollRes = myDie.Roll();
            System.out.println("Rolled: " + RollRes);
            if(! tokens.extractToken(RollRes))
            {
                System.out.println("You bust loser!\n\n");
                break;
            }
            else
            {
                System.out.println(tokens.toString());
            }
        }

        System.out.println("resetting the token pile");
        tokens.reset();
        System.out.println(tokens.toString());

        Deck myDeck = new Deck();
        System.out.println(myDeck.DrawCard().getTitle());
        System.out.println(myDeck.DrawCard().getTitle());
        System.out.println(myDeck.DrawCard().getTitle());
    }
}
