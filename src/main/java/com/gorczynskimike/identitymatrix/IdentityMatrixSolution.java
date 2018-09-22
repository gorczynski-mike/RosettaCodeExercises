package com.gorczynskimike.identitymatrix;

public class IdentityMatrixSolution {

    public int[][] getIdentityMatrix(int size) {
        if (size < 1) {return null;}

        int[][] identityMatrix = new int[size][size];
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                if (i == j) {
                    identityMatrix[i][j] = 1;
                } else {
                    identityMatrix[i][j] = 0;
                }
            }
        }

        return identityMatrix;
    }

}
