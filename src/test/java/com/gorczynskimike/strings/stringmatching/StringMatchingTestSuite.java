package com.gorczynskimike.strings.stringmatching;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StringMatchingTestSuite {

    @Test
    public void testStartsWith() {
        //Given
        StringMatchingSolution solution = new StringMatchingSolution();
        String str1 = "aa bb";
        //When
        boolean result1 = solution.doesStringStartWithString(str1, "aa");
        boolean result2 = solution.doesStringStartWithString(str1, "bb");
        //Then
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
    }

    @Test
    public void testEndsWith() {
        //Given
        StringMatchingSolution solution = new StringMatchingSolution();
        String str1 = "aa bb";
        //When
        boolean result1 = solution.doesStringEndWithString(str1, "aa");
        boolean result2 = solution.doesStringEndWithString(str1, "bb");
        //Then
        Assert.assertFalse(result1);
        Assert.assertTrue(result2);
    }

    @Test
    public void testContains() {
        //Given
        StringMatchingSolution solution = new StringMatchingSolution();
        String str1 = "aa bb cc dd";
        //When
        boolean result1 = solution.doesStringContainString(str1, "c");
        boolean result2 = solution.doesStringContainString(str1, "cc");
        boolean result3 = solution.doesStringContainString(str1, "ccc");
        //Then
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertFalse(result3);
    }

    @Test
    public void testFindingMatchingLocations() {
        //Given
        StringMatchingSolution solution = new StringMatchingSolution();
        String str1 = "aa aa bb aa bb aa";
        String str2 = "aa";
        //When
        List<Integer> locations = solution.getPatternLocations(str1, str2);
        //Then
        Assert.assertEquals(4, locations.size());
        Assert.assertTrue(locations.contains(0));
        Assert.assertTrue(locations.contains(3));
        Assert.assertTrue(locations.contains(9));
        Assert.assertTrue(locations.contains(15));
    }

}
