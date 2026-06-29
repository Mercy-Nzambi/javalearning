import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //rock, paper, scissors game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        String userInput;
        String computerGenerated;
        int numberOfPlays;

        System.out.println("ROCK PAPER SCISSORS GAME");
        System.out.print("How many times do you want to play? ");
        numberOfPlays = scanner.nextInt();

        for (int i = 1; i <= numberOfPlays; i++) {

            computerGenerated = choices[random.nextInt(0, 3)];

            System.out.print("Select your choice: rock, paper, scissors: ");
            userInput = scanner.next().toLowerCase();

            if (userInput.equals(computerGenerated)) {
                //ties
                System.out.println("Tie");
            } else if ((userInput.equals("rock") && computerGenerated.equals("scissors"))
                    || (userInput.equals("paper") && computerGenerated.equals("rock"))
                    || (userInput.equals("scissors") && (computerGenerated.equals("paper")))) {
                System.out.println("You win");
            } else {
                System.out.println("You lose!");
            }

        }
        scanner.close();
    }
}
