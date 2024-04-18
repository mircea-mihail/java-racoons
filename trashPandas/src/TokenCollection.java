import java.util.LinkedList;
import java.util.List;

public class TokenCollection
{
    List<Token> TokenList;
    public void InitTokenList()
    {
        TokenList.add(new Token("Double Stash", "Stash up to two stashable cards in your stash pile."));
        TokenList.add(new Token("Double Draw", "Draw up to two cards from the deck in play."));
        TokenList.add(new Token("Stash Or Draw", "Choose to either Stash a card or Draw a card."));
        TokenList.add(new Token("Steal", "Steal a random card from any player."));
        TokenList.add(new Token("Recycle", "Exchange this token for a token that was not previously taken."));
        TokenList.add(new Token("Free Roll", "Congrats, this does nothing."));
    }

    public boolean extractToken(String TokenName)
    {
        for(Token token : TokenList)
        {
            if(token.getName().equals(TokenName))
            {
                TokenList.remove(token);
                return true;
            }
        }
        return false;
    }

    public void reset()
    {
        TokenList.clear();

        TokenList.add(new Token("Double Stash", "Stash up to two stashable cards in your stash pile."));
        TokenList.add(new Token("Double Draw", "Draw up to two cards from the deck in play."));
        TokenList.add(new Token("Stash Or Draw", "Choose to either Stash a card or Draw a card."));
        TokenList.add(new Token("Steal", "Steal a random card from any player."));
        TokenList.add(new Token("Recycle", "Exchange this token for a token that was not previously taken."));
        TokenList.add(new Token("Free Roll", "Congrats, this does nothing."));
    }

    public TokenCollection()
    {
        TokenList= new LinkedList<Token>();
        InitTokenList();
    }

    @Override
    public String toString() {
        StringBuilder outputText = new StringBuilder();
        for(Token token : TokenList)
        {
            outputText.append(token.getName());
            outputText.append("\n");
        }
        return outputText.toString();
    }
}
