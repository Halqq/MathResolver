package dev.halq.theorem;

import dev.halq.theorem.utils.CalcUtil;
import java.util.Scanner;

import static dev.halq.utils.CmdUtil.print;

/**
 * @author Halq
 * @since 22/09/2022
 */

public class Thales {

    public static void main(){

        Scanner reader = new Scanner(System.in);

        double f, s, t;

        print("Please put first value");

        if(!reader.hasNextDouble()){

            print("please put valid value");
            reader.hasNextDouble();

        }

        f = reader.nextDouble();

        print("Please put second value");

        if(!reader.hasNextDouble()){

            print("please put valid value");
            reader.hasNextDouble();

        }

        s = reader.nextDouble();

        print("Please put tree value");

        if(!reader.hasNextDouble()){

            print("please put valid value");
            reader.hasNextDouble();

        }

        t = reader.nextDouble();


        CalcUtil.calcThalesThoremWhitX(f, s, t);
    }
}
