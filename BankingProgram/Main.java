import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        //Banking program
        //using methods

        double amount = 10000;
        int choice;
        boolean isRunning = true;

        System.out.println("################");
        System.out.println("BANKING PROGRAM");
        System.out.println("################");


        while(isRunning){

            System.out.println("\nWhat would you like to do today?");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> {
                    System.out.println("Showing balance...");
                    showBalance(amount);
                }
                case 2 -> {
                    System.out.println("Deposit");
                    amount = deposit(amount);
                }
                case 3 -> {
                    System.out.println("Withdraw");
                    amount = withdraw(amount);
                }
                case 4 -> {
                    isRunning = false;
                    System.out.println("You have exited the process.");
                }
            }

        }

        scanner.close();

    }
    static void showBalance(double amount){
        System.out.printf("Balance: %.2f", amount);

    }
    static double deposit(double amount){

        double depositAmount;
        double currentAmount;

        System.out.print("Enter the amount you wish to deposit: ");
        depositAmount = scanner.nextDouble();

        if(depositAmount <= 0){
            System.out.println("Deposit amount should be greater than 0");
        }

        currentAmount = amount + depositAmount;
        System.out.printf("New balance: %.2f", currentAmount);
        return currentAmount;

    }
    static double withdraw(double amount){
        double withdrawAmount;
        double currentAmount = amount;

        if(amount <= 0){
            System.out.println("Insufficient funds. Cannot withdraw!");
            System.out.printf("Balance: %.2f", amount);
            return amount;
        }

        System.out.println("Enter the amount you wish to withdraw: ");
        withdrawAmount = scanner.nextDouble();

        if(withdrawAmount > amount){
            System.out.println("Cannot withdraw. Withdraw amount is greater than amount in the account!");
            System.out.printf("Balance: %.2f", amount);
        }
        else{
            currentAmount = amount - withdrawAmount;
            System.out.printf("New balance: %.2f", currentAmount);
        }
        return currentAmount;
    }

}