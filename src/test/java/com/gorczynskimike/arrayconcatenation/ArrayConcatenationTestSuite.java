package com.gorczynskimike.arrayconcatenation;

import org.junit.Assert;
import org.junit.Test;

public class ArrayConcatenationTestSuite {

    @Test
    public void testBothInputsAreNull() {
        //Given
        ArrayConcatenationSolution arrayConcatenationSolution = new ArrayConcatenationSolution();
        //When
        Object[] result = arrayConcatenationSolution.concatenateArrays(null, null, Object.class);
        //Then
        Assert.assertNull(result);
    }

    @Test
    public void testOneInputNullOtherInputNotNull() {
        //Given
        ArrayConcatenationSolution arrayConcatenationSolution = new ArrayConcatenationSolution();
        Integer[] inputArr = new Integer[]{0,1,2};
        //When
        Integer[] result1 = arrayConcatenationSolution.concatenateArrays(inputArr, null, Integer.class);
        Integer[] result2 = arrayConcatenationSolution.concatenateArrays(null, inputArr, Integer.class);
        //Then
        Assert.assertArrayEquals(inputArr, result1);
        Assert.assertArrayEquals(inputArr, result2);
    }

    @Test
    public void testConcatenationOfTwoNotEmptyArrays() {
        //Given
        ArrayConcatenationSolution arrayConcatenationSolution = new ArrayConcatenationSolution();
        Integer[] inputArr1 = new Integer[]{0,1,2};
        Integer[] inputArr2 = new Integer[]{3,4,5};
        //When
        Integer[] result = arrayConcatenationSolution.concatenateArrays(inputArr1, inputArr2, Integer.class);
        //Then
        Assert.assertArrayEquals(new Integer[]{0,1,2,3,4,5}, result);
    }

}
