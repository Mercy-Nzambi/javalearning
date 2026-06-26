import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        //populating an array using user input
        String[] foods;
        int size;

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many types of foods do you want to add? ");
        size = scanner.nextInt();

        foods = new String[size];

        for(int i =0; i < foods.length; i++){
            System.out.print("Enter the food: ");
            foods[i] = scanner.next();
        }

        //enhanced for loop or a for each loop
        for(String food : foods){
            System.out.printf("%s ", food);
        }

    }
}
