public class Main {
    public static void main(String[] args){
        //searching for an element in an array
        int[] numbers = {1, 4, 9, 0, 3};
        int target = 2;
        boolean isFound = true;

        for(int i = 0; i < numbers.length; i++){
            if(target == numbers[i]){
                isFound = true;
                System.out.println("Target found at index " + i);
                break;
            }
        }

        isFound = false;
        if(!isFound){
            System.out.println("Element not found!");
        }

    }
}
