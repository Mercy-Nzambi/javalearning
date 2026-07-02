public class MyRunnable implements Runnable{
    private final String gamePlay;

    MyRunnable(String gamePlay){
        this.gamePlay = gamePlay;
    }

    @Override
    public void run() {


        //using this to count to 5
        for(int i = 1; i <= 5; i++){

            try {
                Thread.sleep(1000);
            }
            catch (IllegalArgumentException e){
                System.out.println("Milliseconds cannot be negative!");
            }
            catch (InterruptedException e){
                System.out.println("Current thread is interrupted!");
            }
//            System.out.println(i);

            //using this to print out either ping or pong
            System.out.println(gamePlay);
        }
    }
}
