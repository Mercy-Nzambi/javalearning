import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        int numOfFoods;
        String food;
        System.out.print("Enter the # of foods: ");
        numOfFoods = scanner.nextInt();
        scanner.nextLine();

        for(int i = 1; i <= numOfFoods; i++){
            System.out.print("Enter food #" + i + ": ");
            food = scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);

        scanner.close();

    }
}
