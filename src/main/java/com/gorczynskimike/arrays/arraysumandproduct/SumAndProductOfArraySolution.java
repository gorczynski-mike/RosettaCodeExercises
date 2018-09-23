package com.gorczynskimike.arrays.arraysumandproduct;

public class SumAndProductOfArraySolution {

    public long getSum(int[] arr) {
        long sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    public long getProduct(int[] arr) {
        long product = 1;
        for(int i : arr) {
            product *= i;
        }
        return product;
    }

}
