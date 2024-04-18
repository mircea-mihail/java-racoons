import javax.lang.model.type.NullType;
import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck
{
    private List<Card> CardsDeck;
    private final Card[] UniqueCards = {
            new StashableCard("Shiny", 3, "Steal a stashed card from a player. (Put it in your hand.)", 3, 0, 0),
            new StashableCard("Yum Yum", 5, "Force a player to continue rolling.", 4, 2, 0),
            new StashableCard("Feesh", 7, "Take a card from the discard pile.", 5, 3, 1),
            new StashableCard("Mmm Pie!", 9, "Resolve a token twice.", 6, 2, 1),
            new StashableCard("Nanners", 11, "Ignore your last roll and choose to stop.", 7, 0, 0),
            new Card("BLAMMO!", 13, "Re-roll your last die. 1 point per BLAMMO! stashed."),
            new Card("Doggo", 3, "Block a steal attempt, then draw 2 cards."),
            new Card("Kitteh", 2, "If a player tries to steal from you, steal from them instead.")
    };
    public Deck()
    {
        CardsDeck = new ArrayList<Card>();
        InitDeck();
    }
    private void InitDeck()
    {
        for(Card card : UniqueCards)
        {
            for(int i = 0; i < card.getCardsInDeck(); i++)
            {
                CardsDeck.add(card.clone());
            }
        }

        shuffleDeck();
    }
    private void ResetDeck()
    {
        CardsDeck.clear();
        InitDeck();
    }
    public void shuffleDeck()
    {
        Collections.shuffle(CardsDeck);
    }

    public Card DrawCard()
    {
        System.out.println(CardsDeck.size());
        if(CardsDeck.isEmpty())
        {
            return null;
        }
        return CardsDeck.removeLast();
    }
}
