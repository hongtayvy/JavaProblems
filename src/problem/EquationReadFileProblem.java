package problem;

import utils.BasicFileReader;

import java.io.IOException;

import static utils.BasicFileReader.readFile;

public class EquationReadFileProblem {
    /**
     * We are going to build on the original equation problem we have. The big part of this we know
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
     *  - We want to construct the data for the problem. What this means is that we want to take the text in from "src/data/equations.txt"
     *    and we want to standardize how the data is formatted for code’s sake at least. This means we are going to use the constructData
     *    method to standardize data we read in.
     * @throws IOException
     */
    public static void runEquationReadFileProblem() throws IOException {
        //This now assigns the file to "shawnsEquation"
        String shawnsEquation = BasicFileReader.readFile("src/data/equation.txt");
        //This now uses the method and carries "shawnsEquation" with it to said method
        constructData(shawnsEquation);
        //This now prints "shawnsEquation" as it has been assigned in the above line using the above method.
        System.out.println(shawnsEquation);



        int leftHandOfOperation = shawnsEquation.indexOf(' ');
        int operator = shawnsEquation.indexOf('3');
        int rightHandOfOperation = shawnsEquation.indexOf('=');
        int proposedAnswer = shawnsEquation.indexOf('5');

        String modifiedFirstNumber = shawnsEquation.substring(0, leftHandOfOperation);
        String modifiedOperator = shawnsEquation.substring(leftHandOfOperation + 1, operator - 1);
        String modifiedSecondNumber = shawnsEquation.substring(operator, rightHandOfOperation - 1);
        String modifiedAnswer = shawnsEquation.substring(rightHandOfOperation + 2, proposedAnswer + 1);


        System.out.println(modifiedFirstNumber);
        System.out.println(modifiedOperator);
        System.out.println(modifiedSecondNumber);
        System.out.println(modifiedAnswer);


        //is the following(48) now correct? does 49 need to be changed as well? -S
        int answer = (leftHandOfOperation + rightHandOfOperation);
        if (answer == Integer.parseInt(modifiedAnswer)) {
            System.out.println("You have correctly answered the question, congratz.");
        } else {
            System.out.println("You have incorrectly answered, try again");
        }
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
     * @param equationData
     * @return
     */

    private static String[] constructData(String equationData){
        //This gives us a container to open "equationData" inside of.
        String [] shawnsBrain = new String[3];
        //1. equation data is the data
        //2. we see the data structure we need from the return type in the method header
            String modifiedData = new String(equationData);
        //3. we need to organize the data structure
        //This does the opening of "equationData" inside the above container and finally returns
        for(int i = 0; i < shawnsBrain.length; i++ ) {
            //System.out.println(shawnsBrain[i]);
        }
        //4. return the data structure
        return shawnsBrain;
    }

}
