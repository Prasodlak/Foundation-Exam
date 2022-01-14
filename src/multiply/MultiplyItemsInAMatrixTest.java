package multiply;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyItemsInAMatrixTest {

    @Test
    public void inputOK() {
        int[][] matrix = {
                {1, 3, 6, 2},
                {7, 5, 6, 1},
                {3, 3, 1, 5},
                {9, 0, 5, 3},
        };

        int multiply = MultiplyItemsInAMatrix.multiplyItems(matrix);

        assertEquals(matrix, multiply);
    }

    @Test
    public void inputNull() {
        int multiply = MultiplyItemsInAMatrix.multiplyItems(null);

        assertEquals(0.0, multiply);
    }

}