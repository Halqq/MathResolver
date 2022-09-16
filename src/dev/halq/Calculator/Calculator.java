package dev.halq.Calculator;

import dev.halq.Calculator.Utils.CalcUtil;

import java.util.Scanner;

import static dev.halq.Utils.CmdUtil.print;

/**
 * @author Halq
 * @since 15/09/2022
 */

public class Calculator {

    public static void calculatorMain() {
        double firstvalue, secondvalue;

        String op = null;
        Scanner reader = new Scanner(System.in);

        print("Please put first number");

        if (!reader.hasNextDouble()) {
            print("Please put valid value");
            reader.hasNextDouble();

        }

        firstvalue = reader.nextDouble();

        print("Please put math operator");

        op = reader.next();

        if (!(op.equals("+") || op.equals("-") || op.equals("+") || op.equals("/") || op.equals("%"))) {
            print("Please put valid operator");

        }

        print("Please put second number");

        if (!reader.hasNextDouble()) {
            print("Please put valid value");
            reader.hasNextDouble();

        }

        secondvalue = reader.nextDouble();

        print("Result: ");
        CalcUtil.calcq(op, firstvalue, secondvalue);

    }
}