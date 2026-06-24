import java.util.Scanner;

public class Main {

    // Added String[] args here
    public static void main(String[] args) {

        boolean isStudent;
        boolean isSenior;
        double price;
        double discount;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the price of your ticket: ");
        price = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        System.out.print("Are you a senior? (true/false): ");
        isSenior = scanner.nextBoolean();


        if (isStudent && isSenior) {
            discount = 0.30 * price;
            price = price - discount;
            System.out.println("You are eligible for both a student and a senior discount.");
            System.out.printf("The discount is %.2f\n", discount);
            System.out.printf("Discounted price is %.2f\n", price);
        }

        else if (isSenior) {
            discount = 0.20 * price;
            price = price - discount;
            System.out.println("You are eligible for a senior discount.");
            System.out.printf("The discount is %.2f\n", discount);
            System.out.printf("Discounted price is %.2f\n", price);
        }

        else if (isStudent) {
            discount = 0.10 * price;
            price = price - discount;
            System.out.println("You are eligible for a student discount.");
            System.out.printf("The discount is %.2f\n", discount);
            System.out.printf("Discounted price is %.2f\n", price);
        }

        else {
            System.out.println("You are not eligible for a discount.");
            System.out.printf("Price: %.2f\n", price);
        }

        scanner.close();
    }
}