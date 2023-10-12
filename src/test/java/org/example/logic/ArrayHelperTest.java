package org.example.logic;

import org.example.exceptions.MatrixSizeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayHelperTest {
    @Test
    void calcRowsSizeTest() {
        int[][] matrix1 = {{5, 2}, {2, 2}, {5, 5}};
        assertEquals(3, ArrayHelper.calcRowSize(matrix1));
    }
    @Test
    void calcColumnsSizeTest() {
        int[][] matrix1 = {{5, 2}, {2, 2}, {5, 5}};
        assertEquals(2, ArrayHelper.calcColumnsSize(matrix1));
    }
    @Test
    void swapRowsTest() {
        int[][] matrix1 = {{5, 2}, {2, 2}, {5, 5}};
        int[][] result = {{5, 2}, {5, 5}, {2, 2}};
        int[][] actualResult = ArrayHelper.swapRows(matrix1, 1, 2);
        assertArrayEquals(result, actualResult);
    }

    @Test
    void multiplyMatrix() throws MatrixSizeException {
        int[][] matrix1 = {{5, 2, -1}, {2, 2, 1}, {5, 5, 0}};
        int[][] matrix2 = {{1, 2, 5}, {2, 1, 5}, {5, 5, 1}};
        int[][] res = {{4, 7, 34}, {11, 11, 21}, {15, 15, 50}};
        assertArrayEquals(res, ArrayHelper.multiplyMatrices(matrix1, matrix2));

        int[][] m1 = {{1, 3}, {2, 3}, {2, 4}};
        int[][] m2 = {{1, 3}, {2, 3}, {2, 4}};
        assertThrows(MatrixSizeException.class, () -> ArrayHelper.multiplyMatrices(m1, m2));
    }
}