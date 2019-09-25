import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        Question q = new Question();
        q.setText("What is the capital of france");
        q.setAnswer("paris");

        String response;

        Scanner in = new Scanner(System.in);

        q.display();
        response = in.nextLine();

        System.out.println(q.checkAnswer(response));
    }
}
