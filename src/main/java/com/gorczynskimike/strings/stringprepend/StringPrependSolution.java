package com.gorczynskimike.strings.stringprepend;

import java.util.ArrayList;
import java.util.List;

public class StringPrependSolution {

    public static void main(String[] args) {
        StringPrependSolution solution = new StringPrependSolution();
        String text = "cat";
        String prefix = "naughty ";
        System.out.println(solution.prepend1(text,prefix));
        System.out.println(solution.prepend2(text,prefix));
    }

    public String prepend1(String text, String prefix) {
        return prefix + text;
    }

    public String prepend2(String text, String prefix) {
        List<Character> outputList = new ArrayList<>();
        prefix.chars()
                .mapToObj(c -> (char) c)
                .forEach(c -> outputList.add(c));
        text.chars()
                .mapToObj(c -> (char) c)
                .forEach(c -> outputList.add(c));
        char[] outputArr = new char[outputList.size()];
        int pointer = 0;
        for(char c : outputList) {
            outputArr[pointer] = c;
            pointer++;
        }
        return String.valueOf(outputArr);
    }

}
