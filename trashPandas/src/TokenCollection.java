import java.util.LinkedList;
import java.util.List;

public class TokenCollection
{
    private List<Token> tokenList;
    public void initTokenList()
    {
        tokenList.add(new Token("Double Stash", "Stash up to two stashable cards in your stash pile."));
        tokenList.add(new Token("Double Draw", "Draw up to two cards from the deck in play."));
        tokenList.add(new Token("Stash Or Draw", "Choose to either Stash a card or Draw a card."));
        tokenList.add(new Token("Steal", "Steal a random card from any player."));
        tokenList.add(new Token("Recycle", "Exchange this token for a token that was not previously taken."));
        tokenList.add(new Token("Free Roll", "Congrats, this does nothing."));
    }

    public Token extractToken(String TokenName)
    {
        for(Token token : tokenList)
        {
            if(token.getName().equals(TokenName))
            {
                tokenList.remove(token);
                return token;
            }
        }
        return null;
    }

    public void reset()
    {
        tokenList.clear();
        initTokenList();
    }

    public TokenCollection()
    {
        tokenList = new LinkedList<Token>();
        initTokenList();
    }

    @Override
    public String toString() {
        StringBuilder outputText = new StringBuilder();
        for(Token token : tokenList)
        {
            outputText.append(token.getName());
            outputText.append("\n");
        }
        return outputText.toString();
    }
}
