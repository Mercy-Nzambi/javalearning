import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();


        String userName;
        System.out.println("You have 10 seconds to enter your name");
        System.out.println("Enter your name: ");
        userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        scanner.close();

    }
}
