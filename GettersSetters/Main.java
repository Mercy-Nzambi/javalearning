import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        Car car = new Car("Mazda", "Atenza", 1000000);

        System.out.print("Enter the model name: ");
        car.setModel(scanner.next());

        System.out.println(car.getMake() + " " + car.getModel() + " " + car.getPrice());

        scanner.close();
    }
}
