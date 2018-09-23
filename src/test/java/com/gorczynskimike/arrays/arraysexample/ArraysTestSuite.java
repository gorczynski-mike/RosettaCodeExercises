package com.gorczynskimike.arrays.arraysexample;

import org.junit.Assert;
import org.junit.Test;

public class ArraysTestSuite {

    @Test
    public void testArrayIsCreatedAndCorrectElementReturned() {
        //Given
        ArraysSolution arraysSolution = new ArraysSolution();
        //When
        String returnedElement = arraysSolution
                .createSampleArrayAndRetrieveAnElement(1, String.class,"zero", "one", "two", "three");
        //Then
        Assert.assertEquals("one", returnedElement);
    }

    @Test
    public void testMethodForVariousInputTypes() {
        //Given
        ArraysSolution arraysSolution = new ArraysSolution();
        //When
        Integer returnedInt = arraysSolution.createSampleArrayAndRetrieveAnElement(2, Integer.class, 0,1,2,3,4);
        Character returnedChar = arraysSolution.createSampleArrayAndRetrieveAnElement(1, Character.class, 'a','b','c');
        Boolean returnedBool = arraysSolution.createSampleArrayAndRetrieveAnElement(1, Boolean.class,false, true);
        //Then
        Assert.assertEquals((Integer)2, returnedInt);
        Assert.assertEquals((Character)'b', returnedChar);
        Assert.assertEquals(true, returnedBool);
    }

    @Test
    public void testNullReturnedWhenIndexOutOfBounds() {
        //Given
        ArraysSolution arraysSolution = new ArraysSolution();
        //When
        Integer resultWhenLessThanZeroIndex = arraysSolution.createSampleArrayAndRetrieveAnElement(-1, Integer.class, 0,1,2,3,4);
        Integer resultWhenIndexTooBig = arraysSolution.createSampleArrayAndRetrieveAnElement(5, Integer.class,0,1,2);
        Integer resultWhenNoElements = arraysSolution.createSampleArrayAndRetrieveAnElement(3, Integer.class);
        //Then
        Assert.assertNull(resultWhenLessThanZeroIndex);
        Assert.assertNull(resultWhenIndexTooBig);
        Assert.assertNull(resultWhenNoElements);
    }

}
