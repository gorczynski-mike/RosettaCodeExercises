package com.gorczynskimike.caesarcipher;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class CaesarCipherTestSuite {

    @Test
    public void testEncodeFunction() {
        //Given
        CaesarCipherSolution solution = new CaesarCipherSolution();
        String testInput = "--aaa aa, aa? aa. aa!--";
        //When
        String result1 = solution.encodeCasear(testInput,0);
        String result2 = solution.encodeCasear(testInput,1);
        String result3 = solution.encodeCasear(testInput,-1);
        String result4 = solution.encodeCasear(testInput,27);
        //Then
        assertEquals("--aaa aa, aa? aa. aa!--", result1);
        assertEquals("--bbb bb, bb? bb. bb!--", result2);
        assertEquals("--zzz zz, zz? zz. zz!--", result3);
        assertEquals("--bbb bb, bb? bb. bb!--", result4);
    }

    @Test
    public void testDecodeFunction() {
        //Given
        CaesarCipherSolution solution = new CaesarCipherSolution();
        Map<Integer, String> textAndKeyMap = new HashMap<>();
        textAndKeyMap.put(0, "--aaa aa, aa? aa. aa!--");
        textAndKeyMap.put(1, "--bbb bb, bb? bb. bb!--");
        textAndKeyMap.put(-1, "--zzz zz, zz? zz. zz!--");
        textAndKeyMap.put(27, "--bbb bb, bb? bb. bb!--");
        List<String> results = new ArrayList<>();
        //When
        textAndKeyMap.forEach((key,value) -> results.add(solution.decodeCaesar(value,key)));
        //Then
        results.forEach(result -> assertEquals("--aaa aa, aa? aa. aa!--", result));
    }

    @Test
    public void testTextShouldNotChangeAfterEncodeAndDecode() {
        //Given
        CaesarCipherSolution solution = new CaesarCipherSolution();
        String sampleText = "This is a sample text. It's purpose is to be encoded and decoded and it shouldn't change.";
        //When
        String result1 = solution.decodeCaesar(solution.encodeCasear(sampleText, 5), 5);
        String result2 = solution.decodeCaesar(solution.encodeCasear(sampleText, 17), 17);
        String result3 = solution.decodeCaesar(solution.encodeCasear(sampleText, -2), -2);
        String result4 = solution.decodeCaesar(solution.encodeCasear(sampleText, -200), -200);
        //Then
        assertEquals(sampleText, result1);
        assertEquals(sampleText, result2);
        assertEquals(sampleText, result3);
        assertEquals(sampleText, result4);
    }

}
