package com.zipcodewilmington.scientificcalculator;

import static com.zipcodewilmington.scientificcalculator.Console.*;

public class Calculation {

    public static void calculation() {
        result = getStringInput("Enter any valid numbers");
        storage(result);
        operator = getOperatorInput("Enter any valid operator");
        if (operator.equals("+") || operator.equals("-")) {
            operatorTemp = operator;
            OTS = operatorTemp;
            operator = "";
        }
        while (true) {
            if (operatorTemp.equals("-") || operatorTemp.equals("+")) {
                while (operatorTemp.equals("-")) {
                    println("= %s %s", result, OTS);
                    s2 = getStringInput("Enter any valid numbers");
                    println("= %s %s %s", result, OTS, s2);
                    operatorTemp = getOperatorInput("Enter any valid operator");
                    if (operatorTemp.equals("-") || operatorTemp.equals("+")) {
                        OTS = operatorTemp;
                        subtract();
                        println("= %s %s", result, OTS);
                    }
                    if (operatorTemp.equals("=")) {
                        equal();
                    }
                }
                while (operatorTemp.equals("+")) {
                    println("= %s %s", result, OTS);
                    s2 = getStringInput("Enter any valid numbers");
                    println("= %s %s %s", result, OTS, s2);
                    operatorTemp = getOperatorInput("Enter any valid operator");
                    if (operatorTemp.equals("+") || operatorTemp.equals("-")) {
                        OTS = operatorTemp;
                        addition();
                        println("= %s %s", result, OTS);
                    }
                    if (operatorTemp.equals("=")) {
                        equal();
                    }
                }
            }
                if (operatorTemp.equals("*") || operatorTemp.equals("/")) {
                    operator = operatorTemp;
                    operatorTemp = OTS;
                }
                if (operator.equals("*") || operator.equals("/")) {
                    if (s2.equals("")) {
                        s2 = result;
                        result = "";
                    }
                    while (operator.equals("*")) {
                        println("= %s %s %s %s", result, OTS, s2, operator);
                        s1 = getStringInput("Enter any valid number");
                        OS = operator;
                        println("= %s %s %s %s %s", result, OTS, s2, operator, s1);
                        operator = getOperatorInput("Enter any valid operator");
                        multiply();
                        println("= %s %s %s %s", result, OTS, s2, operator);
                        if (operator.equals("-") || operator.equals("+")) {
                            if (operatorTemp.equals("")) {
                                operatorToTempCopy();
                                operator = "";
                            }
                            if (result.equals("")) {
                                result = s2;
                                s2 = "0";
                            }
                            if (OTS.equals("-")) {
                                subtract();
                                println("= %s", result);
                                OTS = operator;
                                operatorTemp = operator;
                                operator = "";
                            }
                            if (OTS.equals("+")) {
                                addition();
                                println("= %s", result);
                                OTS = operator;
                                operatorTemp = operator;
                                operator = "";
                            }
                            if (operator.equals("=")) {
                                equal();
                            }
                        }
                    }
                    while (operator.equals("/") || operatorTemp.equals("/")) {
                        println("= %s %s %s %s", result, OTS, s2, operator);
                        s1 = getStringInput("Enter any valid number");
                        OS = operator;
                        println("= %s %s %s %s %s", result, OTS, s2, operator, s1);
                        operator = getOperatorInput("Enter any valid operator");
                        division();
                        println("= %s %s %s %s", result, OTS, s2, operator);
                        if (operator.equals("-") || operator.equals("+")) {
                            if (operatorTemp.equals("")) {
                                operatorToTempCopy();
                                operator = "";
                            }
                            if (result.equals("")) {
                                result = s2;
                                s2 = "0";
                            }
                            if (OTS.equals("-")) {
                                subtract();
                                println("= %s", result);
                                OTS = operator;
                                operatorTemp = operator;
                                operator = "";
                            }
                            if (OTS.equals("+")) {
                                addition();
                                println("= %s", result);
                                OTS = operator;
                                operatorTemp = operator;
                                operator = "";
                            }
                            if (operator.equals("=")) {
                                equal();
                            }
                        }
                    }
                }
                if (operator.equals("=") || operatorTemp.equals("=")) {
                    println("= %s", result);
                    operator = getStringInput("Enter any valid operator");
                    if (operator.equals("+") || operator.equals("-")) {
                        operatorTemp = operator;
                        OTS = operatorTemp;
                        operator = "";
                    }
                    if (operator.equals("*") || operator.equals("/")) {
                        s2 = result;
                    }
                }
            }
        }
    }
