package com.gorczynskimike.arrays.arraysexample;

import java.lang.reflect.Array;

public class ArraysSolution {

    <T> T createSampleArrayAndRetrieveAnElement(int indexToReturn, Class<T> clazz, T... arrayElements) {

        if (arrayElements == null || indexToReturn < 0 || indexToReturn >= arrayElements.length) {
            return null;
        }

        T[] sampleArray = (T[]) Array.newInstance(clazz, arrayElements.length);
        int counter = 0;
        for(T item : arrayElements) {
            sampleArray[counter] = item;
            counter++;
        }
        return sampleArray[indexToReturn];
    }

}
