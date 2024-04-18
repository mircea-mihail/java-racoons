import javax.swing.plaf.ActionMapUIResource;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Die
{
    private String[] faces;
    private int numberOfFaces;
    private void initFaces()
    {
        faces = TokenNamesService.getTokenNamesArray();
        numberOfFaces = 6;
    }

    public String roll()
    {
        Random random = new Random();
        int randomFace = random.nextInt(numberOfFaces);
        return faces[randomFace];
    }
    public Die()
    {
        initFaces();
    }
}
