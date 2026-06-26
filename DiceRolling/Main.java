import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //dice rolling

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDiceRolls;
        int total = 0; //sum of all faces the user will roll

        System.out.print("Enter the number of times you wish to roll the dice: ");
        numOfDiceRolls = scanner.nextInt();

        if(numOfDiceRolls > 0){
            System.out.println("You want to roll the dice " + numOfDiceRolls + " time(s)");
            int roll = 0;

            for(int i = 0; i < numOfDiceRolls; i++){
                roll = random.nextInt(1, 7);
                System.out.println("You rolled a " + roll);
                printDie(roll);
                total += roll;
            }

            System.out.println("Sum of all faces you rolled is: " + total);
        }
        else{
            System.out.println("Number of dice rolls must be greater than 0");
        }

    }

    public static void printDie(int roll){
        switch(roll){
            case 1 -> {
                String die1 = """
                         --------
                        |        |
                        |   ●    |
                        |        |
                         --------
                    """;
                System.out.println(die1);
            }
            case 2 -> {
                String die1 = """
                         --------
                        |         |
                        |   ● ●   |
                        |         |
                         --------
                    """;
                System.out.println(die1);
            }
            case 3 -> {
                String die3 = """
                         -----------
                        |            |
                        |   ● ● ●    |
                        |            |
                         ------------
                    """;
                System.out.println(die3);
            }
            case 4 -> {
                String die4 = """
                         -------
                        |       |
                        |  ● ●  |
                        |  ● ●  |
                        |       |
                         -------
                    """;
                System.out.println(die4);
            }
            case 5-> {
                String die5 = """
                         -----------
                        |            |
                        |   ● ● ●    |
                        |    ●  ●    |
                        |            |
                         ------------
                    """;
                System.out.println(die5);
            }
            case 6 -> {
                String die6 = """
                         -----------
                        |            |
                        |   ● ● ●    |
                        |   ● ● ●    |
                        |            |
                         ------------
                    """;
                System.out.println(die6);
            }

        }

    }
}
