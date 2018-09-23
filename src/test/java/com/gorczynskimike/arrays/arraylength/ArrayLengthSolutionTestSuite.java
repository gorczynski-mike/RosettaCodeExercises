package com.gorczynskimike.arrays.arraylength;

import org.junit.Test;
import org.junit.Assert;

public class ArrayLengthSolutionTestSuite {

    @Test
    public void testReturnsMinusOneOnNullInput() {
        //Given
        ArrayLengthSolution arrayLengthSolution = new ArrayLengthSolution();
        //When
        int arrayLength = arrayLengthSolution.calculateArrayLength(null);
        //Then
        Assert.assertEquals(-1, arrayLength);
    }

    @Test
    public void testCalculatesCorrectArrayLength() {
        //Given
        ArrayLengthSolution arrayLengthSolution = new ArrayLengthSolution();
        String[] testStringArray = new String[]{"apple", "banana", "carrot"};
        //When
        int arrayLength = arrayLengthSolution.calculateArrayLength(testStringArray);
        //Then
        Assert.assertEquals(3, arrayLength);
    }

    @Test
    public void testCalculatesCorrectArrayLengthRegardlessOfArrayType() {
        //Given
        ArrayLengthSolution arrayLengthSolution = new ArrayLengthSolution();
        String[] testStringArray = new String[]{"apple", "banana", "carrot"};
        Integer[] testIntArray = new Integer[]{1,2,3,4,5};
        Character[] testCharArray = new Character[]{'a','b','c','d'};
        //When
        int stringArrayLength = arrayLengthSolution.calculateArrayLength(testStringArray);
        int intArrayLength = arrayLengthSolution.calculateArrayLength(testIntArray);
        int charArrayLength = arrayLengthSolution.calculateArrayLength(testCharArray);
        //Then
        Assert.assertEquals(3,stringArrayLength);
        Assert.assertEquals(5,intArrayLength);
        Assert.assertEquals(4,charArrayLength);
    }

}
