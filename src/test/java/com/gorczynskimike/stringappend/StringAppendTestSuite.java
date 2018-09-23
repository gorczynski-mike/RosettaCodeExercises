package com.gorczynskimike.stringappend;

import org.junit.Assert;
import org.junit.Test;

public class StringAppendTestSuite {

    @Test
    public void testAllMethodsOfConcatenation() {
        //Given
        StringAppendSolution stringAppendSolution = new StringAppendSolution();
        String s1 = "Lorem ";
        String s2 = "Ipsum";
        String expected = "Lorem Ipsum";
        //When
        String result1 = stringAppendSolution.append1(s1,s2);
        String result2 = stringAppendSolution.append2(s1,s2);
        String result3 = stringAppendSolution.append3(s1,s2);
        String result4 = stringAppendSolution.append4(s1,s2);
        //Then
        Assert.assertEquals(expected, result1);
        Assert.assertEquals(expected, result2);
        Assert.assertEquals(expected, result3);
        Assert.assertEquals(expected, result4);
    }

}
