import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //creating methods to implement D.R.Y
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.next();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        happyBirthday(name, age);
        happyBirthday(name, age);

        scanner.close();

    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy birthday to you!");
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println();
    }
}
