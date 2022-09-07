package problems;

import java.util.ArrayList;
import java.util.List;

public class GroceryArrayList {
    /**
     * We want to swap these grocery items around.
     * So we want Rice, Water, Chicken to switch to Water, Chicken, Rice
     * Do not use the for loop to just print out the changed positions
     */

    public static void runArrayListProblem() {
        List<String> groceryList = new ArrayList();

        groceryList.add("Rice");
        groceryList.add("Water");
        groceryList.add("Chicken");


        String temp = groceryList.get(0);
        groceryList.add(temp);
        
        groceryList.

        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }
}
