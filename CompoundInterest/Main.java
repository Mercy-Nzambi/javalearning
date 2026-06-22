import java.util.Scanner;

public class Main {

    public static void main(){
        double amount;
        double principal;
        double rate;
        double time;
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the annual interest rate: ");
        rate = scanner.nextDouble();

        System.out.println("Enter the time the money is invested: ");
        time = scanner.nextDouble();

        System.out.println("Enter the number of times interest is compounded: ");
        number = scanner.nextInt();

        amount = principal * Math.pow((1 + (rate / number) ), (number * time));
        System.out.printf("The accumulated amount is %.2f", amount);
    }
}
