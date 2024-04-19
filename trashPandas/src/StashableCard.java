public class StashableCard extends Card
{
    private final int firstPlacePoints;
    private final int secondPlacePoints;
    private final int thirdPlacePoints;

    public StashableCard(String title, int cardsInDeck, String description, int _firstPlacePoints, int _secondPlacePoints, int _thirdPlacePoints) {
        super(title, cardsInDeck, description);

        firstPlacePoints = _firstPlacePoints;
        secondPlacePoints = _secondPlacePoints;
        thirdPlacePoints = _thirdPlacePoints;
    }

    @Override
    public String toString() {
        return "StashableCard{" + super.toString() +
                "\n\tfirstPlacePoints=" + firstPlacePoints +
                "\n\tsecondPlacePoints=" + secondPlacePoints +
                "\n\tthirdPlacePoints=" + thirdPlacePoints +
                "\n}";
    }

    public int getFirstPlacePoints() {
        return firstPlacePoints;
    }
    public int getSecondPlacePoints() {
        return secondPlacePoints;
    }
    public int getThirdPlacePoints() {
        return thirdPlacePoints;
    }
}
