package com.gorczynskimike.cryptography.rot13;

import com.gorczynskimike.cryptography.LetterShifter;
import com.gorczynskimike.cryptography.LetterShifterImpl;

public class Rot13Solution {

    private LetterShifter letterShifter = new LetterShifterImpl();

    public String rot13Text(String text) {
        char[] rotatedText = new char[text.length()];
        int pointer = 0;
        for(char c : text.toCharArray()) {
            rotatedText[pointer] = rot13Letter(c);
            pointer++;
        }
        return String.valueOf(rotatedText);
    }

    public char rot13Letter(char c) {
        return letterShifter.shiftLetter(c, 13);
    }

}
