package problem;

import java.io.IOException;

import static utils.BasicFileReader.readFile;

public class EquationReadFileProblem {

    public static void runEquationReadFileProblem() throws IOException {
        String shawnsEquation = readFile("equation.txt");

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
