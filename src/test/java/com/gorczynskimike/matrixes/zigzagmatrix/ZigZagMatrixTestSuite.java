package com.gorczynskimike.matrixes.zigzagmatrix;

import org.junit.Assert;
import org.junit.Test;

public class ZigZagMatrixTestSuite {

    @Test
    public void testZigZagSizeOne() {
        //Given
        ZigZagMatrixSolution zigZagMatrixSolution = new ZigZagMatrixSolution();
        //When
        int[][] zigZagSizeOne = zigZagMatrixSolution.getZigZagMatrix(1);
        //Then
        Assert.assertArrayEquals(new int[][]{{0}}, zigZagSizeOne);
    }

    @Test
    public void testZigZagSizeThree() {
        //Given
        ZigZagMatrixSolution zigZagMatrixSolution = new ZigZagMatrixSolution();
        //When
        int[][] zigZagSizeThree = zigZagMatrixSolution.getZigZagMatrix(3);
        //Then
        Assert.assertArrayEquals(new int[][]{{0,1,5}, {2,4,6}, {3,7,8}}, zigZagSizeThree);
    }

    @Test
    public void testZigZagSizeFive() {
        //Given
        ZigZagMatrixSolution zigZagMatrixSolution = new ZigZagMatrixSolution();
        //When
        int[][] zigZagSizeFive = zigZagMatrixSolution.getZigZagMatrix(5);
        //Then
        Assert.assertArrayEquals(new int[][]{
                {0 ,1 ,5 ,6 ,14},
                {2 ,4 ,7 ,13,15},
                {3 ,8 ,12,16,21},
                {9 ,11,17,20,22},
                {10,18,19,23,24}}, zigZagSizeFive);
    }

}
