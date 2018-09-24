package com.gorczynskimike.strings.stringlength;

import java.nio.charset.Charset;

//Not really a solution, just a demonstration
public class StringLengthSolution {

    public static void main(String[] args) {
        String exampleString = "abcd";
        System.out.println("number of characters: " + exampleString.length());
        System.out.println("default: " + exampleString.getBytes().length);
        System.out.println("utf8: " + exampleString.getBytes(Charset.forName("utf-8")).length);
        System.out.println("utf16: " + exampleString.getBytes(Charset.forName("utf-16")).length);
        System.out.println("utf32: " + exampleString.getBytes(Charset.forName("utf-32")).length);

        System.out.println(System.lineSeparator() + "Polish String:");
        String exampleStringPolish = "ąęóź";
        System.out.println("number of characters: " + exampleStringPolish.length());
        System.out.println("default: " + exampleStringPolish.getBytes().length);
        System.out.println("utf8: " + exampleStringPolish.getBytes(Charset.forName("utf-8")).length);
        System.out.println("utf16: " + exampleStringPolish.getBytes(Charset.forName("utf-16")).length);
        System.out.println("utf32: " + exampleStringPolish.getBytes(Charset.forName("utf-32")).length);
    }

}
