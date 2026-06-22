import java.util.Scanner;

public class Main {

    public static void main(){
        //IF STATEMENT
        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age == 18){
            System.out.println("You are now an adult.");
        }
        else if (age > 65) {
            System.out.println("You are a senior!");
        }
        else if(age > 18){
            System.out.println("You are an adult.");
        }
        else if (age < 0) {
            System.out.println("You are a baby.");
        }
        else {
            System.out.println("You are a child.");
        }

    }
}
