import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static problems.FindDuplicates.runFindDuplicates;
import static problems.GroceryArrayList.runArrayListProblem;
import static problems.Grocery.runGroceryProblem;

public class JavaProblems {
    public static Map<Integer, String> constructData(){
        Map<Integer, String> rawData = new HashMap();
        Random random = new Random();
        String[] words = new String[]{"fire", "water", "earth", "air", "avatar"};

        int pointer = 0;
        while(pointer < 6){
            rawData.put(pointer, words[random.nextInt(5)]);
            pointer++;
        }
        return rawData;

    }
    public static void main(String[] args){
//        runStringVariableProblem();
//        runArrayProblem();
//        runGroceryProblem();
//        runArrayListProblem();
        runFindDuplicates(constructData());
    }
}
