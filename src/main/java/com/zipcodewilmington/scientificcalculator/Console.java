package com.zipcodewilmington.scientificcalculator;


import java.math.BigInteger;
import java.math.MathContext;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import static java.lang.Math.*;

/**
 * Created by leon on 2/9/18.
 */
public class Console {
    static BigDecimal bd1 = new BigDecimal(0.0);
    static BigDecimal bd2 = new BigDecimal(0.0);
    static BigDecimal bd3 = new BigDecimal(0.0);
    //create storage for digits, operator, and operator storage//
    static String s1 = "", s2 = "", result = "", storage = "";
    static String operator = "", operatorTemp = "", OS = "", OTS = "";
    static double ans = 0.0;

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }
    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }
    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static int getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        double userInput = scanner.nextDouble();
        return (int) userInput;
    }
    public static double getStringInput() {
        Scanner scanner = new Scanner(System.in);
        double stringInput = scanner.nextDouble();
        return (double) stringInput;
    }

    public static double getLn() {
        double x = getDoubleInput("Enter your x");
        ans = 1-Math.log(x);
        return ans;
    }
    public static double log() {
        double x = getDoubleInput("Enter your x");
        ans = Math.log(x);
        return ans;
    }
    public static double exponent() {
        int x = getIntegerInput("Enter your x");
        for (int i = 0; i < x; i++) {
            x = x * x;
        }
        return ans = Double.valueOf(x);
    }
    public static int factorial() {
        int ans = getIntegerInput("Enter your x");
        for (int i = ans; i > 1; i--) {
            ans*=(i-1);
        }
        return ans;
    }
    public static double sin() {
        int x = getIntegerInput("Enter your x");
        s2 = String.format(String.valueOf(Math.sin(x)), 8, RoundingMode.HALF_EVEN);
        return ans = Double.valueOf(s2);
    }
    public static double cos() {
        int x = getIntegerInput("Enter your x");
        s2 = String.format(String.valueOf(Math.cos(x)), 8, RoundingMode.HALF_EVEN);
        return ans = Double.valueOf(s2);
    }
    public static double tan() {
        int x = getIntegerInput("Enter your x");
        s2 = String.format(String.valueOf(Math.tan(x)), 8, RoundingMode.HALF_EVEN);
        return ans = Double.valueOf(s2);
    }
    public static double isin() {
        int x = getIntegerInput("Enter your x");
        s2 = String.format(String.valueOf(1/Math.sin(x)), 8, RoundingMode.HALF_EVEN);
        return ans = Double.valueOf(s2);
    }
    public static double icos() {
        int x = getIntegerInput("Enter your x");
        s2 = String.format(String.valueOf(1/Math.cos(x)), 8, RoundingMode.HALF_EVEN);
        return ans = Double.valueOf(s2);
    }
    public static double itan() {
        int x = getIntegerInput("Enter your x");
        s2 = String.format(String.valueOf(1/Math.tan(x)), 8, RoundingMode.HALF_EVEN);
        return ans = Double.valueOf(s2);
    }

    public static double powerOf() {
        double x = getDoubleInput("Enter your x");
        double y = getDoubleInput("Enter your y");
        ans = Math.pow(x, y);
        println("The answer is %s", result);
        return ans;
    }
    public static void operatorToTempCopy() {
        operatorTemp = operator;
    }
    public static String equal() {
        if(!s1.equals("") && !s2.equals("")) {
            if (OS.equals("*")) {
                multiply();
            }
            if (OS.equals("/")) {
                division();
            }
        }
        if(!s2.equals("") && !result.equals("")) {
            if (OTS.equals("+")) {
                addition();
            }
            if (OTS.equals("-")) {
                subtract();
            }
        }
        s2.equals(""); s1.equals(""); operator.equals(""); operatorTemp.equals(""); OS.equals(""); OTS.equals("");
        return result;
    }
    //create console for operator//
    public static String getOperatorInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
    public static String storage(String prompt) {
        MainApplication.storage = prompt;
        return MainApplication.storage;
    }
    public static String division() {
        if (s1.contains(".")) {
            bd1 = BigDecimal.valueOf(Double.parseDouble(s1));
        }
        if (s2.contains(".")) {
            bd2 = BigDecimal.valueOf(Double.parseDouble(s2));
        }
        if (!s1.contains(".")) {
            bd1 = BigDecimal.valueOf(Integer.parseInt(s1));
        }
        if (!s2.contains(".")) {
            bd2 = BigDecimal.valueOf(Integer.parseInt(s2));
        }
        s2 = String.valueOf(bd2.divide(bd1, 8, RoundingMode.HALF_EVEN));
        if (s2.length() > 10 && s2.length() <= 16) {
            s2 = s2.substring(0, 10);
        } else {
            for (int i = 17; i <= s2.length(); i++) {
                s2 = s2.substring(0, i-5);
            }
        }
        return s2;
    }
    public static String multiply() {
        //convert String s into Integer i or Double d//
        //make a multiplication statement//
        if(s1.contains(".")) {
            bd1 = BigDecimal.valueOf(Double.parseDouble(s1));
        }
        if(s2.contains(".")) {
            bd2 = BigDecimal.valueOf(Double.parseDouble(s2));
        }
        if(!s1.contains(".")) {
            bd1 = BigDecimal.valueOf(Integer.parseInt(s1));
        }
        if(!s2.contains(".")) {
            bd2 = BigDecimal.valueOf(Integer.parseInt(s2));
        }
        s2 = String.valueOf(bd2.multiply(bd1));
        if (s2.length() > 10 && s2.length() <= 16) {
            s2 = s2.substring(0, 10);
        } else {
            for (int i = 17; i <= s2.length(); i++) {
                s2 = s2.substring(0, i-5);
            }
        }
        return s2;
    }
    public static String subtract() {
        //convert String s into Integer i or Double d//
        //make a multiplication statement//
        if(s2.contains(".")) {
            bd2 = BigDecimal.valueOf(Double.parseDouble(s2));
        }
        if(result.contains(".")) {
            bd3 = BigDecimal.valueOf(Double.parseDouble(result));
        }
        if(!s2.contains(".")) {
            bd2 = BigDecimal.valueOf(Integer.parseInt(s2));
        }
        if(!result.contains(".")) {
            bd3 = BigDecimal.valueOf(Integer.parseInt(result));
        }
        result = String.valueOf(bd3.subtract(bd2));
        if (result.length() > 10 && result.length() <= 16) {
            result = result.substring(0, 10);
        } else {
            for (int i = 17; i <= result.length(); i++) {
                result = result.substring(0, i - 5);
            }
        }
        return result;
    }
    public static String addition() {
        if(s2.contains(".")) {
            bd2 = BigDecimal.valueOf(Double.parseDouble(s2));
        }
        if(result.contains(".")) {
            bd3 = BigDecimal.valueOf(Double.parseDouble(result));
        }
        if(!s2.contains(".")) {
            bd2 = BigDecimal.valueOf(Integer.parseInt(s2));
        }
        if(!result.contains(".")) {
            bd3 = BigDecimal.valueOf(Integer.parseInt(result));
        }
        result = String.valueOf(bd3.add(bd2));
        if (result.length() > 10 && result.length() <= 16) {
            result = result.substring(0, 10);
        } else {
            for (int i = 17; i <= result.length(); i++) {
                result = result.substring(0, i - 5);
            }
        }
        return result;
    }
    public static String percent(int i1, int i2, int i3, double d1, double d2, double d3) {
        if (storage.contains(".")) {
            Double tempD = Double.parseDouble(storage);
        } else {
            int temp = Integer.parseInt(s1)/100;
            int temp2 = Integer.parseInt(s2)/100;
            int temp3 = Integer.parseInt(result)/100;
        }
        return null;

    }

}
