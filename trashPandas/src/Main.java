//classes:

//  Player
//  * Card
//  *    StashableCard
//  TokenStack
//  * Token
//  * DierandomFace
//  Deck
//  DiscardPile

import javax.print.attribute.standard.MediaSize;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        StashableCard Nanners = new StashableCard("Nanners", 7, "Bannana is the origin", 7, 0, 0);
        Die myDie = new Die();
        System.out.println(myDie.Roll());
    }
}
