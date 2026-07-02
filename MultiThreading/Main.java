public class Main {
    public static void main(String[] args){

        Thread thread1 = new Thread(new MyRunnable("Player 1: Ping"));
        Thread thread2 = new Thread(new MyRunnable("Player 2: Pong"));
        //System.out.println("Printing to 5...");
        System.out.println("GAMEPLAY");
        thread1.start();
        thread2.start();

    }
}
