import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //number guessing game

        int generatedNum;
        int userNumber = 0;
        int guesses = 1;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        generatedNum = random.nextInt(1, 10);

        System.out.println("You are playing the number guessing game.");
        System.out.print("Enter your number(1 - 10): ");
        userNumber = scanner.nextInt();

        while(userNumber != generatedNum){
            System.out.println("Try again.");
            System.out.print("Enter your number: ");
            userNumber = scanner.nextInt();
            guesses = guesses + 1;
        }

        System.out.println("You guessed correctly!");
        System.out.printf("You took %d guess(s)", guesses);

        scanner.close();

    }
}
