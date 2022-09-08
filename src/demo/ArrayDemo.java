package demo;

public class ArrayDemo {
    /**
     * This method creates a simple array with 3 integers that are all 1.
     * From here, we go on and use a for loop to add the numbers in the array together.
     *
     * The total should print out 3.
     */
    public static void runArrayProblem(){
        int[] numbers = new int [3]; //this created 3 empty space

        numbers[0] = 2;
        numbers[1] = 1;
        numbers[2] = 2;

        int total = 0;

        for(int i = 0; i < numbers.length; i++){
            int valueOfPostion = numbers[i]; //array[position in the array]
            total = total + valueOfPostion;
        }

        System.out.println("Total is: " + total);
    }
}
