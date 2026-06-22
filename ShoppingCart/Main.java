import java.util.Scanner;

public class Main {
    public static void main(){

        //SHOPPING CART

        String item;
        int quantity;
        double price;
        double total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What would you like to buy?");
        item = scanner.next();
        System.out.print("How many " + item + "/s" + " do you want?");
        quantity = scanner.nextInt();
        System.out.print("Enter the price for each: ");
        price = scanner.nextDouble();
        System.out.println("You have bought " + quantity + " " + item + "/s.");
        System.out.println("Price for each is: " + price);
        total = quantity * price;
        System.out.println("Your total is: " + total);



    }

}
