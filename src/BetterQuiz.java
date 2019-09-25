import java.util.Scanner;

public class BetterQuiz {

    public static void main(String[] args) {

        String response;
        Scanner in = new Scanner(System.in);

        Question q = new Question();
        q.setText("What is the capital of france");
        q.setAnswer("paris");

        q.display();
        response = in.nextLine();

        System.out.println(q.checkAnswer(response));

        MCQuestion mcq = new MCQuestion();
        mcq.setText("what is the capital of italy (");

        mcq.addChoice("dublin", false);
        mcq.addChoice("moscow", false);
        mcq.addChoice("rome", true);
        mcq.addChoice("london", false);

        mcq.display();
        response = in.nextLine();

        System.out.println(mcq.checkAnswer(response));
    }
}
