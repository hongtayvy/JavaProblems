package problems;

public class Grocery {

    /**
     * We want to swap these grocery items around.
     *
     * So we want Rice, Water, Chicken to switch to Water, Chicken, Rice
     */
    public static void runGroceryProblem(){
        String [] groceryList = {"Rice", "Water", "Chicken"};

        for(int i = 0; i < groceryList.length; i++){
            System.out.println(groceryList[i]);
        }

    }
}
