import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;
        String name;
        boolean isRunning = true;
        double amount = 10000.00;

        System.out.print("Enter your name: ");
        name = scanner.next();

        while (isRunning) {
            System.out.println("BANKING PROGRAM");
            System.out.printf("Hello %s. What would you like to do today?\n", name);
            System.out.println("1. Show balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(amount);
                case 2 -> {
                    System.out.print("Enter the amount you wish to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    amount = deposit(amount, depositAmount);
                }
                case 3 -> {
                    System.out.print("Enter the amount you wish to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    // CRITICAL: We update 'amount' with the returned value
                    amount = withdraw(amount, withdrawAmount);
                }
                case 4 -> {
                    isRunning = false;
                    System.out.println("You have successfully exited.");
                }
                default -> System.out.println("Please select a valid choice (1 - 4).");
            }
        }
        scanner.close();
    }

    static void showBalance(double amount) {
        System.out.println("################");
        System.out.printf("Current Balance: $%.2f\n", amount);
    }


    static double deposit(double currentBalance, double increment) {
        if (increment <= 0) {
            System.out.println("Invalid amount. Deposit must be greater than 0.");
            return currentBalance;
        }

        double newBalance = currentBalance + increment;
        System.out.printf("Successfully deposited $%.2f. New Balance: $%.2f\n", increment, newBalance);
        return newBalance;
    }


    static double withdraw(double currentBalance, double decrement) {
        if (decrement <= 0) {
            System.out.println("Invalid amount. Withdrawal must be greater than 0.");
            return currentBalance;
        }
        if (decrement > currentBalance) {
            System.out.println("Transaction Denied: Insufficient funds.");
            return currentBalance;
        }

        double newBalance = currentBalance - decrement;
        System.out.printf("Successfully withdrew $%.2f. New Balance: $%.2f\n", decrement, newBalance);
        return newBalance;
    }
}