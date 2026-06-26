import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //interactive quiz game

        Scanner scanner = new Scanner(System.in);

        System.out.println("**************************");
        System.out.println("WELCOME TO THE DAILY QUIZ");
        System.out.println("**************************");

        String [] questions = {
                "1. Where are the pyramids of Giza located?\n",
                "2. Which animal meows?\n",
                "3. Who is the father of computers?\n"
        };

        String [][] choices=  {
                {"a. Sudan\nb. Egypt\nc. Ghana\nd. Kenya\n"},
                {"a. Lion\nb. Hen\nc. Goose\nd. Cat\n"},
                {"a. Alan Turing\nb. Charles Babbage\nc. Steve Jobs\nd. Elon Musk\n"}
        };

        char userGuess ;
        int totalCorrect = 0;
        char [] correctChoice = {'b', 'd', 'b'};

        for(int i = 0; i < questions.length; i++){
            System.out.print(questions[i]);

            for(String choice : choices[i]) {
                System.out.print(choice);
            }

            System.out.print("Enter your answer: ");
            userGuess = scanner.next().charAt(0);

            if(userGuess == correctChoice[i]){
                System.out.println("CORRECT!!\n");
                totalCorrect ++;
            }
            else{
                System.out.println("WRONG!!\n");
            }

        }
        System.out.println("You have completed the quiz");
        System.out.printf("You got %d out of %d correct.", totalCorrect, questions.length);
    }
}
