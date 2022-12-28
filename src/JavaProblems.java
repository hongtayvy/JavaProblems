import demo.ReturnCharacterDemo;
import problem.EquationProblem;
import problem.EquationReadFileProblem;
import problem.test;

import java.io.IOException;

import static demo.ReturnCharacterDemo.runReturnCharacterDemo;
import static problem.EquationProblem.runEquationProblem;
import static problem.EquationReadFileProblem.runEquationReadFileProblem;
import static problem.StringProblem.runStringProblem;

public class JavaProblems {
    public static void main(String[] args) {
        EquationProblem.runEquationProblem();
        ReturnCharacterDemo.runReturnCharacterDemo();
        //can you explain why there is an unhandled exception in the following class and what that means? -S
        EquationReadFileProblem.runEquationReadFileProblem();
    }
}