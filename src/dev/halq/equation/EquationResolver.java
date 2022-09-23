package dev.halq.equation;

import java.util.Scanner;

import static dev.halq.utils.CmdUtil.print;

/**
 * @author Halq
 * @since 15/09/2022
 */

public class EquationResolver {

    public static void main() {
        Scanner reader = new Scanner(System.in);

        double a, b, c;

        print("Please give me constants");

        print("Ex: 2x - 3x - 5 = 0 , a: 2 b: -3 c: -5");

        print("a:");
        if (!reader.hasNextDouble()) {

            print("Please give valid value");
            reader.hasNextDouble();

        }

        a = reader.nextDouble();

        print("b:");
        if (!reader.hasNextDouble()) {

            print("Please give valid value");
            reader.hasNextDouble();

        }

        b = reader.nextDouble();

        print("c:");
        if (!reader.hasNextDouble()) {

            print("Please give valid value");
            reader.hasNextDouble();

        }

        c = reader.nextDouble();

        if (a != 0) {

            double r = (c - b) / a;

            print("Answer = " + r);

        } else if (b == c) {

            print("Answer = all x");

        } else {

            print("Invalid equation");

        }
    }

}