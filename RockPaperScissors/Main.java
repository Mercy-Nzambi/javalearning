import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //rock, paper, scissors game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String [] choices = {"Rock", "Paper", "Scissors"};

        String userInput;
        String computerGenerated;
        computerGenerated = choices[random.nextInt(0, 3)];
        System.out.println(computerGenerated);

        System.out.print("Rock, paper, scissors: ");
        userInput = scanner.next();


    }
}
