package problems;

public class Grocery {

    /**
     * We want to swap these grocery items around.
     *
     * So we want Rice, Water, Chicken to switch to Water, Chicken, Rice
     * Do not use the for loop to just print out the changed positions
     */
    public static void runGroceryProblem(){
        String [] groceryList = {"Rice", "Water", "Chicken"};
        /*
        This switches the positioning of the items technically.
        after further testing this will print one object twice.

        groceryList [0] = groceryList [1];
        groceryList [1] = groceryList [2];
        groceryList [2] = groceryList [0];

        This obviously won't print the list
        System.out.println(groceryList);
        */

        /*This would print it but I can't use it? Not sure of any other ways to print the list without this.
        I tried changing the starting position of the loop and using a while length loop to no success.
        */
        while(groceryList.length <= 3){
            for(int i = 1; i < groceryList.length; i++){
                System.out.println(groceryList[i]);
            }
            break;
        }

    }
}
