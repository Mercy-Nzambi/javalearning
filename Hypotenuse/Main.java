import java.util.Scanner;

public class Main {
    public static void main(){
        //HYPOTENUSE

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length a: ");
        a = scanner.nextDouble();

        System.out.print("Enter length b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((Math.pow(a, 2)) + Math.pow(b, 2));

        System.out.println("Length a: " + a);
        System.out.println("Length b: " + b);
        System.out.println("Hypotenuse: " + c);

    }
}
