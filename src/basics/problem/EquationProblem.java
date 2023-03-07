package basics.problem;

public class EquationProblem {
    /**
     * We are going to build on what we know so far. This basics.problem will be taking in an equation.
     * From here, we will decipher what the equation is trying to do, and we will solve the equation.
     * The following requirements:
     * 1. Be able to split the string into 4 smaller strings. You must split the strings via indexOfs and substrings methods only.
     * Also feel free to rename variables, but you should make sure that the names make sense.
     * 1a. You will have leftHandOfOperation
     * - This will hold the value left of the operation.
     * 1b. You will have operation
     * - This will hold the value of what operation we are preforming.
     * 1c. You will have rightHandOfOperation
     * - This will hold the value right of the operation.
     * 1d. You will have proposedAnswer
     * - This will hold their suspected answer
     * 2. Once you have the values split up, you will preform the equation they proposed.
     * 3. Once you have the answer, you will compare the answer to their answer and see if it's correct.
     * 3a. If the basics.problem is correct, you will print out the message that the equation is correct.
     * 3b. If the basics.problem is incorrect, you will let them know that their equation is incorrect, and
     * you will print show them the proper solution to their proposed equation.
     * For example:
     * Equation: 1 + 2 = 4
     * <p>
     * leftHandOfOperation = 1
     * operation = +
     * rightHandOfOperation = 2
     * proposedAnswer = 4
     * <p>
     * actualAnswer = 3
     * <p>
     * Your proposed answer of 4 is incorrect. The correct answer is 3.
     * <p>
     * End Of Example
     * <p>
     * You do not need user input. You should be able to make a String of an equation and use that.
     */

    public static void runEquationProblem() {
        String shawnsEquation = "2 + 4 = 5";
        String bonusEquation = "5 + 6 = 10";
        String edward = "Edward";


        int leftHandOfOperation2 = bonusEquation.indexOf(' ');
        int operator2 = bonusEquation.indexOf('6');

        int leftHandOfOperation = shawnsEquation.indexOf(' ');
        int operator = shawnsEquation.indexOf('4');
        int rightHandOfOperation = shawnsEquation.indexOf('=');
        int proposedAnswer = shawnsEquation.indexOf('5');

        String modifiedFirstNumber = shawnsEquation.substring(0, leftHandOfOperation);
        String modifiedOperator = shawnsEquation.substring(leftHandOfOperation + 1, operator - 1);
        String modifiedSecondNumber = shawnsEquation.substring(operator, rightHandOfOperation - 1);
        String modifiedAnswer = shawnsEquation.substring(rightHandOfOperation + 2, proposedAnswer + 1);

        String modifiedFirstNumber2 = bonusEquation.substring(0, leftHandOfOperation2);
        String modifiedEdward = edward.substring(1, 6);

        System.out.println(modifiedEdward);


        System.out.println(modifiedFirstNumber);
        System.out.println(modifiedOperator);
        System.out.println(modifiedSecondNumber);
        System.out.println(modifiedAnswer);

        int answer = (Integer.parseInt(modifiedFirstNumber) + Integer.parseInt(modifiedSecondNumber));
        if (answer == Integer.parseInt(modifiedAnswer)) {
            System.out.println("You have correctly answered the question, congratz.");
        } else {
                System.out.println("You have incorrectly answered, try again");
        }
    }
}
