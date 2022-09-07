package problems;

public class Grocery {

    /**
     * We want to swap these grocery items around.
     * <p>
     * So we want Rice, Water, Chicken to switch to Water, Chicken, Rice
     * Do not use the for loop to just print out the changed positions
     */
    public static void runGroceryProblem() {
        String[] groceryList = {"Rice", "Water", "Chicken"};

        String temp = groceryList[0];

        groceryList[0] = groceryList[1];
        groceryList[1] = groceryList[2];
        groceryList[2] = temp;

        for (int i = 0; i < groceryList.length; i++) {
            System.out.println(groceryList[i]);
        }

    }
}
