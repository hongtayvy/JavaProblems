package problem;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void josh (){

        List<String> numOfNumbers = new ArrayList();

        numOfNumbers.add("1");
        numOfNumbers.add("2");
        numOfNumbers.add("3");
        numOfNumbers.add("4");

        for (int i = 0; i< numOfNumbers.size(); i++ ) {
            System.out.println(numOfNumbers.get(i));
            i++;
        }
    }




}
