package dev.halq;

import dev.halq.Calculator.Calculator;
import dev.halq.Equation.EquationResolver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static dev.halq.Utils.CmdUtil.print;

/**
 * @author Halq
 * @since 15/09/2022
 */

public class Main {


    public static void main(String[] args) throws InterruptedException {


        Scanner reader = new Scanner(System.in);

        String r = null;

        print("Welcome for my MathResolver!!" + " Made by Halq!");
        TimeUnit.SECONDS.sleep(1);

        print("Wait.. loading MathResolver resources");
        TimeUnit.SECONDS.sleep(3);

        print("Calculator or Equation?");

        r = reader.next();

        if (r.equals("Calculator")) {
            print("Loading calculator...");
            TimeUnit.SECONDS.sleep(2);
            Calculator.calculatorMain();

        } else if (r.equals("Equation")) {
            print("Loading Equation Resolver...");
            TimeUnit.SECONDS.sleep(2);
            EquationResolver.main();

        } else {
            print("Please put valid value (Calculator or Equation)");
        }

    }
}