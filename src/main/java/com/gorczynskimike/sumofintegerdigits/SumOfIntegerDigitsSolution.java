package com.gorczynskimike.sumofintegerdigits;

public class SumOfIntegerDigitsSolution {

    public int sumDigitsBaseTen(int input) {
        int theSum = 0;
        while(input > 0) {
            theSum += input % 10;
            input /= 10;
        }
        return theSum;
    }

    public int sumDigitsBaseSixteen(String hexString) {
        int inputBaseTen = Integer.parseInt(hexString, 16);
        int theSum = 0;
        while(inputBaseTen > 0) {
            theSum += inputBaseTen % 16;
            inputBaseTen /= 16;
        }
        return theSum;
    }

    public int sumDigitsAnyBase(String numberString, int base) {
        int inputBaseTen = Integer.parseInt(numberString, base);
        int theSum = 0;
        while(inputBaseTen > 0) {
            theSum += inputBaseTen % base;
            inputBaseTen /= base;
        }
        return theSum;
    }

}
