import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Player
{
    private final String name;
    private List<Card> cardsInHand;
    private List<Card> stashedCards;
    private List<Token> tokens;

    public Player(String _name)
    {
        name = _name;
        cardsInHand = new LinkedList<>();
        stashedCards = new LinkedList<>();
        tokens = new LinkedList<>();
    }
    public boolean takeToken(Token token)
    {
        if(tokens.contains(token))
        {
            tokens.clear();
            return false;
        }
        else
        {
            tokens.add(token);
            return true;
        }
    }

    public void resetTokens()
    {
        tokens.clear();
    }
    public int getTokensNumber()
    {
        return tokens.size();
    }
    public void stashCard(Card card)
    {
        if(card instanceof StashableCard || card.getTitle().equals("BLAMMO!"))
        {
            stashedCards.add(card);
        }
        else
        {
            System.out.println("Failed to stash card (not stashable)");
        }
    }
    public void takeCard(Card card)
    {
        cardsInHand.add(card);
    }
    public Card PlayCard(int CardIdx)
    {
        return(cardsInHand.remove(CardIdx));
    }
    public void showCards()
    {
        int i = 0;
        for(Card card : cardsInHand)
        {
            System.out.println(i + ": " + card.getTitle());
            i++;
        }
    }

    public void showTokens()
    {
        int i = 0;
        for(Token token : tokens)
        {
            System.out.println(i + ": " + token.getName());
            i ++;
        }
    }

    public String getName() {
        return name;
    }

    public Token resolveToken(int tokenIdx)
    {
        return tokens.remove(tokenIdx);
    }

}
