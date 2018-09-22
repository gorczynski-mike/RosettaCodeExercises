package com.gorczynskimike.arraylength;

public class ArrayLengthSolution {

    int calculateArrayLength(Object[] array) {
        if(array != null) {
            return array.length;
        }
        return -1;
    }

}
