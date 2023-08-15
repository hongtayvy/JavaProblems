package basics.theo.problem;

import utils.BasicFileReader;

import java.io.IOException;

public class EquationReadFileProblem {
    /**
     * We are going to build on the original equation basics.shawn.problem we have. The big part of this we know
     * is that your code works for the specific equation. Now we are going to generalize this code to
     * handle more variations of this. This first iteration, we are going to focus on what happens
     * to the data we read in from "src/data/equations.txt". Now I have already gone and written that part of the code
     * since it's not what you're currently focusing on.
     *
     * We are going to read the whole "src/data/equations.txt". We are going to run into the following:
     *  - Limits to substring() and indexOf()
     *  - How do we make sure that a line from equation is a valid set of data
     *
     * For now, we are going to handle the reading from "src/data/equations.txt":
     *  - We want to construct the data for the basics.shawn.problem. What this means is that we want to take the text in from "src/data/equations.txt"
     *    and we want to standardize how the data is formatted for code’s sake at least. This means we are going to use the constructData
     *    method to standardize data we read in.
     * @throws IOException
     */
    public static void runEquationReadFileProblem() throws IOException {
    }

    /**
     * This method will take in the String of data we read in from "src/data/equations.txt" and convert the data properly into a String[].
     * If your string is the following for example:
     * String equationData = "1. 1 + 1 = 2\n2. 1 + 2 = 2"
     *
     * Then we want to make sure that the String [] looks like:
     * String [] equationArray = new String [2]
     * System.out.println(equationArray[0]); //This would be "1. 1 + 1 = 2"
     * System.out.println(equationArray[1]); //This would be "2. 1 + 2 = 2"
     *
     * Now I will state you could break down how you want to use the data anyway, but this is a guideline for the idea of constructing data.
     * @paramequationData
     * @return
     */

    private static void checkData(String[] cleanData) {

    }

    private static String[] constructData(String equationData){
    }

}
