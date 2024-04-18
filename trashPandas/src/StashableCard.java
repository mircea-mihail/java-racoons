public class StashableCard extends Card
{
    private int FirstPlacePoints;
    private int SecondPlacePoints;
    private int ThirdPlacePoints;
    public StashableCard(String title, int cardsInDeck, String description, int firstPlacePoints, int secondPlacePoints, int thirdPlacePoints) {
        super(title, cardsInDeck, description);

        FirstPlacePoints = firstPlacePoints;
        SecondPlacePoints = secondPlacePoints;
        ThirdPlacePoints = thirdPlacePoints;
    }

    @Override
    public String toString() {
        return "StashableCard{" + super.toString() +
                "\n\tFirstPlacePoints=" + FirstPlacePoints +
                "\n\tSecondPlacePoints=" + SecondPlacePoints +
                "\n\tThirdPlacePoints=" + ThirdPlacePoints +
                "\n}";
    }

    public int getFirstPlacePoints() {
        return FirstPlacePoints;
    }
    public int getSecondPlacePoints() {
        return SecondPlacePoints;
    }
    public int getThirdPlacePoints() {
        return ThirdPlacePoints;
    }
}
