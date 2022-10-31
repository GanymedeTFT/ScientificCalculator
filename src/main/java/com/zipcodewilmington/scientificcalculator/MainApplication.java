package com.zipcodewilmington.scientificcalculator;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        double num1, num2;
        Scanner scan = new Scanner (System.in);
        num1 = Console.getDoubleInput("Enter the first number");
        String operator = Console.getStringInput("Enter the operator (+)");
        num2 = Console.getDoubleInput("Enter the second number");
        double answer = mathOps.addition(num1, num2);
        Console.println("The answer is " + answer);
    }

    
}