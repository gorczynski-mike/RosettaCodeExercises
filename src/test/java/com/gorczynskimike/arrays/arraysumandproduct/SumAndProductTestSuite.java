package com.gorczynskimike.arrays.arraysumandproduct;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumAndProductTestSuite {

    @Test
    public void testSum() {
        //Given
        SumAndProductOfArraySolution solution = new SumAndProductOfArraySolution();
        //When
        long result = solution.getSum(new int[]{1,2,3,4,5,10});
        //Then
        assertEquals(25, result);
    }

    @Test
    public void testProduct() {
        //Given
        SumAndProductOfArraySolution solution = new SumAndProductOfArraySolution();
        //When
        long result = solution.getProduct(new int[]{1,2,3,4,5});
        //Then
        assertEquals(120,result);
    }

    @Test
    public void testProductWithAZeroElement() {
        //Given
        SumAndProductOfArraySolution solution = new SumAndProductOfArraySolution();
        //When
        long result = solution.getProduct(new int[]{2,50,67,13,0,7,19});
        //Then
        assertEquals(0, result);
    }

}
