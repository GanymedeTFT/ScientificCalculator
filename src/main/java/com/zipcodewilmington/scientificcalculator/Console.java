package com.zipcodewilmington.scientificcalculator;

import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

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

    } public static Integer getIntegerInput(String prompt) {
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

    public static MathContext getLn() {
        return getLn();
    }

    public static BigInteger factorial () {
        return factorial();
    }

}
