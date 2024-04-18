public class Card implements Cloneable
{
    private final String Title;
    private final int CardsInDeck;
    private final String Description;
    public Card(String title, int cardsInDeck, String description) {
        Title = title;
        CardsInDeck = cardsInDeck;
        Description = description;
    }

    @Override
    public Card clone()
    {
        try
        {
            return (Card)super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println(e.toString());
            throw new InternalError(e);
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "Title='" + Title + '\'' +
                ", CardsInDeck=" + CardsInDeck +
                ", Description='" + Description + '\'' +
                '}';
    }

    public String getTitle() {
        return Title;
    }
    public int getCardsInDeck() {
        return CardsInDeck;
    }
    public String getDescription() {
        return Description;
    }
}
