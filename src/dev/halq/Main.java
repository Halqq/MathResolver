package dev.halq;

import dev.halq.calculator.Calculator;
import dev.halq.equation.EquationResolver;
import dev.halq.theorem.Thales;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static dev.halq.utils.CmdUtil.print;

/**
 * @author Halq
 * @since 15/09/2022
 */

public class Main {
    public Main(){
        super();
    }


    public static void main(String[] args) throws InterruptedException {


        Scanner reader = new Scanner(System.in);

        String r = null;

        print("Welcome for my MathResolver!!" + " Made by Halq!");
        TimeUnit.SECONDS.sleep(1);

        print("Wait.. loading MathResolver resources");
        TimeUnit.SECONDS.sleep(3);

        print("Calculator, Equation, Thales");

        r = reader.next();

        if (r.equals("Calculator")) {
            print("Loading calculator...");
            TimeUnit.SECONDS.sleep(2);
            Calculator.calculatorMain();

        } else if (r.equals("Equation")) {
            print("Loading Equation Resolver...");
            TimeUnit.SECONDS.sleep(2);
            EquationResolver.main();

        } else if(r.equals("Thales")){
            print("Loading Thales theorem");
            TimeUnit.SECONDS.sleep(1);
            Thales.main();

            } else {
            print("Please put valid value (Calculator, Equation, Thales)");
        }

    }
}