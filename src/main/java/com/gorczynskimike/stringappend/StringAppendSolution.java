package com.gorczynskimike.stringappend;

import java.util.StringJoiner;

public class StringAppendSolution {

    public String append1(String s1, String s2) {
        return s1 + s2;
    }

    public String append2(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.append(s2);
        return sb.toString();
    }

    public String append3(String s1, String s2) {
        StringJoiner sj = new StringJoiner("");
        sj.add(s1);
        sj.add(s2);
        return sj.toString();
    }

    public String append4(String s1, String s2) {
        char[] charArr = new char[s1.length() + s2.length()];
        int counter = 0;
        for(char c : s1.toCharArray()) {
            charArr[counter] = c;
            counter++;
        }
        for(char c : s2.toCharArray()) {
            charArr[counter] = c;
            counter++;
        }
        return String.valueOf(charArr);
    }

}
