package basics.debug;

import utils.BasicFileReader;

import java.io.IOException;

public class EquationReadFileVictorDebug {
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
    private static void verifyEquation(String cleanEquationData) {
        int indexOfOperator = cleanEquationData.indexOf('+');
        int indexOfEquals = cleanEquationData.indexOf('=');

        String leftPartOfEquation = cleanEquationData.substring(0, indexOfOperator - 1);
        String rightPartOfEquation = cleanEquationData.substring(indexOfOperator + 2, indexOfEquals - 1);
        String answerOfEquation = cleanEquationData.substring(indexOfEquals + 2, indexOfEquals + 3);

        int actualAnswer = Integer.parseInt(leftPartOfEquation) + Integer.parseInt(rightPartOfEquation);
        if (actualAnswer == Integer.parseInt(answerOfEquation)) {
            System.out.println("The equation " + cleanEquationData.trim() + " is correct.");
        } else {
            System.out.println("The equation " + cleanEquationData + " is incorrect. The answer should be " + actualAnswer + ".");
        }
    }

    public static void runEquationReadFileVictorDebug() throws IOException {
        String equationData = BasicFileReader.readFile("src/data/equation2.txt");
        String[] cleanEquationData = constructData(equationData);
        for (int i = 0; i < cleanEquationData.length; i++) {
            verifyEquation(cleanEquationData[i]);
        }
    }
}

    /* Exception in thread "main" java.nio.file.NoSuchFileException: src\data\equation2.txt >>>>>>
        <<<<< improper file name assignment

        at debug.EquationReadFileVictorDebug.constructData(EquationReadFileVictorDebug.java:19) >>>>>>
        <<<<< invalid array assignment

        debug.EquationReadFileVictorDebug.runEquationReadFileVictorDebug(EquationReadFileVictorDebug.java:43)>>>>>
        <<<<< incorrect starting position for loop given parameters of said loop

            System.out.println("The equation " + cleanEquationData + " is correct.");>>>>>
            <<<<< first half of equation is cut and is only read with '.trim' added to cleanEquationData due to return already installed on cleanEquationData?
     */
