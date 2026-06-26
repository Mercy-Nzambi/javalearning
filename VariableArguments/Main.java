public class Main {
    public static void main(String[] args){
        //variable arguments to avoid using overloaded methods
        System.out.println(add(1, 2, 3, 3));
        System.out.println(average());
    }

    static int add(int... numbers){
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers){
        double sum = 0;
        double average = 0;

        for(double number : numbers){
            sum += number;
            average = sum / numbers.length;
        }
        ;
        return average;
    }
}
