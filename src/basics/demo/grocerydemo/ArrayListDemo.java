package basics.demo.grocerydemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    /**
     * We want to swap these grocery items around.
     * So we want Rice, Water, Chicken to switch to Water, Chicken, Rice
     * Do not use the for loop to just print out the changed positions
     */

    public static void runArrayListProblem() {
        //1. Create the array list
        List<String> groceryList = new ArrayList();

        //2. Insert data into array list
        groceryList.add("Rice");
        groceryList.add("Water");
        groceryList.add("Chicken");
        printList("original", groceryList);


        //3. Demo an arrayList.get(n) where n is an index in the arrayList
        System.out.println("Item 0: " + groceryList.get(0));

        /**
         * 4. Demo an arrayList.remove(n) where n is an index in the arrayList
         *    or arrayList.remove(object) where object is an object in the arrayList
         */

        groceryList.remove(0);
        groceryList.remove("Water");
        printList("remove", groceryList);

        //5. Demo arrayList.add(n, object) at specific index
        groceryList.add(0, "Water");
        groceryList.add(0,"Rice");
        printList("add(n, object)", groceryList);

        //6. Demo bad swap
        String temp = groceryList.get(0);
        groceryList.add(0, groceryList.get(1));
        groceryList.add(1, groceryList.get(2));
        groceryList.add(2, temp);
        printList("demo", groceryList);
    }

    private static void printList(String function, List<String> list){
        for(String item : list){
            System.out.println(function + " list: " + item);
        }
    }
}
