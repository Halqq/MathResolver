package dev.halq.Calculator.Utils;

import static dev.halq.Utils.CmdUtil.*;

/**
 * @author Halq
 * @since 15/09/2022
 */

public class CalcUtil {

    public static void calcq(String operator, double value, double value2){
        switch (operator){

         case "*":
             calc(value * value2);
             break;

         case "+":
             calc(value + value2);
             break;

         case "-":
             calc(value - value2);
             break;

         case "/":
             if(value == 0 || value2 == 0) {
                 print("Impossible to divide number by 0");

             } else {
                 calc(value / value2);

             }
             break;

         case "%":
             calc(value % value2);
             break;
        }
    }
}