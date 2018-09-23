package com.gorczynskimike.cryptography;

public class LetterShifterImpl implements LetterShifter {
    @Override
    public char shiftLetter(char c, int shift) {
        char output = c;
        shift = shift % 26;
        if(shift < 0) {
            shift = 26 - Math.abs(shift);
        }

        if(Character.isUpperCase(c)) {
            int code = (int) c;
            code = code + shift;
            if(code > (int)'Z') {
                code = (int)'A' + (code - (int)'Z' -1);
            }
            output = (char) code;
        } else if (Character.isLowerCase(c)) {
            int code = (int) c;
            code = code + shift;
            if(code > (int)'z') {
                code = (int)'a' + (code - (int)'z' -1);
            }
            output = (char) code;
        }

        return output;
    }
}
