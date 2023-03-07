package basics.demo.grocerydemo;

public class ArrayDemo {

    /**
     * We want to swap these grocery items around.
     * <p>
     * So we want Rice, Water, Chicken to switch to Water, Chicken, Rice
     * Do not use the for loop to just print out the changed positions
     */
    public static void runGroceryProblem() {
        //1. Create String []
        String[] groceryList = new String[3];

        //2. Insert data into array
        groceryList[0] = "Rice";
        groceryList[1] = "Water";
        groceryList[2] = "Chicken";

        /**
         * Swap First Item to Last Item Algorithm:
         * 1. We store the value of the first item in the array as a temp.
         *    This allows us to change the first item or the array and store
         *    the first item of the array away.
         *
         * Object temporaryItem = array[firstValue]
         *
         * 2. We swap the first value with the value right after it. As seen in
         *    the example, we now assign the second value to the first value's position
         *    in the array. If there are more than 2 values then you continue this step
         *    until you reach the last item in the array.
         *
         * array[firstValue] = array[secondValue]
         *
         * 3. We now set the first position's value which is currently in temporaryItem
         *    to the last spot.
         *
         * array[secondValue] = temporaryItem
         *
         */

        String temp = groceryList[0];
        groceryList[0] = groceryList[1];
        groceryList[1] = groceryList[2];
        groceryList[2] = temp;

        for (int i = 0; i < groceryList.length; i++) {
            System.out.println(groceryList[i]);
        }

    }
}
