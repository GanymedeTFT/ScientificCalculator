package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.mathOps;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    @Test
    public void additionTest(){
        double codeOutput = mathOps.addition(3.0,3.0);
        double answer = 6.0;
        assertEquals(answer, codeOutput);
    }

}
