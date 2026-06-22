import java.util.Scanner;

public class Main {
    public static void main(){
        //Circumference, surface area, volume

        //Circumference : This one is for a circle ( 2 * PI * radius)

        double radius;
        double circumference;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        circumference = Math.PI * 2 * radius;
        System.out.println("Radius: " + radius);
        System.out.printf("The circumference is %.2f", circumference);

        //Surface area: of a sphere 4 * PI * r^2

        double surfaceArea = Math.PI * (Math.pow(radius, 2)) * 4;
        System.out.printf("\nThe surface area is %.2f", surfaceArea);

        //volume: of a sphere 4/3 * PI * r^3

        double volume = Math.PI * (Math.pow(radius, 3)) * (4.0 / 3.0);
        System.out.printf("\nThe volume is %.2f", volume);





        scanner.close();


    }
}
