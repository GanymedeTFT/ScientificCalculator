package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Operations {


    static double answer;

    /*public double division(double x , double y){
        answer = x / y;
        return answer;
    }*/
    //sin
    public double sin(double x){
        answer = Math.sin(x);
        return answer;
    }
    //Inverse Sin
    public double inverseSin(double x){
        answer = Math.asin(x);
        return answer;
    }
    //Power of
    public double powerOf(double x, double y){
        answer = Math.pow(x, y);
        return answer;
    }
    //10^x
    public double timesTen(double y){
        answer = Math.pow(10, y);
        return answer;
    }
    //tan
    public double youNeedATan(double x){
        answer = Math.tan(x);
        return answer;
    }

    //Log
    public double basedTen(double x) {
        answer = Math.log10(x);
        return answer;
    }

    //MC Add the currently displayed value to the value in memory (store in memory and update display) *
// M+ Add the currently displayed value to the value in memory (store in memory and update display) *
//MRCRecall the current value from memory to the display **/
    //e^x I don't know :c
    /*public  double (){
        return;
    }*/


}
