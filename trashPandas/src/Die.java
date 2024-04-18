import javax.swing.plaf.ActionMapUIResource;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Die
{
    private String[] Faces;
    private int NumberOfFaces;
    private void InitFaces()
    {
        Faces = new String[]{"Double Stash", "Double Draw", "Stash Or Draw", "Steal", "Recycle", "Free Roll"};
        NumberOfFaces = 6;
    }

    public String Roll()
    {
        Random random = new Random();
        int randomFace = random.nextInt(NumberOfFaces);
        return Faces[randomFace];
    }
    public Die()
    {
        InitFaces();
    }
}
