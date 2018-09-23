package com.gorczynskimike.matrixes.identitymatrix;

import org.junit.Assert;
import org.junit.Test;

public class IdentityMatrixTestSuite {

    @Test
    public void testReturnsNullIfSizeTooSmall() {
        //Given
        IdentityMatrixSolution identityMatrixSolution = new IdentityMatrixSolution();
        //When
        int[][] resultSizeNegative = identityMatrixSolution.getIdentityMatrix(-1);
        int[][] resultSizeZero = identityMatrixSolution.getIdentityMatrix(0);
        //Then
        Assert.assertNull(resultSizeNegative);
        Assert.assertNull(resultSizeZero);
    }

    @Test
    public void testIdentityMatrixThreeDifferentSizes() {
        //Given
        IdentityMatrixSolution identityMatrixSolution = new IdentityMatrixSolution();
        //When
        int[][] resultSizeOne = identityMatrixSolution.getIdentityMatrix(1);
        int[][] resultSizeThree = identityMatrixSolution.getIdentityMatrix(3);
        int[][] resultSizeFive = identityMatrixSolution.getIdentityMatrix(5);
        //Then
        Assert.assertArrayEquals(new int[][]{{1}}, resultSizeOne);
        Assert.assertArrayEquals(new int[][]{{1,0,0}, {0,1,0}, {0,0,1}}, resultSizeThree);
        Assert.assertArrayEquals(new int[][]{{1,0,0,0,0}, {0,1,0,0,0}, {0,0,1,0,0}, {0,0,0,1,0}, {0,0,0,0,1}},
                resultSizeFive);
    }

}
