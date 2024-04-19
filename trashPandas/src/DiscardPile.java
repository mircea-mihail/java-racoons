import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DiscardPile
{
    private List<Card> pile;

    public DiscardPile()
    {
        pile = new ArrayList<>();
    }
    public void addCard(Card card)
    {
        pile.addLast(card);
    }
    public Card GetRandomCard()
    {
        if(pile.isEmpty())
        {
            return null;
        }

        Random random = new Random();
        int cardIdxToRemove = random.nextInt(pile.size());
        return pile.remove(cardIdxToRemove);
    }

    public void showPileElements()
    {
        int idx = 0;
        List<Card> uniqueCardsToShow = new ArrayList<>();

        for(Card card : pile)
        {
            boolean foundOne = false;
            for(Card checkCard : uniqueCardsToShow)
            {
                if(checkCard.getTitle() == card.getTitle())
                {
                    foundOne = true;
                }
            }
            if(!foundOne)
            {
                uniqueCardsToShow.add(card);
            }
        }
        Collections.sort(uniqueCardsToShow);
        for(Card card : uniqueCardsToShow)
        {
            System.out.println(card.getTitle());
        }
    }

    public int getSize()
    {
        return pile.size();
    }

    public Card getCard(int idx)
    {
        if(pile.isEmpty())
        {
            System.out.println("Pile is empty");
            return null;
        }
        if(idx >= pile.size())
        {
            idx = pile.size() - 1;
            System.out.println("Index out of bounds, returning last card");
        }
        return pile.remove(idx);
    }

}
