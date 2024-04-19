public class Card implements Cloneable, Comparable<Card>
{
    protected final String title;
    protected final int cardsInDeck;
    protected final String description;

    public Card(String _title, int _cardsInDeck, String _description) {
        title = _title;
        cardsInDeck = _cardsInDeck;
        description = _description;
    }
    @Override
    public int compareTo(Card other)
    {
        return this.title.compareTo(other.title);
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
                "\n\ttitle='" + title + '\'' +
                "\n\tcardsInDeck=" + cardsInDeck +
                "\n\tdescription='" + description + '\'' +
                "\n}";
    }

    public String getTitle() {
        return title;
    }
    public int getCardsInDeck() {
        return cardsInDeck;
    }
    public String getDescription() {
        return description;
    }
}
