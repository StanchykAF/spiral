package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        int number = 1, i = 0, j = 0;
        int flagToRight = columns, flagToLeft= 0, flagToDown = rows, flagToUp = 0;

        while (flagToRight > flagToLeft && flagToDown > flagToUp) {
            //if (flagToRight < flagToLeft || flagToDown < flagToUp) break;
            for (; j < flagToRight; j++) {
                matrix[i][j] = number++;
            }

            i++;
            flagToUp++;
            j--;

            if (flagToDown <= flagToUp) break;
            for (; i < flagToDown; i++) {
                matrix[i][j] = number++;
            }

            flagToRight--;
            i--;
            j--;

            if (flagToRight <= flagToLeft) break;
            for (; j>=flagToLeft; j--) {
                matrix[i][j] = number++;
            }

            flagToDown--;
            i--;
            j++;

            if (flagToDown <= flagToUp) break;
            for (; i >= flagToUp; i--) {
                matrix[i][j] = number++;
            }

            i++;
            j++;
            flagToLeft++;
        }
        return matrix;
    }
}
