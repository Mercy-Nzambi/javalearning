import java.util.Scanner;

public class Main {

    public static void main(){
        //calculate area of a rectangle

        double length = 0;
        double width = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your length: ");
        length = scanner.nextDouble();

        System.out.print("Enter your width: ");
        width = scanner.nextDouble();

        area = width * length;

        System.out.println("The area is " + area);


        scanner.close();
    }
}