import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        //calculator using enhanced switches
        double numOne;
        double numTwo;
        double total = 0;
        char operator;
        boolean inputIsValid = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        numOne = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, /, *, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second integer: ");
        numTwo = scanner.nextDouble();

        switch (operator){
            case '+' -> total = numTwo + numOne;
            case '-' -> total = numTwo - numOne;
            case '/' -> {
                if(numTwo == 0){
                    System.out.println("Cannot divide by zero.");
                    inputIsValid = false;
                }
                else{
                total = numOne / numTwo;
                }
            }
            case '*' -> total = numTwo * numOne;
            case '^' -> total = Math.pow(numOne, numTwo);
            default -> {
                System.out.println("Invalid input");
                inputIsValid = false;
            }
        }

        if(inputIsValid){
            System.out.println("Result: " + total);
        }

        scanner.close();

    }

}
