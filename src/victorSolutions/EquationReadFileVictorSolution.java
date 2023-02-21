package victorSolutions;

import utils.BasicFileReader;

import java.io.IOException;

/**
 * I first reorganized the methods based on when I call them in my public method runEquationReadFileProblem(). Even though the code can read where the method is,
 * I organized the code, so it will read top down. This means that all my methods I call first start at the beginning on the code which when moving down you'll be able to
 * read the rest of it.
 */
public class EquationReadFileVictorSolution {

    /**
     * constructData will now remove the 1. 2. 3. at the beginning of the data. That portion of data is irrelevant so we will remove them.
     * I have short-handed adding the equations to the array for easy reading.
     * @param equationData
     * @return
     */
    private static String[] constructData(String equationData) {
        String[] cleanEquationData = new String[3];
        int endFirstEquation = equationData.indexOf("\n");
        int endSecondEquation = equationData.lastIndexOf("\n");

        String firstEquationFull = equationData.substring(3, endFirstEquation);
        String secondEquationFull = equationData.substring(endFirstEquation + 4, endSecondEquation);
        String thirdEquationFull = equationData.substring(endSecondEquation + 4);

        cleanEquationData[0] = firstEquationFull;
        cleanEquationData[1] = secondEquationFull;
        cleanEquationData[2] = thirdEquationFull;

        return cleanEquationData;
    }

    /**
     * verifyEquation now has only 1 purpose. It will read the passed equation data and verify the equation. I've renamed the variables for better understanding.
     * Along with that, I've removed the trim() calls as I've made changes to the substring methods to handle the white spacing. When comparing the answerOfEquation to the
     * actualAnswer, I've kept them as integers so Java can handle the math instead of comparing strings.
     * @param cleanEquationData
     */
    private static void verifyEquation(String cleanEquationData) {
        int indexOfOperator = cleanEquationData.indexOf('+');
        int indexOfEquals = cleanEquationData.indexOf('=');

        String leftPartOfEquation = cleanEquationData.substring(0, indexOfOperator - 1);
        String rightPartOfEquation = cleanEquationData.substring(indexOfOperator + 2, indexOfEquals - 1);
        String answerOfEquation = cleanEquationData.substring(indexOfEquals + 2);

        int actualAnswer = Integer.parseInt(leftPartOfEquation) + Integer.parseInt(rightPartOfEquation);
        if (actualAnswer == Integer.parseInt(answerOfEquation)) {
            System.out.println("The equation " + cleanEquationData + " is correct.");
        } else {
            System.out.println("The equation " + cleanEquationData + " is incorrect. The answer should be " + actualAnswer + ".");
        }
    }

    /**
     * I've now read, construct, and use verifyEquation in a for loop in the runEquationReadFileProblem. This allows all my other code to do the work and come back to the public
     * method in which will run through the for loop.
     * @throws IOException
     */
    public static void runEquationReadFileVictorSolution() throws IOException {
        String equationData = BasicFileReader.readFile("src/data/equation.txt");
        String[] cleanEquationData = constructData(equationData);
        for (int i = 0; i < cleanEquationData.length; i++) {
            verifyEquation(cleanEquationData[i]);
        }
    }

}
