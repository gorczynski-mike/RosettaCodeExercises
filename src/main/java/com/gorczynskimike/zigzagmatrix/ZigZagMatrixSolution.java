package com.gorczynskimike.zigzagmatrix;

public class ZigZagMatrixSolution {

    public int[][] getZigZagMatrix(int size) {
        if (size < 1) {return null;}

        int[][] zigZagMatrix = new int[size][size];

        int step = 0;
        int x = 0;
        int y = 0;
        boolean positiveZig = true;
        while(step < size*size) {
            zigZagMatrix[y][x] = step;
            step ++;
            if(positiveZig) {
                x++;
                y--;
                if(x >= size) {
                    x--;
                    y = y + 2;
                    positiveZig = false;
                } else if (y < 0) {
                    y = 0;
                    positiveZig = false;
                }
            } else {
                x--;
                y++;
                if (y >= size) {
                    y--;
                    x = x + 2;
                    positiveZig = true;
                } else if (x < 0) {
                    x = 0;
                    positiveZig = true;
                }
            }
        }

        return zigZagMatrix;
    }

}
