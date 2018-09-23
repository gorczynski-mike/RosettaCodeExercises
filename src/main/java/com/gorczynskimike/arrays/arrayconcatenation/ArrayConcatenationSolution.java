package com.gorczynskimike.arrays.arrayconcatenation;

import java.lang.reflect.Array;

public class ArrayConcatenationSolution {

    <T> T[] concatenateArrays(T[] array1, T[] array2, Class<T> clazz) {

        if (array1 == null && array2 == null) {return null;}
        if (array1 != null && array2 == null) {return array1;}
        if (array2 != null && array1 == null) {return array2;}

        T[] resultArray = (T[]) Array.newInstance(clazz, array1.length + array2.length);

        int counter = 0;
        for(T item : array1) {
            resultArray[counter] = item;
            counter++;
        }
        for(T item : array2) {
            resultArray[counter] = item;
            counter++;
        }

        return resultArray;
    }

}
