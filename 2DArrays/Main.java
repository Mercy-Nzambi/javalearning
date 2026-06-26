public class Main {
    public static void main(String [] args){
        //creating a 2d array to create a matrix that resembles a dial pad

        char telephone[][]= {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        for(char[] row : telephone) {
            for (char number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
