import java.util.ArrayList;
import java.util.List;

public class MCQuestion extends Question{

    private List<String> choices;

    public MCQuestion()
    {
        super();
        choices = new ArrayList<>();
    }

    public void addChoice(String choice, boolean correct)
    {
        choices.add(choice);

        if(correct)
            setAnswer(choice);
    }

    @Override
    public void display()
    {
        int i = 1;

        super.display();

        for(String choice : choices)
        {
            System.out.println(i + ": " + choice);

            i++;
        }

        System.out.println();
    }
}
