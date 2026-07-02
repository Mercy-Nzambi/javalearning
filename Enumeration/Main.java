import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String response;
        System.out.print("Enter the day of the week: ");
        response = scanner.next().toUpperCase();

        try{
            Day day = Day.valueOf(response);
            switch (day){
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->{
                    System.out.println("It is a weekday!");
                }
                case SATURDAY, SUNDAY -> System.out.println("It is a weekend");
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("That is not a day of the week");
        }
    }
}
