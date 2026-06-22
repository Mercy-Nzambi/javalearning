import java.util.Scanner;

public class Main{

    public static void main(){
        //MAD LIBS

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.next();
        System.out.print("Enter a noun(animal or person): ");
        noun1 = scanner.next();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.next();
        System.out.print("Enter a verb (action): ");
        verb1 = scanner.next();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.next();

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("I saw a " + noun1 + " chewing on a bamboo stick.");
        System.out.println("I also saw a " + adjective2 + " buffalo at the place.");
        System.out.println("The car was " + verb1);
        System.out.println("I was " + adjective3 + ".");

        scanner.close();

    }

}