package dev.halq.theorem.utils;

import dev.halq.utils.CmdUtil;

import static dev.halq.utils.CmdUtil.print;

/**
 * @author Halq
 * @since 22/09/2022
 */

public class CalcUtil {

    public static void calcThalesThoremWhitX(Double value1, Double value2, Double value3){

        double mult = value2 * value3;

        print("Result:");

        CmdUtil.calc(mult / value1);

        print("");
        print("Method:");
        print("");

        System.out.println(value1 + "x");

        System.out.println(value2 + " * " + value3 + " = " + mult);

        System.out.println(mult + " / " + value1 + "x" + " = " + mult / value1);

    }
}
