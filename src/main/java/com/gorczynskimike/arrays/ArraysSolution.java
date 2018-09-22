package com.gorczynskimike.arrays;

public class ArraysSolution {

    <T> T createSampleArrayAndRetrieveAnElement(int indexToReturn, T... arrayElements) {

        if (arrayElements == null || indexToReturn < 0 || indexToReturn >= arrayElements.length) {
            return null;
        }

        T[] sampleArray = (T[]) new Object[arrayElements.length];
        int counter = 0;
        for(T item : arrayElements) {
            sampleArray[counter] = item;
            counter++;
        }
        return sampleArray[indexToReturn];
    }

}
