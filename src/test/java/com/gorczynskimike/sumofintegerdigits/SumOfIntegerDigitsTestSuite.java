package com.gorczynskimike.sumofintegerdigits;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumOfIntegerDigitsTestSuite {

    @Test
    public void testSumOfIntegerDigitsBaseTen() {
        //Given
        SumOfIntegerDigitsSolution solution = new SumOfIntegerDigitsSolution();
        int testInt1 = 123;
        int testInt2 = 56700;
        //When
        int result1 = solution.sumDigitsBaseTen(testInt1);
        int result2 = solution.sumDigitsBaseTen(testInt2);
        //Then
        assertEquals(6, result1);
        assertEquals(18, result2);
    }

    @Test
    public void testSumOfIntegerDigitsBaseSixteen() {
        //Given
        SumOfIntegerDigitsSolution solution = new SumOfIntegerDigitsSolution();
        String hex1 = "12F";
        String hex2 = "ABCDF";
        //When
        int result1 = solution.sumDigitsBaseSixteen(hex1);
        int result2 = solution.sumDigitsBaseSixteen(hex2);
        //Then
        assertEquals(18, result1);
        assertEquals(61, result2);
    }

    @Test
    public void testSumOfIntegerDigitsBaseSixteenOtherMethod() {
        //Given
        SumOfIntegerDigitsSolution solution = new SumOfIntegerDigitsSolution();
        String hex1 = "12F";
        String hex2 = "ABCDF";
        //When
        int result1 = solution.sumDigitsAnyBase(hex1, 16);
        int result2 = solution.sumDigitsAnyBase(hex2, 16);
        //Then
        assertEquals(18, result1);
        assertEquals(61, result2);
    }

    @Test
    public void testSumOfIntegerDigitsBaseEight() {
        //Given
        SumOfIntegerDigitsSolution solution = new SumOfIntegerDigitsSolution();
        String octal1 = "123";
        String octal2 = "765";
        //When
        int result1 = solution.sumDigitsAnyBase(octal1, 8);
        int result2 = solution.sumDigitsAnyBase(octal2, 8);
        //Then
        assertEquals(6, result1);
        assertEquals(18,result2);
    }

}
