import java.util.Scanner;

public class Main{
    public static void main(String [] args){

        //temperature conversion using a ternary operator
        double originalTemp;
        double newTemp;
        String initialUnit;
        String targetUnit;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial temperature: ");
        originalTemp = scanner.nextDouble();
        System.out.print("Enter the initial unit(C or F): ");
        initialUnit = scanner.next();
        System.out.print("Enter the target unit(C or F): ");
        targetUnit = scanner.next();

        newTemp = (initialUnit.equals("C")) ? ((originalTemp * 9/5) + 32) : ((originalTemp - 32) * 5/9);
        System.out.printf("Initial temperature: %.1f%S\t", originalTemp, initialUnit);
        System.out.printf("Converted temperature: %.1f%S",newTemp, targetUnit);

    }
}