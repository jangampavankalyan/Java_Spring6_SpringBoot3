import java.util.Scanner;

public class QuestionService{

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the capital city of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
        questions[1] = new Question(2, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Venus", "Mars");
        questions[2] = new Question(3, "Who wrote 'Romeo and Juliet'?", "Charles Dickens", "William Shakespeare", "Mark Twain", "Jane Austen", "William Shakespeare");
        questions[3] = new Question(4, "What is the largest ocean on Earth?", "Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Arctic Ocean", "Pacific Ocean");
        questions[4] = new Question(5, "Which element has the chemical symbol 'O'?", "Gold", "Oxygen", "Silver", "Hydrogen", "Oxygen");
    }

    public void playQuiz(){
        int i=0;
        for(Question q : questions) {
            System.out.println("Question no. " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Response : ");
            selection[i] = sc.nextLine();
            i++;
        }
    }


    public void printScore(){
        int score=0;

        for(int i=0;i<questions.length;i++){
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];

            if(answer.equals(userAnswer))
                score++;
        }
        System.out.println("Your Score is : " + score);
    }
}