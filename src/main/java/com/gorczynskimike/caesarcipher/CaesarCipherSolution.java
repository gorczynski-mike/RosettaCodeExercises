package com.gorczynskimike.caesarcipher;

public class CaesarCipherSolution {

    public static void main(String[] args) {
        CaesarCipherSolution solution = new CaesarCipherSolution();
        System.out.println(solution.shiftLetter('z', 1));
    }

    public String encodeCasear(String text, int key) {
        char[] encodedText = new char[text.length()];
        int pointer = 0;
        for(char c : text.toCharArray()) {
            if(Character.isLetter(c)) {
                encodedText[pointer] = shiftLetter(c, key);
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

    private char shiftLetter(char c, int shift) {
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
