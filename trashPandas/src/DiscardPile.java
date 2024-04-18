import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DiscardPile
{
    List<Card> Pile;

    public DiscardPile()
    {
        Pile = new ArrayList<>();
    }
    public void AddCard(Card card)
    {
        Pile.addLast(card);
    }
    public Card GetRandomCard()
    {
        if(Pile.isEmpty())
        {
            return null;
        }

        Random random = new Random();
        int cardIdxToRemove = random.nextInt(Pile.size());
        return Pile.remove(cardIdxToRemove);
    }

    public void ShowPileElements()
    {
        int idx = 0;
        List<Card> uniqueCardsToShow = new ArrayList<>();

        for(Card card : Pile)
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

    public int GetSize()
    {
        return Pile.size();
    }

    public Card GetCard(int idx)
    {
        if(Pile.isEmpty())
        {
            System.out.println("Pile is empty");
            return null;
        }
        if(idx >= Pile.size())
        {
            idx = Pile.size() - 1;
            System.out.println("Index out of bounds, returning last card");
        }
        return Pile.remove(idx);
    }

}
