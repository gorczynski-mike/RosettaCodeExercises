package com.gorczynskimike.strings.stringcase;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCaseTestSuite {

    @Test
    public void testAllUpperMethods() {
        //Given
        StringCaseSolution stringCaseSolution = new StringCaseSolution();
        String testString = "alphaBETA";
        //When
        String resultUpper1 = stringCaseSolution.toUpperCase1(testString);
        String resultUpper2 = stringCaseSolution.toUpperCase2(testString);
        //Then
        assertEquals("ALPHABETA", resultUpper1);
        assertEquals("ALPHABETA", resultUpper2);
    }

    @Test
    public void testAllLowerMethods() {
        //Given
        StringCaseSolution stringCaseSolution = new StringCaseSolution();
        String testString = "alphaBETA";
        //When
        String resultLower1 = stringCaseSolution.toLowerCase1(testString);
        String resultLower2 = stringCaseSolution.toLowerCase2(testString);
        //Then
        assertEquals("alphabeta", resultLower1);
        assertEquals("alphabeta", resultLower2);
    }

}
