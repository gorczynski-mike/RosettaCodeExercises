package com.gorczynskimike.strings.stringcase;

public class StringCaseSolution {

    public String toUpperCase1(String s) {
        return s.toUpperCase();
    }

    public String toUpperCase2(String s) {
        char[] upperCharArray = new char[s.length()];
        int pointer = 0;
        for(Character c : s.toCharArray()) {
            upperCharArray[pointer] = Character.isUpperCase(c) ? c : Character.toUpperCase(c);
            pointer++;
        }
        return String.valueOf(upperCharArray);
    }

    public String toLowerCase1(String s) {
        return s.toLowerCase();
    }

    public String toLowerCase2(String s) {
        char[] lowerCharArray = new char[s.length()];
        int pointer = 0;
        for(Character c : s.toCharArray()) {
            lowerCharArray[pointer] = Character.isLowerCase(c) ? c : Character.toLowerCase(c);
            pointer++;
        }
        return String.valueOf(lowerCharArray);
    }

}
