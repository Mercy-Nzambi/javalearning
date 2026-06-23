import java.util.Scanner;

public class Main {

    public static void main(){
        double amount;
        double principal;
        double rate;
        double timeCompounded;
        int years;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the time the money is invested: ");
        timeCompounded = scanner.nextDouble();

        System.out.print("Enter the number of years the interest is compounded: ");
        years = scanner.nextInt();

        amount = principal * Math.pow((1 + (rate / years) ), (years * timeCompounded));
        System.out.printf("The accumulated amount in %d years is $%.2f", years, amount);
    }
}
