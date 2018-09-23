package com.gorczynskimike.cryptography.caesarcipher;

import com.gorczynskimike.cryptography.LetterShifter;
import com.gorczynskimike.cryptography.LetterShifterImpl;

public class CaesarCipherSolution {

    private LetterShifter letterShifter = new LetterShifterImpl();

    public String encodeCasear(String text, int key) {
        char[] encodedText = new char[text.length()];
        int pointer = 0;
        for(char c : text.toCharArray()) {
            if(Character.isLetter(c)) {
                encodedText[pointer] = letterShifter.shiftLetter(c, key);
            } else {
                encodedText[pointer] = c;
            }
            pointer++;
        }
        return String.valueOf(encodedText);
    }

    public String decodeCaesar(String text, int key) {
        return encodeCasear(text, (-1) * key);
    }
}
