import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //Weight Conversion

        int choice;
        double kilograms;
        double pounds;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Conversion");
        System.out.println("Choice 1: Kilograms to pounds.");
        System.out.println("Choice 2: Pounds to kilograms.");
        System.out.print("Type out your choice: ");
        choice = scanner.nextInt();

        if (choice == 1){

            System.out.println("Converting kilograms to pounds");
            System.out.print("Enter the kilograms: ");
            kilograms = scanner.nextDouble();

            pounds = kilograms * 2.20;

            System.out.printf("Kilograms: %.2fkg\tPounds: %.2flb", kilograms, pounds);

        }

        else if(choice == 2){

            System.out.println("Converting pounds to kilograms");
            System.out.print("Enter the pounds: ");
            pounds = scanner.nextDouble();

            kilograms = pounds * 0.45;

            System.out.printf("Pounds: %.2flb\tKilograms: %.2fkg", pounds, kilograms);
        }
        else{
            System.out.println("Kindly select either 1 or 2.");
        }




        scanner.close();

    }

}
