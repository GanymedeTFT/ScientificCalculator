package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Operations;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsTest {

    /*@Test
    public void twelveDividedByThreeShouldEqualFourTest(){
        Operations divide = new Operations();
        divide.division(12,3);
        assertEquals(4, divide.division(12,3), 0.00000000000000001);
    }*/
    //test for sin method
    @Test
    public void thisIsASinTest(){
        Operations trigSin = new Operations();
        trigSin.sin(9);
        assertEquals(0.4121184852417566, trigSin.sin(9), 0.000000000000001);
    }
    //test for inverse sin method
    @Test
    public void inverseSinTest(){
        Operations aSin = new Operations();
        aSin.inverseSin(.9);
        assertEquals(1.1197695149986342, aSin.inverseSin(.9), 0.00000000000000001);
    }
    @Test
    public void powerOfTest(){
        Operations power = new Operations();
        power.powerOf(3,2);
        assertEquals(9, power.powerOf(3,2), 0.000000000001);
    }
    @Test
    public void timesTenTest(){
        Operations tenPower = new Operations();
        tenPower.timesTen(3);
        assertEquals(1000, tenPower.timesTen(3), 0.000000000000001);
    }
    @Test
    public void youNeedATanTest(){
        Operations aTan = new Operations();
        aTan.youNeedATan(9);
        assertEquals(-0.45231565944180985, aTan.youNeedATan(9), 0.00000000000001);
    }
    @Test
    public void basedTenTest(){
        Operations logar = new Operations();
        logar.basedTen(1000);
        assertEquals(3, logar.basedTen(1000), 0.0000000000001);
    }
}
