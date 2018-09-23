package com.gorczynskimike.strings.stringinterpolation;

public class StringInterpolationSolution {

    public void showExamples() {
        //example 1
        String format = "Mary had a %s lamb";
        System.out.printf(format, "little");
        System.out.println();

        //example 2
        String resultString = format.replace("%s", "little");
        System.out.println(resultString);

        //example 3
        String resultString2 = format.replaceAll("\\s%s\\s", " little ");
        System.out.println(resultString2);
    }

}
