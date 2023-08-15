package basics.shawn.problem;

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
        String shawnsEquation = BasicFileReader.readFile("src/data/equation.txt");
        String[] cleanData = constructData(shawnsEquation);
        checkData(cleanData);
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

        for (int i = 0; i < cleanData.length; i++) {
            System.out.println(cleanData[i]);

            int leftHandOfOperation = cleanData[i].indexOf(' ');
            int operator = cleanData[i].indexOf('+');
            int rightHandOfOperation = cleanData[i].indexOf('=');
            int proposedAnswer = cleanData[i].lastIndexOf(' ');

            System.out.println("Left hand operation is " + leftHandOfOperation);
            System.out.println(operator);
            System.out.println(rightHandOfOperation);
            System.out.println(proposedAnswer);

            String modifiedFirstNumber = cleanData[i].substring(leftHandOfOperation + 1, operator);
            String modifiedOperator = cleanData[i].substring(operator, operator + 1);
            String modifiedSecondNumber = cleanData[i].substring(operator + 2, rightHandOfOperation);
            String modifiedAnswer = cleanData[i].substring(rightHandOfOperation + 2);

            System.out.println("Here is our modified answer" + modifiedAnswer);
            String answer = String.valueOf(Integer.parseInt(modifiedFirstNumber.trim()) + Integer.parseInt(modifiedSecondNumber.trim()));

            if (answer.equals(modifiedAnswer.trim())) {
                System.out.println("You have correctly answered the question, congratz.");
            } else {
                System.out.println("You have incorrectly answered, try again");
            }
        }
    }

    private static String[] constructData(String equationData){

        int endFirstEquation = equationData.indexOf("\n");
        int endSecondEquation = equationData.lastIndexOf("\n");

        String firstEquationFull = equationData.substring(0, endFirstEquation);
        String secondEquationFull = equationData.substring(endFirstEquation + 1, endSecondEquation);
        String thirdEquationFull = equationData.substring(endSecondEquation + 1);


        String [] shawnsArray = new String[3];

        for(int i = 0; i < shawnsArray.length; i++ ) {
            switch (i) {
                case 0:
                    shawnsArray[i] = firstEquationFull;
                    break;
                case 1:
                    shawnsArray[i] = secondEquationFull;
                    break;
                case 2:
                    shawnsArray[i] = thirdEquationFull;
                    break;
            }
        }
        for(int i = 0; i < shawnsArray.length; i++ ) {
            System.out.println("final array" + shawnsArray[i]);
        }
    return shawnsArray;
    }

}
