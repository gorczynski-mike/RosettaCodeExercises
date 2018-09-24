package com.gorczynskimike.strings.stringmatching;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatchingSolution {

    public boolean doesStringStartWithString(String str1, String str2) {
        return str1.startsWith(str2);
    }

    public boolean doesStringEndWithString(String str1, String str2) {
        return str1.endsWith(str2);
    }

    public boolean doesStringContainString(String str1, String str2) {
        return str1.contains(str2);
    }

    public List<Integer> getPatternLocations(String str1, String str2) {
        Pattern pattern = Pattern.compile(str2);
        Matcher matcher = pattern.matcher(str1);
        List<Integer> locations = new ArrayList<>();
        while(matcher.find()) {
            locations.add(matcher.start());
        }
        return locations;
    }

}
