package com.gorczynskimike.cryptography.rot13;

import org.junit.Assert;
import org.junit.Test;

public class Rot13TestSuite {

    @Test
    public void testTextRotated13TwiceYieldsSameText() {
        //Given
        Rot13Solution solution = new Rot13Solution();
        String sampleText = "This is a sample text. It's purpose is to be encoded and decoded and it shouldn't change.";
        //When
        String result = solution.rot13Text(sampleText);
        result = solution.rot13Text(result);
        //Then
        Assert.assertEquals(sampleText, result);
    }

}
