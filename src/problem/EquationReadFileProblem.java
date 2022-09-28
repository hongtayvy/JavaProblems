package problem;

import java.io.IOException;

import static utils.BasicFileReader.readFile;

public class EquationReadFileProblem {
    /**
     * We are going to build on the original equation problem we have. The big part of this we know
     * is that your code works for the specific equation. Now we are going to generalize this code to
     * handle more variations of this. This first iteration, we are going to focus on what happens
     * to the data we read in from "data/equations.txt". Now I have already gone and written that part of the code
     * since it's not what you're currently focusing on.
     *
     * We are going to read in the singular line from "data/equations.txt" from there I want you to now handle
     * any issues that arise.
     * @throws IOException
     */
    public static void runEquationReadFileProblem() throws IOException {
        String shawnsEquation = readFile("data/equation.txt");

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

        //This takes the modified ints that were touched in the strings, so it's wrong.
        //System.out.println("this is the correct answer " + (leftHandOfOperation + rightHandOfOperation));

        int answer = (Integer.parseInt(modifiedFirstNumber) + Integer.parseInt(modifiedSecondNumber));
        if (answer == Integer.parseInt(modifiedAnswer)) {
            System.out.println("You have correctly answered the question, congratz.");
        } else {
            System.out.println("You have incorrectly answered, try again");
        }
    }
}
