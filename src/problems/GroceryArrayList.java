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

        groceryList.set(2, "Rice");
        groceryList.set(0,"Water");
        groceryList.set(1,"Chicken");

        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }
}
