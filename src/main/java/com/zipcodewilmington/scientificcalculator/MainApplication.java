package com.zipcodewilmington.scientificcalculator;


import java.util.Scanner;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.*;
import java.math.BigDecimal;
import static com.zipcodewilmington.scientificcalculator.Calculation.*;
import static com.zipcodewilmington.scientificcalculator.Console.*;
/**
 * Created by leon on 2/9/18.
 */
public class MainApplication extends Console {
    static String options = "";
    static String xInput = "";
    static String yInput = "";
    static double x;
    static double y;
    public static void main(String[] args) {
        println("Welcome to TFT calculator!\n");
        println("| %-10s | %-10s | %-10s |", "1. Math", "2. Percent", "3. x^y");
        println("| %-10s | %-10s | %-10s |", "4. Sin", "5. Cos", "6. Tan");
        println("| %-10s | %-10s | %-10s |", "7. I-Sin", "8. I-Cos", "9. I-Tan");
        println("| %-10s | %-10s | %-10s |", "10. Log", "11. 10^x", "12. Ln");
        println("| %-10s | %-10s | %-10s |", "13. e^x", "14. !n", "15. Pi");
        println("| %-10s   |  %-10s   |", "16. Fun mode 1", "17. Fun mode 2");
        print("\nPlease choose from the following menu:");
        options = getStringInput(options);

        switch (options) {
            case "1":
                println("Calculation");
                calculation();
                break;
            case "3":
                println("powerOf");
                powerOf();
                println("answer is %s", ans);
                break;
            case "4":
                println("sin");
                sin();
                println("answer is %s", ans);
                break;
            case "5":
                println("cos");
                cos();
                println("answer is %s", ans);
                break;
            case "6":
                println("tan");
                tan();
                println("answer is %s", ans);
                break;
            case "7":
                println("inverse sin");
                isin();
                println("answer is %s", ans);
                break;
            case "8":
                println("inverse cos");
                icos();
                println("answer is %s", ans);
                break;
            case "9":
                println("inverse tan");
                itan();
                println("answer is %s", ans);
                break;
            case "10":
                println("log");
                log();
                println("answer is %s", ans);
                break;
            case "11":
                println("10^x");
                exponent();
                println("answer is %s", ans);
                break;
            case "12":
                println("ln");
                getLn();
                println("answer is %s", ans);
                break;
            case "14":
                println("n!");
                factorial();
                println("answer is %s", ans);
                break;
            case "16":
//                drawTriangle();
        }
    }
}
