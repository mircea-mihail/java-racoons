public class TokenNamesService
{
    private static String[] tokenNames = new String[]{"Double Stash", "Double Draw", "Stash Or Draw", "Steal", "Recycle", "Free Roll"};

    public static String[] getTokenNamesArray()
    {
        return tokenNames.clone();
    }
}
